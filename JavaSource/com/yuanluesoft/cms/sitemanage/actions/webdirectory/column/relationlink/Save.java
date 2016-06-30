package com.yuanluesoft.cms.sitemanage.actions.webdirectory.column.relationlink;

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
public class Save extends RelationLinkAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return executeSaveComponentAction(mapping, form, "relationLink", "relationLinks", "columnId", "refreshColumn", false, request, response);
    }
}