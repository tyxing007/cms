<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table  width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col valign="middle" width="100%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">分类名称</td>
		<td class="tdcontent"><ext:field property="directoryName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">上级机构</td>
		<td class="tdcontent" nowrap="nowrap">
			<ext:equal value="true" property="changeParentDirectoryDisabled">
				<ext:field writeonly="true" property="parentDirectoryName"/>
			</ext:equal>
			<ext:equal value="false" property="changeParentDirectoryDisabled">
				<ext:field property="parentDirectoryName"/>
			</ext:equal>
		</td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">分类成员</td>
		<td class="tdcontent"><ext:field property="linkedDirectoryNames"/></td>
	</tr>
	<jsp:include page="/jeaf/directorymanage/popedomConfigEdit.jsp"/>
	<tr>
		<td class="tdtitle" nowrap="nowrap">注册人</td>
		<td class="tdcontent"><ext:field property="creator"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">注册时间</td>
		<td class="tdcontent"><ext:field property="created"/></td>
	</tr>
</table>