package com.yuanluesoft.cms.interview.actions.admin.interviewsubject.interviewimage;

import javax.servlet.http.HttpServletRequest;

import com.yuanluesoft.cms.interview.actions.admin.interviewsubject.InterviewSubjectAction;
import com.yuanluesoft.cms.interview.forms.admin.InterviewImage;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.util.DateTimeUtils;

/**
 * 
 * @author linchuan
 *
 */
public class InterviewImageAction extends InterviewSubjectAction {

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#saveComponent(com.yuanluesoft.jeaf.form.ActionForm, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, javax.servlet.http.HttpServletRequest)
	 */
	public void saveComponentRecord(ActionForm form, Record mainRecord, Record component, String componentName, String foreignKeyProperty, SessionInfo sessionInfo, HttpServletRequest request) throws Exception {
		InterviewImage imageForm = (InterviewImage)form;
		if("createComponent".equals(form.getAct())) { //新纪录
			imageForm.getInterviewImage().setCreated(DateTimeUtils.now());
			imageForm.getInterviewImage().setCreator(sessionInfo.getUserName());
			imageForm.getInterviewImage().setCreatorId(sessionInfo.getUserId());
		}
		super.saveComponentRecord(form, mainRecord, component, componentName, foreignKeyProperty, sessionInfo, request);
	}
}