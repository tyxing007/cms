<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table border="0" width="100%" cellspacing="0" cellpadding="3px" style="table-layout:fixed">
	<col width="140px" align="right">
	<col width="100%">
	<tr>
		<td>年份：</td>
		<td><ext:field property="progress.progressYear"/></td>
	</tr>
	<tr>
		<td>月份：</td>
		<td><ext:field property="progress.progressMonth"/></td>
	</tr>
	<tr>
		<td valign="top">年初至报告期形象进度：</td>
		<td><ext:field property="progress.progress"/></td>
	</tr>
</table>
<script>
	document.getElementsByName("progress.completed")[0].value = "1";
</script>