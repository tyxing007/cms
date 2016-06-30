package com.yuanluesoft.telex.receive.plain.actions.receiveplaintelegram;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.util.DateTimeUtils;
import com.yuanluesoft.telex.receive.base.model.TelegramSignPerson;
import com.yuanluesoft.telex.receive.base.service.ReceiveTelegramService;
import com.yuanluesoft.telex.receive.plain.forms.ReceivePlainTelegram;

/**
 * 
 * @author linchuan
 *
 */
public class DoSign extends ReceivePlainTelegramAction {
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return executeSaveAction(mapping, form, request, response, true, "sign", null, null);
    }

	/* (non-Javadoc)
	 * @see com.yuanluesoft.telex.receive.base.actions.receivetelegram.ReceiveTelegramAction#saveRecord(com.yuanluesoft.jeaf.form.ActionForm, com.yuanluesoft.jeaf.database.Record, java.lang.String, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public Record saveRecord(com.yuanluesoft.jeaf.form.ActionForm form, Record record, String openMode, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		record = super.saveRecord(form, record, openMode, request, response, sessionInfo);
		ReceivePlainTelegram receiveTelegramForm = (ReceivePlainTelegram)form;
		//签收
		ReceiveTelegramService receiveTelegramService = (ReceiveTelegramService)getService("receiveTelegramService");
		TelegramSignPerson signPerson = new TelegramSignPerson();
		signPerson.setAgent(receiveTelegramForm.isAgentSign());
		signPerson.setPersonId(receiveTelegramForm.getSignPersonId());
		signPerson.setPersonName(receiveTelegramForm.getSignPersonName());
		receiveTelegramService.signTelegrams(signPerson, "" + receiveTelegramForm.getSignId(), (receiveTelegramForm.getSignTime()==null ? DateTimeUtils.now() : receiveTelegramForm.getSignTime()), sessionInfo);
		
		//请空表单
		receiveTelegramForm.setSignId(0);
		receiveTelegramForm.setSignPersonId(0);
		receiveTelegramForm.setSignPersonName(null);
		receiveTelegramForm.setSignTime(null);
		return record;
	}
}