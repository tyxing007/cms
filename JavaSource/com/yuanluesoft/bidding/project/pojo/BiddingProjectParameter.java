package com.yuanluesoft.bidding.project.pojo;

import com.yuanluesoft.jeaf.database.Record;
import com.yuanluesoft.jeaf.util.ListUtils;


/**
 * 参数配置(bidding_project_parameter)
 * @author linchuan
 *
 */
public class BiddingProjectParameter extends Record {
	private String categories; //适用的工程分类列表,系统预设，如建安、市政
	private String procedures; //适用的招标内容列表,系统预设，如施工、监理、设计
	private String cities; //适用的地区列表
	private String biddingNumberFormat; //项目招标编号规则,<类别简称><分类简称>招 <年*4><序号*3>
	private String signUpNumberFormat; //投标报名号规则,<项目编号><随机数*5>
	private String noticeNumberFormat; //中标通知书编号规则,榕市建安交2009001
	private String declareNumberFormat; //项目报建编号规则
	private String declareReceiveNumberFormat; //项目收件编号规则
	private double biddingDocumentsPrice; //标书价格
	private int agentDrawDays; //代理抽签公告有效期,天
	private int agentResultDays; //中选代理公示有效期
	private int kcDays; //KC值公示有效期
	private int askDays; //提问有效期,默认为3天
	private int signUpDays; //报名有效期,从标书发布时间算起
	private int receveDays; //收标有效期,从标书发布时间算起
	private int bidopeningDays; //开标公示有效期
	private int pitchonDays; //中标公示有效期,默认为10天
	private int preapprovalDays; //预审公示有效期
	private int noticeDays; //中标通知时间
	private int archiveDays; //书面报告备案时间
	
	/**
	 * @return the categoryArray
	 */
	public String[] getCategoryArray() {
		return categories==null ? null : categories.split(",");
	}
	/**
	 * @param categoryArray the categoryArray to set
	 */
	public void setCategoryArray(String[] categoryArray) {
		this.categories = "," + ListUtils.join(categoryArray, ",", false) + ",";
	}
	/**
	 * @return the cityArray
	 */
	public String[] getCityArray() {
		return cities==null ? null : cities.split(",");
	}
	/**
	 * @param cityArray the cityArray to set
	 */
	public void setCityArray(String[] cityArray) {
		this.cities = "," + ListUtils.join(cityArray, ",", false) + ",";
	}
	/**
	 * @return the procedureArray
	 */
	public String[] getProcedureArray() {
		return procedures==null ? null : procedures.split(",");
	}
	/**
	 * @param procedureArray the procedureArray to set
	 */
	public void setProcedureArray(String[] procedureArray) {
		this.procedures = "," + ListUtils.join(procedureArray, ",", false) + ",";
	}
	
	/**
	 * 获取适用的工程分类列表
	 * @return
	 */
	public String getCategoriesText() {
		return categories==null || categories.equals("") ? null : categories.substring(1, categories.length() - 1);
	}
	
	/**
	 * 获取适用的招标内容列表
	 * @return
	 */
	public String getProceduresText() {
		return procedures==null || procedures.equals("") ? null : procedures.substring(1, procedures.length() - 1);
	}
	
	/**
	 * 获取适用的地区列表
	 * @return
	 */
	public String getCitiesText() {
		return cities==null || cities.equals("") ? null : cities.substring(1, cities.length() - 1);
	}
	
