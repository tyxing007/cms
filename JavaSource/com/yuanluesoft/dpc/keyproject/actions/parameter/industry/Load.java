package com.yuanluesoft.dpc.keyproject.actions.parameter.industry;

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
public class Load extends IndustryAction {
	
	 public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		 return executeLoadComponentAction(mapping, form, "industry", request, response);
	 }
}