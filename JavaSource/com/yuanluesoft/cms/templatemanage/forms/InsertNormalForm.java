package com.yuanluesoft.cms.templatemanage.forms;

import com.yuanluesoft.jeaf.form.ActionForm;


/**
 * 插入表单预置页面
 * @author linchuan
 *
 */
public class InsertNormalForm extends ActionForm {
	private String applicationName; //URL参数:应用名称
	private String formName; //URL参数:表单名称
	private int themeType; //URL参数:模板类型
	
	private String predefinedPage; //预置的页面
	

	/**
	 * @return the formName
	 */
	public String getFormName() {
		return formName;
	}

	/**
	 * @param formName the formName to set
	 */
	public void setFormName(String formName) {
		this.formName = formName;
	}

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return the predefinedPage
	 */
	public String getPredefinedPage() {
		return predefinedPage;
	}

	/**
	 * @param predefinedPage the predefinedPage to set
	 */
	public void setPredefinedPage(String predefinedPage) {
		this.predefinedPage = predefinedPage;
	}

	/**
	 * @return the themeType
	 */
	public int getThemeType() {
		return themeType;
	}

	/**
	 * @param themeType the themeType to set
	 */
	public void setThemeType(int themeType) {
		this.themeType = themeType;
	}
}