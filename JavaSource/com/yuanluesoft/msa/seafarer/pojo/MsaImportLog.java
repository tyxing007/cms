package com.yuanluesoft.msa.seafarer.pojo;

import java.sql.Timestamp;

import com.yuanluesoft.jeaf.database.Record;

/**
 * 数据导入:导入日志(msa_import_log)
 * @author linchuan
 *
 */
public class MsaImportLog extends Record {
	private String dataType; //导入数据类型,培训机构、服务机构等
	private String fileName; //文件名
	private Timestamp importTime; //导入时间
	private long personId; //操作人ID
	private String personName; //操作人姓名
	private String remark; //备注
	
	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the importTime
	 */
	public Timestamp getImportTime() {
		return importTime;
	}
	/**
	 * @param importTime the importTime to set
	 */
	public void setImportTime(Timestamp importTime) {
		this.importTime = importTime;
	}
	/**
	 * @return the personId
	 */
	public long getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(long personId) {
		this.personId = personId;
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
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}