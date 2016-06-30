package com.yuanluesoft.educ.student.actions.admin.excelimport;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yuanluesoft.cms.publicservice.actions.PublicServiceAdminAction;
import com.yuanluesoft.educ.student.forms.admin.ImportDateExcel;
import com.yuanluesoft.educ.student.service.spring.StudentImportServiceImpl;
import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.exception.PrivilegeException;
import com.yuanluesoft.jeaf.exception.ValidateException;
import com.yuanluesoft.jeaf.form.ActionForm;
import com.yuanluesoft.jeaf.security.service.RecordControlService;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;
import com.yuanluesoft.jeaf.workflow.form.WorkflowForm;

public class ImportDataAction extends PublicServiceAdminAction {

	
	public String getWorkflowActionName(WorkflowForm workflowForm) {
		// TODO 自动生成方法存根
		return null;
	}
	public char checkLoadPrivilege(ActionForm form, HttpServletRequest request, Record record, String openMode, List acl, SessionInfo sessionInfo) throws PrivilegeException, SystemUnregistException {
		return RecordControlService.ACCESS_LEVEL_EDITABLE;
	}
public static void main(String[] args) {
	
}
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.form.actions.FormAction#saveRecord(com.yuanluesoft.jeaf.form.ActionForm, javax.servlet.http.HttpServletRequest, com.yuanluesoft.jeaf.database.Record, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo, java.lang.String)
	 */
	public Record saveRecord(ActionForm form, Record record, String openMode,HttpServletRequest request, HttpServletResponse response,SessionInfo sessionInfo) throws Exception {

		StudentImportServiceImpl dataImportService = (StudentImportServiceImpl) getService("studentImportServiceImpl");	//直接导入类不就可以了，为什么还要这一步。
		ImportDateExcel importDataForm = (ImportDateExcel) form;
		try {
			dataImportService.importData(importDataForm,sessionInfo);
		} catch (Exception e) {
			if (e.getMessage() != null) {
				importDataForm.setError(e.getMessage());
				throw new ValidateException();
			}
		}
		
		
		return null;
	}
}
