package com.yuanluesoft.cms.templatemanage.forms;

import java.sql.Timestamp;
import java.util.Set;

import com.yuanluesoft.jeaf.form.ActionForm;

/**
 * 模板主题
 * @author linchuan
 *
 */
public class TemplateTheme extends ActionForm {
	private String name; //名称,如：节假日、手机
	private int type; //类型,电脑|0/智能手机或平板电脑|1/WAP|2
	private int pageWidth; //页面宽度,类型为“智能手机或平板电脑”时有效
	private int flashSupport; //是否含Flash,iphine、ipad不支持flash
	private Timestamp lastModified; //最后修改时间
	private long lastModifierId; //最后修改人ID
	private String lastModifier; //最后修改人姓名
	private Set usages; //使用记录
	private boolean isDefaultTheme; //是否默认主题
	private boolean isTemporaryOpening; //是否临时启用
	
	//扩展属性
	private String typeAsText;
	private int temporary; //设置默认模板选项: 0/设置默认,1/临时,-1/取消临时
	
	/**
	 * @return the flashSupport
	 */
	public int getFlashSupport() {
		return flashSupport;
	}
	/**
	 * @param flashSupport the flashSupport to set
	 */
	public void setFlashSupport(int flashSupport) {
		this.flashSupport = flashSupport;
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
	 * @return the lastModifier
	 */
	public String getLastModifier() {
		return lastModifier;
	}
	/**
	 * @param lastModifier the lastModifier to set
	 */
	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}
	/**
	 * @return the lastModifierId
	 */
	public long getLastModifierId() {
		return lastModifierId;
	}
	/**
	 * @param lastModifierId the lastModifierId to set
	 */
	public void setLastModifierId(long lastModifierId) {
		this.lastModifierId = lastModifierId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pageWidth
	 */
	public int getPageWidth() {
		return pageWidth;
	}
	/**
	 * @param pageWidth the pageWidth to set
	 */
	public void setPageWidth(int pageWidth) {
		this.pageWidth = pageWidth;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the typeAsText
	 */
	public String getTypeAsText() {
		return typeAsText;
	}
	/**
	 * @param typeAsText the typeAsText to set
	 */
	public void setTypeAsText(String typeAsText) {
		this.typeAsText = typeAsText;
	}
	/**
	 * @return the temporary
	 */
	public int getTemporary() {
		return temporary;
	}
	/**
	 * @param temporary the temporary to set
	 */
	public void setTemporary(int temporary) {
		this.temporary = temporary;
	}
	/**
	 * @return the isDefaultTheme
	 */
	public boolean isDefaultTheme() {
		return isDefaultTheme;
	}
	/**
	 * @param isDefaultTheme the isDefaultTheme to set
	 */
	public void setDefaultTheme(boolean isDefaultTheme) {
		this.isDefaultTheme = isDefaultTheme;
	}
	/**
	 * @return the isTemporaryOpening
	 */
	public boolean isTemporaryOpening() {
		return isTemporaryOpening;
	}
	/**
	 * @param isTemporaryOpening the isTemporaryOpening to set
	 */
	public void setTemporaryOpening(boolean isTemporaryOpening) {
		this.isTemporaryOpening = isTemporaryOpening;
	}
	/**
	 * @return the usages
	 */
	public Set getUsages() {
		return usages;
	}
	/**
	 * @param usages the usages to set
	 */
	public void setUsages(Set usages) {
		this.usages = usages;
	}
}