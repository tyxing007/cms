package com.yuanluesoft.job.company.actions.mailtemplate;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.form.actions.FormAction;
import com.yuanluesoft.jeaf.form.model.Form;
import com.yuanluesoft.jeaf.security.service.AccessControlService;
import com.yuanluesoft.jeaf.security.service.RecordControlService;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;
import com.yuanluesoft.job.company.forms.MailTemplate;
import com.yuanluesoft.job.company.pojo.JobCompanyMailTemplate;
import com.yuanluesoft.job.company.service.JobParameterService;

/**
 * 
 * @author linchuan
 *
 */
public class MailTemplateAction extends FormAction {

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#checkLoadPrivilege(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.database.Record, java.lang.String, java.util.List, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public char checkLoadPrivilege(ActionForm form, HttpServletRequest request, Record record, String openMode, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		MailTemplate mailTemplateForm = (MailTemplate)form;
		if(mailTemplateForm.getCompanyId()==0) {
			if(acl.contains(AccessControlService.ACL_APPLICATION_MANAGER)) {
				return RecordControlService.ACCESS_LEVEL_EDITABLE;
			}
		}
		else {
			if(sessionInfo.getUnitId()==mailTemplateForm.getCompanyId()) {
				return RecordControlService.ACCESS_LEVEL_EDITABLE;
			}
		}
		throw new PrivilegeException();
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#loadRecord(com.yuanluesoft.jeaf.form.ActionForm, com.yuanluesoft.jeaf.form.model.Form, long, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, javax.servlet.http.HttpServletRequest)
	 */
	public Record loadRecord(ActionForm form, Form formDefine, long id, SessionInfo sessionInfo, HttpServletRequest request) throws Exception {
		JobParameterService jobParameterService = (JobParameterService)getService("jobParameterService");
		MailTemplate mailTemplateForm = (MailTemplate)form;
		return jobParameterService.getMailTemplateByCompanyId(mailTemplateForm.getCompanyId());
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#initForm(com.yuanluesoft.jeaf.form.ActionForm, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void initForm(ActionForm form, List acl, SessionInfo sessionInfo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		super.initForm(form, acl, sessionInfo, request, response);
		MailTemplate mailTemplateForm = (MailTemplate)form;
		if(mailTemplateForm.getCompanyId()>0) {
			JobParameterService jobParameterService = (JobParameterService)getService("jobParameterService");
			JobCompanyMailTemplate mailTemplate = jobParameterService.getMailTemplateByCompanyId(0);
			if(mailTemplate!=null) {
				mailTemplateForm.setInvitationMailSubject(mailTemplate.getInvitationMailSubject()); //面试邀请函邮件标题
				mailTemplateForm.setInvitationMailTemplate(mailTemplate.getInvitationMailTemplate()); //面试邀请函邮件模板
				mailTemplateForm.setOfferMailSubject(mailTemplate.getOfferMailSubject()); //录用通知书邮件标题
				mailTemplateForm.setOfferMailTemplate(mailTemplate.getOfferMailTemplate()); //录用通知书邮件模板
			}
		}
	}
}