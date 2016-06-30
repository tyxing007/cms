package com.yuanluesoft.cms.onlineservice.interactive.complaint.forms;


/**
 * 
 * @author linchuan
 *
 */
public class Complaint extends com.yuanluesoft.cms.onlineservice.interactive.complaint.forms.admin.Complaint {
	private long siteId; //站点ID
	private String directoryId; //网上办事目录ID

	/**
	 * @return the siteId
	 */
	public long getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}
	
	/**
	 * @return the directoryId
	 */
	public String getDirectoryId() {
		return directoryId;
	}

	/**
	 * @param directoryId the directoryId to set
	 */
	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
	}	
}