<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<%
	request.setAttribute("editabled", "true");
%>
<table width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col valign="middle" width="33%">
	<col>
	<col valign="middle" width="33%">
	<col>
	<col valign="middle" width="33%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">中方单位名称</td>
		<td class="tdcontent"><ext:field property="chinaCompanyName"/></td>
		<td class="tdtitle" nowrap="nowrap">中方单位地址</td>
		<td class="tdcontent"><ext:field property="chinaCompanyAddress"/></td>
		<td class="tdtitle" nowrap="nowrap">中方单位邮编</td>
		<td class="tdcontent"><ext:field property="chinaCompanyPostal"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">中方单位网址</td>
		<td class="tdcontent"><ext:field property="chinaCompanySite"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人姓名</td>
		<td class="tdcontent"><ext:field property="chinaContactName"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人性别</td>
		<td class="tdcontent"><ext:field property="chinaContactSex"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">中方联系人电话</td>
		<td class="tdcontent"><ext:field property="chinaContactTel"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人手机</td>
		<td class="tdcontent"><ext:field property="chinaContactMobile"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人传真</td>
		<td class="tdcontent"><ext:field property="chinaContactFax"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">中方联系人E-mail</td>
		<td class="tdcontent"><ext:field property="chinaContactEmail"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人QQ\MSN</td>
		<td class="tdcontent"><ext:field property="chinaContactIm"/></td>
		<td class="tdtitle" nowrap="nowrap">中方联系人所在部门及职务</td>
		<td class="tdcontent"><ext:field property="chinaContactPost"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">招商办联系人1</td>
		<td class="tdcontent"><ext:field property="fdiContact1"/></td>
		<td class="tdtitle" nowrap="nowrap">招商办联系人2</td>
		<td class="tdcontent" colspan="3"><ext:field property="fdiContact2"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">外方单位中文名称</td>
		<td class="tdcontent"><ext:field property="foreignCompanyName"/></td>
		<td class="tdtitle" nowrap="nowrap">外方单位英文名称</td>
		<td class="tdcontent"><ext:field property="foreignCompanyEnglishName"/></td>
		<td class="tdtitle" nowrap="nowrap">外方单位地址</td>
		<td class="tdcontent"><ext:field property="foreignCompanyAddress" title="含国别"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">外方单位邮编</td>
		<td class="tdcontent"><ext:field property="foreignCompanyPostal"/></td>
		<td class="tdtitle" nowrap="nowrap">外方单位网址</td>
		<td class="tdcontent" colspan="3"><ext:field property="foreignCompanySite"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap" valign="top">外方单位简介</td>
		<td class="tdcontent" colspan="5"><ext:field property="foreignCompanyIntroduction" title="包括战略布局、核心行业与产品优势、竞争力分析等"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人姓名</td>
		<td class="tdcontent"><ext:field property="foreignContactName" title="中英文"/></td>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人职务</td>
		<td class="tdcontent"><ext:field property="foreignContactPost"/></td>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人性别</td>
		<td class="tdcontent"><ext:field property="foreignContactSex"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人电话</td>
		<td class="tdcontent"><ext:field property="foreignContactTel" title="含地区号"/></td>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人手机</td>
		<td class="tdcontent"><ext:field property="foreignContactMobile"/></td>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人传真</td>
		<td class="tdcontent"><ext:field property="foreignContactFax" title="含地区号"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人QQ\MSN</td>
		<td class="tdcontent"><ext:field property="foreignContactIm"/></td>
		<td class="tdtitle" nowrap="nowrap">外方洽谈人E-mail</td>
		<td class="tdcontent" colspan="3"><ext:field property="foreignContactEmail"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">项目名称</td>
		<td class="tdcontent"><ext:field property="projectName"/></td>
		<td class="tdtitle" nowrap="nowrap">项目归类</td>
		<td class="tdcontent"><ext:field property="projectCategory"/></td>
		<td class="tdtitle" nowrap="nowrap">行业分类</td>
		<td class="tdcontent"><ext:field property="industry"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">拟合作方式</td>
		<td class="tdcontent"><ext:field property="cooperateMode"/></td>
		<td class="tdtitle" nowrap="nowrap">项目总投资(万元)</td>
		<td class="tdcontent" colspan="3"><ext:field property="totalInvestment"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap" valign="top">项目概述</td>
		<td class="tdcontent" colspan="5"><ext:field property="summary"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">登记人</td>
		<td class="tdcontent"><ext:field property="creator"/></td>
		<td class="tdtitle" nowrap="nowrap">登记时间</td>
		<td class="tdcontent"><ext:field property="created"/></td>
		<td class="tdtitle" nowrap="nowrap"></td>
		<td class="tdcontent"></td>
	</tr>
</table>