package com.yuanluesoft.dpc.keyproject.actions.parameter.developmentareacategory;

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
public class Delete extends DevelopmentAreaCategoryAction {
	
	 public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		 return executeDeleteComponentAction(mapping, form, "developmentAreaCategory", "developmentAreaCategories", "refreshParameter", request, response);
	 }
}