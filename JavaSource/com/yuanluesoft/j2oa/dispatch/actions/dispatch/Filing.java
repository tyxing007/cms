package com.yuanluesoft.j2oa.dispatch.actions.dispatch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.j2oa.dispatch.forms.Dispatch;
import com.yuanluesoft.j2oa.dispatch.service.DispatchService;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.util.DateTimeUtils;
import com.yuanluesoft.jeaf.workflow.form.WorkflowForm;

/**
 * 
 * @author linchuan
 *
 */
public class Filing extends Run {
    
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return  executeRunAction(mapping, form, request, response, true, "归档完成！", null);
    }
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.workflowform.actions.WorkflowAction#beforeWorkitemCompleted(com.yuanluesoft.jeaf.form.workflowform.WorkflowForm, java.lang.Object, java.lang.String, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, javax.servlet.http.HttpServletRequest)
	 */
	protected void beforeWorkitemCompleted(WorkflowForm workflowForm, boolean workflowInstanceWillComplete, boolean isReverse, Record record, String openMode, SessionInfo sessionInfo, HttpServletRequest request) throws Exception {
		super.beforeWorkitemCompleted(workflowForm, workflowInstanceWillComplete, isReverse, record, openMode, sessionInfo, request);
		Dispatch formDispatch = (Dispatch)workflowForm;
		com.yuanluesoft.j2oa.dispatch.pojo.Dispatch dispatch = (com.yuanluesoft.j2oa.dispatch.pojo.Dispatch)record;
		//获取发文服务
		DispatchService dispatchService = (DispatchService)getService("dispatchService");
		//归档
		dispatchService.filing(dispatch, formDispatch.getFilingConfig(), formDispatch.getFilingOption(), sessionInfo.getUserId(), sessionInfo.getUserName());
		dispatch.setFilingTime(DateTimeUtils.now());
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.yuanluesoft.j2oa.dispatch.actions.dispatch.DispatchAction#saveRecord(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, java.lang.Object, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, java.lang.String)
	 */
	public Record saveRecord(com.yuanluesoft.jeaf.form.ActionForm form, Record record, String openMode, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		super.saveRecord(form, record, openMode, request, response, sessionInfo);
		//TODO: 当归档操作不是流程发送操作时,通知工作流服务器,已完成归档操作
		//Dispatch formDispatch = (Dispatch)form;
		//completeAction(formDispatch.getWorkflowInstanceId(), workItemId, "填写" + formDispatch.getOpinionPackage().getOpinionType() + "意见");
		return record;
	}
}