package com.yuanluesoft.dpc.keyproject.actions.project.investcomplete;

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
public class Save extends InvestCompleteAction {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return executeSaveComponentAction(mapping, form, "investComplete", "investCompletes", "projectId", "refreshProject", false, request, response);
	}
}