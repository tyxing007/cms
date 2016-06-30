<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col valign="middle">
	<col valign="middle" width="50%">
	<col valign="middle">
	<col valign="middle" width="50%">
	<col valign="middle">
	<tr>
		<td class="tdtitle" nowrap="nowrap">姓名</td>
		<td class="tdcontent"><ext:field property="name"/></td>
		<td class="tdtitle" nowrap="nowrap">性别</td>
		<td class="tdcontent"><ext:field property="sex"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">身份证号码</td>
		<td class="tdcontent"><ext:field property="idcardNumber"/></td>
		<td class="tdtitle" nowrap="nowrap">民族</td>
		<td class="tdcontent"><ext:field property="nation"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">学号</td>
		<td class="tdcontent"><ext:field property="studentId"/></td>
		<td class="tdtitle" nowrap="nowrap">系部</td>
		<td class="tdcontent"><ext:field property="department"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">专业</td>
		<td class="tdcontent"><ext:field property="speciality"/></td>
		<td class="tdtitle" nowrap="nowrap">班级</td>
		<td class="tdcontent"><ext:field property="stuclass"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">年级</td>
		<td class="tdcontent"><ext:field property="grade"/></td>
		<td class="tdtitle" nowrap="nowrap">身份证地址</td>
		<td class="tdcontent"><ext:field property="idcardAddress"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">家庭地址</td>
		<td class="tdcontent"><ext:field property="houseAddress"/></td>
		<td class="tdtitle" nowrap="nowrap">联系电话</td>
		<td class="tdcontent"><ext:field property="phone"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">是否我们学院学生</td>
		<td class="tdcontent"><ext:field property="isOurStudent"/></td>
		<td class="tdtitle" nowrap="nowrap">账号</td>
		<td class="tdcontent"><ext:field property="loginId"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">密码</td>
		<td class="tdcontent"><ext:field property="password"/></td>
		<td class="tdtitle" nowrap="nowrap">备注</td>
		<td class="tdcontent"><ext:field property="remark"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">创建日期</td>
		<td class="tdcontent"><ext:field property="created"/></td>
		<td class="tdtitle" nowrap="nowrap">上传照片</td>
		<td class="tdcontent"><ext:field property="images"/></td>
	</tr>
	<ext:notEmpty property="alterDescription">
		<tr>
			<td class="tdtitle" valign="top">变更情况</td>
			<td class="tdcontent" colspan="3" style="color:red"><pre><ext:field property="alterDescription"/></pre></td>
		</tr>
	</ext:notEmpty>
</table>