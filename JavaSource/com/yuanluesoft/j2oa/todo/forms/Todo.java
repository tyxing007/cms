package com.yuanluesoft.j2oa.todo.forms;

import java.sql.Timestamp;

import com.yuanluesoft.jeaf.form.ActionForm;

/**
 * 
 * @author LinChuan
*
 */
public class Todo extends ActionForm {
	private long personId; //用户ID
	private String personName; //用户名
	private String subject; //主题
	private String description; //描述
	private String category; //类别
	private String important; //重要性
	private char isHand = '0'; //是否交办事宜
	private char isSent = '0'; //是否已交办
	private Timestamp handTime; //交办时间
	private Timestamp beginTime; //开始时间
	private Timestamp endTime; //结束时间
	private char completed = '0'; //是否完成
	private Timestamp completeTime; //完成时间

	/**
	 * @return Returns the beginTime.
	 */
	public Timestamp getBeginTime() {
		return beginTime;
	}
	/**
	 * @param beginTime The beginTime to set.
	 */
	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
	}
	/**
	 * @return Returns the category.
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category The category to set.
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return Returns the completed.
	 */
	public char getCompleted() {
		return completed;
	}
	/**
	 * @param completed The completed to set.
	 */
	public void setCompleted(char completed) {
		this.completed = completed;
	}
	/**
	 * @return Returns the completeTime.
	 */
	public Timestamp getCompleteTime() {
		return completeTime;
	}
	/**
	 * @param completeTime The completeTime to set.
	 */
	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}
	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return Returns the endTime.
	 */
	public Timestamp getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime The endTime to set.
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return Returns the handTime.
	 */
	public Timestamp getHandTime() {
		return handTime;
	}
	/**
	 * @param handTime The handTime to set.
	 */
	public void setHandTime(Timestamp handTime) {
		this.handTime = handTime;
	}
	/**
	 * @return Returns the important.
	 */
	public String getImportant() {
		return important;
	}
	/**
	 * @param important The important to set.
	 */
	public void setImportant(String important) {
		this.important = important;
	}
	/**
	 * @return Returns the isHand.
	 */
	public char getIsHand() {
		return isHand;
	}
	/**
	 * @param isHand The isHand to set.
	 */
	public void setIsHand(char isHand) {
		this.isHand = isHand;
	}
	/**
	 * @return Returns the personId.
	 */
	public long getPersonId() {
		return personId;
	}
	/**
	 * @param personId The personId to set.
	 */
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	/**
	 * @return Returns the subject.
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject The subject to set.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the isSent
	 */
	public char getIsSent() {
		return isSent;
	}
	/**
	 * @param isSent the isSent to set
	 */
	public void setIsSent(char isSent) {
		this.isSent = isSent;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
}