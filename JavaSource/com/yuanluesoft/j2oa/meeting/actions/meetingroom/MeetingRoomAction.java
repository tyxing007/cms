/*
 * Created on 2005-11-19
 *
 */
package com.yuanluesoft.j2oa.meeting.actions.meetingroom;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.yuanluesoft.jeaf.security.service.RecordControlService;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.form.actions.FormAction;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;

/**
 *
 * @author linchuan
 *
 */
public class MeetingRoomAction extends FormAction {
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#checkLoadPrivilege(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, java.lang.Object, java.lang.String, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public char checkLoadPrivilege(ActionForm form, HttpServletRequest request, Record record, String openMode, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		if(acl.contains("application_manager") || acl.contains("manageUnit_meetingRoomManage")) {
			return RecordControlService.ACCESS_LEVEL_EDITABLE;
		}
		throw new PrivilegeException();
	}
}
