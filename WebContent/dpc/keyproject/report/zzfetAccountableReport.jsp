<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<ext:form action="/writeZzfetAccountableReport" target="_blank" method="get">
	<table border="0" cellpadding="3" cellspacing="3" style="color:#000000" width="100%">
		<col align="right">
		<col width="100%">
		<tr>
			<td nowrap>年度：</td>
			<td><ext:field property="year"/></td>
		</tr>
		<tr>
			<td nowrap>月份：</td>
			<td><ext:field property="month"/></td>
		</tr>
		<tr>
			<td nowrap>开发区：</td>
			<td><ext:field property="developmentArea"/></td>
		</tr>
	</table>
</ext:form>