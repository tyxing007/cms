package com.yuanluesoft.cms.infopublic.request.actions.personalrequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * 
 * @author linchuan
 *
 */
public class Save extends PersonalRequestAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return executeSubmitAction(mapping, form, request, response);
    }
}