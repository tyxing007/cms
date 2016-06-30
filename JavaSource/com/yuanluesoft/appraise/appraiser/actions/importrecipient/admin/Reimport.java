package com.yuanluesoft.appraise.appraiser.actions.importrecipient.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.appraise.appraiser.pojo.AppraiserImport;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;

/**
 * 重新导入
 * @author linchuan
 *
 */
public class Reimport extends ImportRecipientAction {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return executeSaveAction(mapping, form, request, response, true, "recipients", null, null);
    }

	/* (non-Javadoc)
	 * @see com.yuanluesoft.appraise.appraiser.actions.importrecipient.admin.ImportRecipientAction#saveRecord(com.yuanluesoft.jeaf.form.ActionForm, com.yuanluesoft.jeaf.database.Record, java.lang.String, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public Record saveRecord(com.yuanluesoft.jeaf.form.ActionForm form, Record record, String openMode, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		AppraiserImport appraiserImport = (AppraiserImport)record;
		List appraisers = doImport(form, sessionInfo); //导入评议员
		appraiserImport.setApproverCount(appraisers==null ? 0 : appraisers.size());
		return super.saveRecord(form, record, openMode, request, response, sessionInfo);
	}
}