package com.yuanluesoft.cms.inquiry.actions.inquiryoption;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.cms.pagebuilder.PageService;
import com.yuanluesoft.jeaf.action.BaseAction;

/**
 * 
 * @author lmiky
 * 
 */
public class Load extends BaseAction {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		PageService pageService = (PageService)getService("pageService");
    	pageService.writePage("cms/inquiry", "inquiryOption", request, response, false);
    	return null;
    }
}