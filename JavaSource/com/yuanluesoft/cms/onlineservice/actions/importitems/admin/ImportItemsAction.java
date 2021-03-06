package com.yuanluesoft.cms.onlineservice.actions.importitems.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanluesoft.cms.onlineservice.service.OnlineServiceItemService;
import com.yuanluesoft.jeaf.attachmentmanage.service.AttachmentService;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.exception.ServiceException;
import com.yuanluesoft.jeaf.exception.ValidateException;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.form.actions.FormAction;
import com.yuanluesoft.jeaf.security.service.AccessControlService;
import com.yuanluesoft.jeaf.security.service.RecordControlService;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;
import com.yuanluesoft.jeaf.util.ListUtils;

/**
 * 
 * @author linchuan
 *
 */
public class ImportItemsAction extends FormAction {

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#checkLoadPrivilege(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.database.Record, java.lang.String, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public char checkLoadPrivilege(ActionForm form, HttpServletRequest request, Record record, String openMode, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		if(acl.contains(AccessControlService.ACL_APPLICATION_MANAGER) || acl.contains("manageUnit_importItems")) {
			return RecordControlService.ACCESS_LEVEL_EDITABLE;
		}
		throw new PrivilegeException();
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#saveRecord(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.database.Record, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, java.lang.String)
	 */
	public Record saveRecord(ActionForm form, Record record, String openMode, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		AttachmentService attachmentService = (AttachmentService)getService("attachmentService");
		OnlineServiceItemService onlineServiceItemService = (OnlineServiceItemService)getService("onlineServiceItemService");
		try {
			//获取上传的附件列表
			List attachments = attachmentService.list("cms/onlineservice", "files", form.getId(), false, 0, request);
			//导入
			onlineServiceItemService.importServiceItems(attachments);
			//删除附件
			attachmentService.deleteAll("cms/onlineservice", "files", form.getId());
		}
		catch(ServiceException se) {
			form.setErrors(ListUtils.generateList(se.getMessage()));
			throw new ValidateException();
		}
		return null;
	}
}