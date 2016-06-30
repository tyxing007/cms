package com.yuanluesoft.im.actions.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.cms.pagebuilder.PageService;
import com.yuanluesoft.jeaf.action.BaseAction;

/**
 * 
 * @author linchuan
 *
 */
public class Load extends BaseAction {
   
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PageService pageService = (PageService)getService("clientPageService");
        pageService.writePage("im", "login", request, response, false);
        return null;
    }
}