package com.yuanluesoft.j2oa.meeting.actions.meetingroom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * @author LinChuan
*
 */
public class Save extends MeetingRoomAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return executeSaveAction(mapping, form, request, response, false, null, null, null);
    }
}