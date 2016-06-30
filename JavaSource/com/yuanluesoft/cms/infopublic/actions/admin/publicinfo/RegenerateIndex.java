package com.yuanluesoft.cms.infopublic.actions.admin.publicinfo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.cms.infopublic.service.PublicDirectoryService;
import com.yuanluesoft.cms.infopublic.service.PublicInfoService;
import com.yuanluesoft.jeaf.dialog.actions.DialogFormAction;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;

/**
 * 重新生成索引号
 * @author linchuan
 *
 */
public class RegenerateIndex extends DialogFormAction {

    /* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.dialog.actions.DialogFormAction#checkLoadPrivilege(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public void checkLoadPrivilege(com.yuanluesoft.jeaf.form.ActionForm form, HttpServletRequest request, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
    	//检查用户是否目录管理员
    	PublicDirectoryService publicDirectoryService = (PublicDirectoryService)getService("publicDirectoryService");
    	com.yuanluesoft.cms.infopublic.forms.admin.RegenerateIndex regenerateIndexForm = (com.yuanluesoft.cms.infopublic.forms.admin.RegenerateIndex)form;
    	if(!publicDirectoryService.checkPopedom(regenerateIndexForm.getMainDirectoryId(), "manager", sessionInfo)) {
    		throw new PrivilegeException();
    	}
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.dialog.actions.DialogFormAction#initForm(com.yuanluesoft.jeaf.form.ActionForm, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, javax.servlet.http.HttpServletRequest)
	 */
	public void initForm(com.yuanluesoft.jeaf.form.ActionForm form, List acl, SessionInfo sessionInfo, HttpServletRequest request) throws Exception {
		super.initForm(form, acl, sessionInfo, request);
    	PublicInfoService publicInfoService = (PublicInfoService)getService("publicInfoService");
    	com.yuanluesoft.cms.infopublic.forms.admin.RegenerateIndex regenerateIndexForm = (com.yuanluesoft.cms.infopublic.forms.admin.RegenerateIndex)form;
        publicInfoService.regenerateIndex(regenerateIndexForm.getMainDirectoryId());
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
    	return executeLoadAction(mapping, form, request, response);
    }
}