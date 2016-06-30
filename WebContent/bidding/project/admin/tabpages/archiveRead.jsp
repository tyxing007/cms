<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<%	String previousCategory = null;%>
<table valign="middle" width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col width="50px">
	<col>
	<col width="80px">
	<tr align="center">
		<td class="tdtitle" nowrap="nowrap">序号</td>
		<td class="tdtitle" nowrap="nowrap">内容</td>
		<td class="tdtitle" nowrap="nowrap">是否提交</td>
	</tr>
	<ext:iterate id="archiveFile" indexId="archiveFileIndex" property="archiveFiles">
<%		com.yuanluesoft.bidding.project.pojo.BiddingProjectFileItem file = (com.yuanluesoft.bidding.project.pojo.BiddingProjectFileItem)pageContext.getAttribute("archiveFile");
		if(file.getFileCategory()!=null && !file.getFileCategory().equals("") && !file.getFileCategory().equals(previousCategory)) {
			previousCategory = file.getFileCategory();%>
			<tr>
				<td class="tdtitle" colspan="3"><b><ext:write name="archiveFile" property="fileCategory"/></b></td>
			</tr>
<%		}%>
		<tr>
			<td class="tdtitle" align="center"><ext:write name="archiveFile" property="sn" format="#.#########"/></td>
			<td class="tdtitle" nowrap="nowrap"><ext:write name="archiveFile" property="name"/></td>
			<td class="tdcontent" align="center">
				<html:multibox property="archive.submittedFiles" disabled="true" styleClass="checkbox"><ext:write name="archiveFile" property="name"/></html:multibox>
			</td>
		</tr>
	</ext:iterate>
</table>