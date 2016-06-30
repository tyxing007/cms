package com.yuanluesoft.jeaf.client.actions.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.jeaf.action.BaseAction;
import com.yuanluesoft.jeaf.client.pages.ClientMainPageService;

/**
 * 
 * @author linchuan
 *
 */
public class Load extends BaseAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	ClientMainPageService clientMainPageService = (ClientMainPageService)getService("clientMainPageService");
    	clientMainPageService.writePage("jeaf/client", "main", request, response, false);
    	return null;
    }
}