	/**
	 * @return the agentDrawDays
	 */
	public int getAgentDrawDays() {
		return agentDrawDays;
	}
	/**
	 * @param agentDrawDays the agentDrawDays to set
	 */
	public void setAgentDrawDays(int agentDrawDays) {
		this.agentDrawDays = agentDrawDays;
	}
	/**
	 * @return the agentResultDays
	 */
	public int getAgentResultDays() {
		return agentResultDays;
	}
	/**
	 * @param agentResultDays the agentResultDays to set
	 */
	public void setAgentResultDays(int agentResultDays) {
		this.agentResultDays = agentResultDays;
	}
	/**
	 * @return the askDays
	 */
	public int getAskDays() {
		return askDays;
	}
	/**
	 * @param askDays the askDays to set
	 */
	public void setAskDays(int askDays) {
		this.askDays = askDays;
	}
	/**
	 * @return the biddingDocumentsPrice
	 */
	public double getBiddingDocumentsPrice() {
		return biddingDocumentsPrice;
	}
	/**
	 * @param biddingDocumentsPrice the biddingDocumentsPrice to set
	 */
	public void setBiddingDocumentsPrice(double biddingDocumentsPrice) {
		this.biddingDocumentsPrice = biddingDocumentsPrice;
	}
	/**
	 * @return the biddingNumberFormat
	 */
	public String getBiddingNumberFormat() {
		return biddingNumberFormat;
	}
	/**
	 * @param biddingNumberFormat the biddingNumberFormat to set
	 */
	public void setBiddingNumberFormat(String biddingNumberFormat) {
		this.biddingNumberFormat = biddingNumberFormat;
	}
	/**
	 * @return the bidopeningDays
	 */
	public int getBidopeningDays() {
		return bidopeningDays;
	}
	/**
	 * @param bidopeningDays the bidopeningDays to set
	 */
	public void setBidopeningDays(int bidopeningDays) {
		this.bidopeningDays = bidopeningDays;
	}
	/**
	 * @return the categories
	 */
	public String getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(String categories) {
		this.categories = categories;
	}
	/**
	 * @return the declareNumberFormat
	 */
	public String getDeclareNumberFormat() {
		return declareNumberFormat;
	}
	/**
	 * @param declareNumberFormat the declareNumberFormat to set
	 */
	public void setDeclareNumberFormat(String declareNumberFormat) {
		this.declareNumberFormat = declareNumberFormat;
	}
	/**
	 * @return the declareReceiveNumberFormat
	 */
	public String getDeclareReceiveNumberFormat() {
		return declareReceiveNumberFormat;
	}
	/**
	 * @param declareReceiveNumberFormat the declareReceiveNumberFormat to set
	 */
	public void setDeclareReceiveNumberFormat(String declareReceiveNumberFormat) {
		this.declareReceiveNumberFormat = declareReceiveNumberFormat;
	}
	/**
	 * @return the kcDays
	 */
	public int getKcDays() {
		return kcDays;
	}
	/**
	 * @param kcDays the kcDays to set
	 */
	public void setKcDays(int kcDays) {
		this.kcDays = kcDays;
	}
	/**
	 * @return the noticeNumberFormat
	 */
	public String getNoticeNumberFormat() {
		return noticeNumberFormat;
	}
	/**
	 * @param noticeNumberFormat the noticeNumberFormat to set
	 */
	public void setNoticeNumberFormat(String noticeNumberFormat) {
		this.noticeNumberFormat = noticeNumberFormat;
	}
	/**
	 * @return the pitchonDays
	 */
	public int getPitchonDays() {
		return pitchonDays;
	}
	/**
	 * @param pitchonDays the pitchonDays to set
	 */
	public void setPitchonDays(int pitchonDays) {
		this.pitchonDays = pitchonDays;
	}
	/**
	 * @return the preapprovalDays
	 */
	public int getPreapprovalDays() {
		return preapprovalDays;
	}
	/**
	 * @param preapprovalDays the preapprovalDays to set
	 */
	public void setPreapprovalDays(int preapprovalDays) {
		this.preapprovalDays = preapprovalDays;
	}
	/**
	 * @return the procedures
	 */
	public String getProcedures() {
		return procedures;
	}
	/**
	 * @param procedures the procedures to set
	 */
	public void setProcedures(String procedures) {
		this.procedures = procedures;
	}
	/**
	 * @return the receveDays
	 */
	public int getReceveDays() {
		return receveDays;
	}
	/**
	 * @param receveDays the receveDays to set
	 */
	public void setReceveDays(int receveDays) {
		this.receveDays = receveDays;
	}
	/**
	 * @return the signUpDays
	 */
	public int getSignUpDays() {
		return signUpDays;
	}
	/**
	 * @param signUpDays the signUpDays to set
	 */
	public void setSignUpDays(int signUpDays) {
		this.signUpDays = signUpDays;
	}
	/**
	 * @return the signUpNumberFormat
	 */
	public String getSignUpNumberFormat() {
		return signUpNumberFormat;
	}
	/**
	 * @param signUpNumberFormat the signUpNumberFormat to set
	 */
	public void setSignUpNumberFormat(String signUpNumberFormat) {
		this.signUpNumberFormat = signUpNumberFormat;
	}
	/**
	 * @return the cities
	 */
	public String getCities() {
		return cities;
	}
	/**
	 * @param cities the cities to set
	 */
	public void setCities(String cities) {
		this.cities = cities;
	}

	/**
	 * @return the archiveDays
	 */
	public int getArchiveDays() {
		return archiveDays;
	}

	/**
	 * @param archiveDays the archiveDays to set
	 */
	public void setArchiveDays(int archiveDays) {
		this.archiveDays = archiveDays;
	}

	/**
	 * @return the noticeDays
	 */
	public int getNoticeDays() {
		return noticeDays;
	}

	/**
	 * @param noticeDays the noticeDays to set
	 */
	public void setNoticeDays(int noticeDays) {
		this.noticeDays = noticeDays;
	}
}
