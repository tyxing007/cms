<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table border="0" width="100%" cellspacing="0" cellpadding="3px">
	<col align="right">
	<col width="100%">
	<tr>
		<td nowrap="nowrap">制卡类型</td>
		<td><ext:field property="cardType"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">接收数据日期备注</td>
		<td><ext:field property="receiveMark"/></td>
	</tr>
		<tr>
		<td nowrap="nowrap">移出卡片日期备注</td>
		<td><ext:field property="removedCardMark"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">制卡日期备注</td>
		<td><ext:field property="makeCardMark"/></td>
	</tr>
	<tr>
		<td nowrap="nowrap">创建时间</td>
		<td><ext:field property="created"/></td>
	</tr>
</table>