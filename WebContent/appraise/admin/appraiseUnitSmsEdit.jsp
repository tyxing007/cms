<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table border="0" width="100%" cellspacing="0" cellpadding="3px">
	<col align="right">
	<col width="100%">
	<tr>
		<td nowrap="nowrap">地区：</td>
		<td><ext:field property="area"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">接收单位：</td>
		<td><ext:field property="unitNames"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap" valign="top">短信内容：</td>
		<td><ext:field property="smsContent"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">创建人：</td>
		<td><ext:field property="creator"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">创建时间：</td>
		<td><ext:field property="created"/></td>
	</tr>
</table>