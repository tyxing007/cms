<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table valign="middle" width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col width="100%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">竣工时间</td>
		<td class="tdcontent"><ext:field writeonly="true" property="completion.completeDate"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">备注</td>
		<td class="tdcontent"><ext:field writeonly="true" property="completion.remark"/></td>
	</tr>
</table>