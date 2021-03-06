/*
 * Created on 2005-5-24
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.yuanluesoft.webmail.forms;

import java.sql.Timestamp;
import java.util.Set;

import com.yuanluesoft.jeaf.form.ActionForm;

/**
 * 
 * @author root
 * 
 */
public class Mail extends ActionForm {
	private long userId; //邮件用户ID
	private long mailboxId; //邮箱ID
	private String mailIdOnServer; //在邮件服务器中的ID
	private float newMail; //是否新邮件
	private String mailFrom; //邮件发送人
	private String mailTo; //邮件接收人
	private String mailCc; //抄送
	private String mailBcc; //密送
	private String replyTo; //回复
	private String subject; //主题
	private Timestamp receiveDate; //接收时间
	private String priority; //优先级
	private long size; //大小
	private char hasAttachment = '0'; //是否有附件
	private Timestamp lastModified; //最后修改时间

	private Set mailBodies; //正文列表
	private Set mailAttachments; //附件列表
    
  	private String htmlBody; //html类型正文

	/**
	 * @return the hasAttachment
	 */
	public char getHasAttachment() {
		return hasAttachment;
	}

	/**
	 * @param hasAttachment the hasAttachment to set
	 */
	public void setHasAttachment(char hasAttachment) {
		this.hasAttachment = hasAttachment;
	}

	/**
	 * @return the htmlBody
	 */
	public String getHtmlBody() {
		return htmlBody;
	}

	/**
	 * @param htmlBody the htmlBody to set
	 */
	public void setHtmlBody(String htmlBody) {
		this.htmlBody = htmlBody;
	}

	/**
	 * @return the lastModified
	 */
	public Timestamp getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * @return the mailAttachments
	 */
	public Set getMailAttachments() {
		return mailAttachments;
	}

	/**
	 * @param mailAttachments the mailAttachments to set
	 */
	public void setMailAttachments(Set mailAttachments) {
		this.mailAttachments = mailAttachments;
	}

	/**
	 * @return the mailBcc
	 */
	public String getMailBcc() {
		return mailBcc;
	}

	/**
	 * @param mailBcc the mailBcc to set
	 */
	public void setMailBcc(String mailBcc) {
		this.mailBcc = mailBcc;
	}

	/**
	 * @return the mailBodies
	 */
	public Set getMailBodies() {
		return mailBodies;
	}

	/**
	 * @param mailBodies the mailBodies to set
	 */
	public void setMailBodies(Set mailBodies) {
		this.mailBodies = mailBodies;
	}

	/**
	 * @return the mailboxId
	 */
	public long getMailboxId() {
		return mailboxId;
	}

	/**
	 * @param mailboxId the mailboxId to set
	 */
	public void setMailboxId(long mailboxId) {
		this.mailboxId = mailboxId;
	}

	/**
	 * @return the mailCc
	 */
	public String getMailCc() {
		return mailCc;
	}

	/**
	 * @param mailCc the mailCc to set
	 */
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
	}

	/**
	 * @return the mailFrom
	 */
	public String getMailFrom() {
		return mailFrom;
	}

	/**
	 * @param mailFrom the mailFrom to set
	 */
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	/**
	 * @return the mailIdOnServer
	 */
	public String getMailIdOnServer() {
		return mailIdOnServer;
	}

	/**
	 * @param mailIdOnServer the mailIdOnServer to set
	 */
	public void setMailIdOnServer(String mailIdOnServer) {
		this.mailIdOnServer = mailIdOnServer;
	}

	/**
	 * @return the mailTo
	 */
	public String getMailTo() {
		return mailTo;
	}

	/**
	 * @param mailTo the mailTo to set
	 */
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	/**
	 * @return the newMail
	 */
	public float getNewMail() {
		return newMail;
	}

	/**
	 * @param newMail the newMail to set
	 */
	public void setNewMail(float newMail) {
		this.newMail = newMail;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	/**
	 * @return the receiveDate
	 */
	public Timestamp getReceiveDate() {
		return receiveDate;
	}

	/**
	 * @param receiveDate the receiveDate to set
	 */
	public void setReceiveDate(Timestamp receiveDate) {
		this.receiveDate = receiveDate;
	}

	/**
	 * @return the replyTo
	 */
	public String getReplyTo() {
		return replyTo;
	}

	/**
	 * @param replyTo the replyTo to set
	 */
	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(long size) {
		this.size = size;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}