package com.yuanluesoft.cms.onlineservice.interactive.accept.actions.accept.admin.serialnumberconfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * @author kangshiwei
 *
 */
public class Save extends SerialNumberConfigAction {
    
	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward execute(ActionMapping mapping, org.apache.struts.action.ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return executeSaveAction(mapping, form, request, response, false, null, null, null);
	}
}