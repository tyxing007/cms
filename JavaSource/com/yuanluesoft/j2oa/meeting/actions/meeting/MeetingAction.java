/*
 * Created on 2005-11-19
 *
 */
package com.yuanluesoft.j2oa.meeting.actions.meeting;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanluesoft.j2oa.meeting.forms.Meeting;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.security.model.RecordVisitorList;
import com.yuanluesoft.jeaf.security.service.AccessControlService;
import com.yuanluesoft.jeaf.security.service.RecordControlService;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.stat.service.StatService;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;
import com.yuanluesoft.jeaf.workflow.actions.WorkflowAction;
import com.yuanluesoft.jeaf.workflow.form.WorkflowForm;

/**
 *
 * @author linchuan
 *
 */
public class MeetingAction extends WorkflowAction {

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.workflow.actions.WorkflowAction#getWorkflowActionName(com.yuanluesoft.jeaf.workflow.form.WorkflowForm)
	 */
	public String getWorkflowActionName(WorkflowForm workflowForm) {
		return "runMeeting";
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#getAcl(java.lang.String, org.apache.struts.action.ActionForm, com.yuanluesoft.jeaf.database.Record, java.lang.String, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public List getAcl(String applicationName, org.apache.struts.action.ActionForm form, Record record, String openMode, SessionInfo sessionInfo) throws Exception {
		List acl = super.getAcl(applicationName, form, record, openMode, sessionInfo);
		com.yuanluesoft.j2oa.meeting.pojo.Meeting pojoMeeting = (com.yuanluesoft.j2oa.meeting.pojo.Meeting)record;
		if(pojoMeeting!=null && pojoMeeting.getIssueTime()!=null && //已发布或者撤销发布
		  (acl.contains(AccessControlService.ACL_APPLICATION_MANAGER) || pojoMeeting.getHandlerId()==sessionInfo.getUserId())) { //当前用户是管理员,或者创建人
			acl.add(pojoMeeting.getIssued()=='1' ? "undoIssue" : "redoIssue");
		}
		return acl;
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.core.actions.form.FormAction#checkLoadPrivilege(com.yuanluesoft.jeaf.core.forms.ActionForm, java.lang.Object, java.lang.String, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public char checkLoadPrivilege(ActionForm form, HttpServletRequest request, Record record, String openMode, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		if(acl.contains("redoIssue") || acl.contains("undoIssue")) { //撤销发布或者重新发布
			return RecordControlService.ACCESS_LEVEL_EDITABLE;
		}
		return super.checkLoadPrivilege(form, request, record, openMode, acl, sessionInfo);
	}
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.workflow.actions.WorkflowAction#checkDeletePrivilege(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.database.Record, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public void checkDeletePrivilege(ActionForm form, HttpServletRequest request, Record record, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		if(acl.contains(AccessControlService.ACL_APPLICATION_MANAGER)) {
			return; //允许管理员删除
		}
		super.checkDeletePrivilege(form, request, record, acl, sessionInfo);
	}
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#loadResource(com.yuanluesoft.jeaf.form.ActionForm, java.lang.Object, java.util.List, char, boolean, java.lang.String, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public void loadResource(ActionForm form, Record record, List acl, char accessLevel, boolean deleteEnable, String openMode, HttpServletRequest request, SessionInfo sessionInfo) throws Exception {
		com.yuanluesoft.j2oa.meeting.pojo.Meeting pojoMeeting = (com.yuanluesoft.j2oa.meeting.pojo.Meeting)record;
		Meeting formMeeting = (Meeting)form;
		if(formMeeting!=null && formMeeting.getIssued()=='1') { //已发布
			formMeeting.setSubForm(SUBFORM_READ);
		}
		else if(acl.contains("redoIssue")) {
			formMeeting.setSubForm(SUBFORM_EDIT);
		}
		super.loadResource(form, record, acl, accessLevel, deleteEnable, openMode, request, sessionInfo);
		if(pojoMeeting!=null && pojoMeeting.getIssued()=='1' && accessLevel<RecordControlService.ACCESS_LEVEL_EDITABLE) { //已发布
			//不显示办理流程和意见
			form.getTabs().clear();
			form.getTabs().addTab(-1, "basic", "基本信息", "SUBFORM", true);
		}
	}
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.core.actions.form.FormAction#saveRecord(com.yuanluesoft.jeaf.core.forms.ActionForm, javax.servlet.http.HttpServletRequest, java.lang.Object, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, java.lang.String)
	 */
	public Record saveRecord(ActionForm form, Record record, String openMode, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		super.saveRecord(form, record, openMode, request, response, sessionInfo);
		com.yuanluesoft.j2oa.meeting.pojo.Meeting pojoMeeting = (com.yuanluesoft.j2oa.meeting.pojo.Meeting)record;
		//保存与会人员
		Meeting formMeeting = (Meeting)form;
		if(formMeeting.getAttendees().getVisitorIds()!=null) { //提交的内容中必须包含与会人员
			getRecordControlService().updateVisitors(pojoMeeting.getId(), com.yuanluesoft.j2oa.meeting.pojo.Meeting.class.getName(), formMeeting.getAttendees(), RecordControlService.ACCESS_LEVEL_PREREAD);
		}
		return record;
	}
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#fillForm(com.yuanluesoft.jeaf.form.forms.ActionForm, java.lang.Object, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public void fillForm(ActionForm form, Record record, char accessLevel, List acl, SessionInfo sessionInfo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.fillForm(form, record, accessLevel, acl, sessionInfo, request, response);
		Meeting formMeeting = (Meeting)form;
		com.yuanluesoft.j2oa.meeting.pojo.Meeting pojoMeeting = (com.yuanluesoft.j2oa.meeting.pojo.Meeting)record;
		//设置与会人员
		RecordVisitorList visitors = getRecordControlService().getVisitors(formMeeting.getId(), com.yuanluesoft.j2oa.meeting.pojo.Meeting.class.getName(), RecordControlService.ACCESS_LEVEL_PREREAD);
		if(visitors!=null && visitors.getVisitorNames()!=null && !visitors.getVisitorNames().equals("")) {
		    formMeeting.setAttendees(visitors);
		}
		StatService statService = (StatService)getService("statService");
		if(pojoMeeting.getIssued()=='1') { //已发布
			//记录访问者信息
			statService.access(form.getFormDefine().getApplicationName(), "meeting", pojoMeeting.getId(), sessionInfo.getUserId(), sessionInfo.getUserName());
		}
		//设置访问者列表
		formMeeting.setAccessVisitors(statService.listAccessUsers(form.getFormDefine().getApplicationName(), "meeting", pojoMeeting.getId()));
	}
}