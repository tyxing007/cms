package com.yuanluesoft.bidding.enterprise.actions.employee.admin;

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
public class Save extends EmployeeAction {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return executeSaveComponentAction(mapping, form, "employee", "employees", "enterpriseId", "refreshEnterprise", false, request, response);
	}
}