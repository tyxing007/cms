<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table width="100%"  border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col valign="middle" width="50%">
	<col>
	<col valign="middle" width="50%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">姓名</td>
		<td class="tdcontent"><ext:write property="name"/></td>
		<td class="tdtitle" nowrap="nowrap">登录用户名</td>
		<td class="tdcontent"><ext:write property="loginName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">性别</td>
		<td class="tdcontent" colspan="3">
			<ext:equal value="M" property="sex">男</ext:equal><ext:equal value="F" property="sex">女</ext:equal>
		</td>
	</tr>
</table>