package com.yuanluesoft.educ.student.actions.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.educ.student.forms.admin.StudentForm;


/**
 * 
 * @author ZYH
 *
 */
public class SelectAttachment extends StudentAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return executeAttachmentAction(mapping, form, request, response);
    }
}