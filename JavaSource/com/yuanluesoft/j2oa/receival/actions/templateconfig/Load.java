/*
 * Created on 2006-9-20
 *
 */
package com.yuanluesoft.j2oa.receival.actions.templateconfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author linchuan
 *
 */
public class Load extends ReceivalTemplateConfigAction {

	
	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public ActionForward execute(ActionMapping mapping, org.apache.struts.action.ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return executeLoadAction(mapping, form, request, response);
	}
}
