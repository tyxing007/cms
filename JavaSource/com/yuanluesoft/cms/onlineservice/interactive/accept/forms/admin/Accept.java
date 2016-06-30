package com.yuanluesoft.cms.onlineservice.interactive.accept.forms.admin;

import java.sql.Timestamp;
import java.util.Set;

import com.yuanluesoft.cms.onlineservice.interactive.accept.pojo.OnlineServiceAcceptMissing;
import com.yuanluesoft.cms.onlineservice.interactive.forms.OnlineServiceInteractiveForm;

/**
 * 
 * @author linchuan
 *
 */
public class Accept extends OnlineServiceInteractiveForm {
	//漳州商务局代报时使用
	private long memberId;//申报人ID
	private String member;//申报人
	private long agentorId;//代理人
	private String agentor;//代理人
	
	private char creatorType = '0'; //申报人类型,0/个人,1/企业
	private long creatorId; //创建人ID,网上注册用户ID
	private long itemId; //办理事项ID
	private String itemName; //办理事项名称
	private int caseNumber; //受理件数,默认是1，集体受理时允许大于1
	private char caseAccept = '0'; //是否受理
	private String caseDeclinedReason; //不受理原因
	private String subNo; //子编号,用于漳州行政服务中心
	private Timestamp caseAcceptTime; //受理时间
	private Timestamp caseLimitTime; //受理截止时间
	private Timestamp caseCompleteTime; //办结时间
	private Timestamp pickupTime; //取件时间
	private double price; //价格
	private String businessLicence; //营业执照号码
	private String legalRepresentative; //法定代表人
	private String linkman; //联系人,申报人为企业时有效
	private String acceptStatus; //办理状态,用于导入的数据
	private Set missings; //缺件通知列表
	
	private String pageName; //页面切换
	
	private OnlineServiceAcceptMissing missing = new OnlineServiceAcceptMissing(); //缺件通知
	
	private String workflowStatus; //流程状态
	
	/**
	 * @return the caseAccept
	 */
	public char getCaseAccept() {
		return caseAccept;
	}
	/**
	 * @param caseAccept the caseAccept to set
	 */
	public void setCaseAccept(char caseAccept) {
		this.caseAccept = caseAccept;
	}
	/**
	 * @return the caseDeclinedReason
	 */
	public String getCaseDeclinedReason() {
		return caseDeclinedReason;
	}
	/**
	 * @param caseDeclinedReason the caseDeclinedReason to set
	 */
	public void setCaseDeclinedReason(String caseDeclinedReason) {
		this.caseDeclinedReason = caseDeclinedReason;
	}
	/**
	 * @return the missings
	 */
	public Set getMissings() {
		return missings;
	}
	/**
	 * @param missings the missings to set
	 */
	public void setMissings(Set missings) {
		this.missings = missings;
	}
	/**
	 * @return the pageName
	 */
	public String getPageName() {
		return pageName;
	}
	/**
	 * @param pageName the pageName to set
	 */
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	/**
	 * @return the missing
	 */
	public OnlineServiceAcceptMissing getMissing() {
		return missing;
	}
	/**
	 * @param missing the missing to set
	 */
	public void setMissing(OnlineServiceAcceptMissing missing) {
		this.missing = missing;
	}
	/**
	 * @return the workflowStatus
	 */
	public String getWorkflowStatus() {
		return workflowStatus;
	}
	/**
	 * @param workflowStatus the workflowStatus to set
	 */
	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}
	/**
	 * @return the caseAcceptTime
	 */
	public Timestamp getCaseAcceptTime() {
		return caseAcceptTime;
	}
	/**
	 * @param caseAcceptTime the caseAcceptTime to set
	 */
	public void setCaseAcceptTime(Timestamp caseAcceptTime) {
		this.caseAcceptTime = caseAcceptTime;
	}
	/**
	 * @return the caseNumber
	 */
	public int getCaseNumber() {
		return caseNumber;
	}
	/**
	 * @param caseNumber the caseNumber to set
	 */
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	/**
	 * @return the acceptStatus
	 */
	public String getAcceptStatus() {
		return acceptStatus;
	}
	/**
	 * @param acceptStatus the acceptStatus to set
	 */
	public void setAcceptStatus(String acceptStatus) {
		this.acceptStatus = acceptStatus;
	}
	/**
	 * @return the creatorId
	 */
	public long getCreatorId() {
		return creatorId;
	}
	/**
	 * @param creatorId the creatorId to set
	 */
	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}
	/**
	 * @return the subNo
	 */
	public String getSubNo() {
		return subNo;
	}
	/**
	 * @param subNo the subNo to set
	 */
	public void setSubNo(String subNo) {
		this.subNo = subNo;
	}
	/**
	 * @return the businessLicence
	 */
	public String getBusinessLicence() {
		return businessLicence;
	}
	/**
	 * @param businessLicence the businessLicence to set
	 */
	public void setBusinessLicence(String businessLicence) {
		this.businessLicence = businessLicence;
	}
	/**
	 * @return the caseCompleteTime
	 */
	public Timestamp getCaseCompleteTime() {
		return caseCompleteTime;
	}
	/**
	 * @param caseCompleteTime the caseCompleteTime to set
	 */
	public void setCaseCompleteTime(Timestamp caseCompleteTime) {
		this.caseCompleteTime = caseCompleteTime;
	}
	/**
	 * @return the caseLimitTime
	 */
	public Timestamp getCaseLimitTime() {
		return caseLimitTime;
	}
	/**
	 * @param caseLimitTime the caseLimitTime to set
	 */
	public void setCaseLimitTime(Timestamp caseLimitTime) {
		this.caseLimitTime = caseLimitTime;
	}
	/**
	 * @return the creatorType
	 */
	public char getCreatorType() {
		return creatorType;
	}
	/**
	 * @param creatorType the creatorType to set
	 */
	public void setCreatorType(char creatorType) {
		this.creatorType = creatorType;
	}
	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the legalRepresentative
	 */
	public String getLegalRepresentative() {
		return legalRepresentative;
	}
	/**
	 * @param legalRepresentative the legalRepresentative to set
	 */
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}
	/**
	 * @return the linkman
	 */
	public String getLinkman() {
		return linkman;
	}
	/**
	 * @param linkman the linkman to set
	 */
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	/**
	 * @return the pickupTime
	 */
	public Timestamp getPickupTime() {
		return pickupTime;
	}
	/**
	 * @param pickupTime the pickupTime to set
	 */
	public void setPickupTime(Timestamp pickupTime) {
		this.pickupTime = pickupTime;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getAgentor() {
		return agentor;
	}
	public void setAgentor(String agentor) {
		this.agentor = agentor;
	}
	public long getAgentorId() {
		return agentorId;
	}
	public void setAgentorId(long agentorId) {
		this.agentorId = agentorId;
	}
	
	
	
	
}