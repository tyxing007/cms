<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<table valign="middle" width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col width="50%">
	<col>
	<col width="50%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">组织海关代码</td>
		<td class="tdcontent"><ext:write property="code"/></td>
		<td class="tdtitle" nowrap="nowrap">企业成立时间</td>
		<td class="tdcontent"><ext:write property="created" format="yyyy-MM-dd"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">企业名称(中文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="name"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">企业名称(英文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="englishName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">通讯地址(中文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="address"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">通讯地址(英文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="englishAddress"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">查询密码</td>
		<td class="tdcontent">
			<ext:write property="password"/>
		</td>
		<td class="tdtitle" nowrap="nowrap">经济类型</td>
		<td class="tdcontent">
			<html:radio property="type" value="国有及民营" styleClass="radio" styleId="typeNative"/><label for="typeNative">&nbsp;国有及民营</label>
			<html:radio property="type" value="三资" styleClass="radio" styleId="typeForeign"/><label for="typeForeign">&nbsp;三资</label>
		</td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">所属县、市</td>
		<td class="tdcontent"><ext:write property="county"/></td>
		<td class="tdtitle" nowrap="nowrap">所属开发区</td>
		<td class="tdcontent"><ext:write property="developmentArea"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">企业经营性质</td>
		<td class="tdcontent"><ext:field writeonly="true" property="businessType"/></td>
		<td class="tdtitle" nowrap="nowrap">进出口经营权</td>
		<td class="tdcontent"><ext:field writeonly="true" property="hasPrivilege"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">业务负责人(中文)</td>
		<td class="tdcontent"><ext:write property="principalName"/></td>
		<td class="tdtitle" nowrap="nowrap">职务(中文)</td>
		<td class="tdcontent"><ext:write property="job"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">业务负责人(英文)</td>
		<td class="tdcontent"><ext:write property="principalEnglishName"/></td>
		<td class="tdtitle" nowrap="nowrap">职务(英文)</td>
		<td class="tdcontent"><ext:write property="englishJob"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">上年进出口额</td>
		<td class="tdcontent"><ext:write property="totalLastYear"/></td>
		<td class="tdtitle" nowrap="nowrap">注册资金</td>
		<td class="tdcontent"><ext:write property="registeredCapital"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">联系电话</td>
		<td class="tdcontent"><ext:write property="tel"/></td>
		<td class="tdtitle" nowrap="nowrap">传真</td>
		<td class="tdcontent"><ext:write property="fax"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">企业网址</td>
		<td class="tdcontent"><ext:write property="webSite"/></td>
		<td class="tdtitle" nowrap="nowrap">电子邮箱</td>
		<td class="tdcontent"><ext:write property="email"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">邮政编码</td>
		<td class="tdcontent"><ext:write property="postalCode"/></td>
		<td class="tdtitle" nowrap="nowrap">员工人数</td>
		<td class="tdcontent"><ext:write property="employeeCount"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">境外办事机构(中文)</td>
		<td class="tdcontent"><ext:write property="foreignOfficeName"/></td>
		<td class="tdtitle" nowrap="nowrap">所在城市(中文)</td>
		<td class="tdcontent"><ext:write property="foreignOfficeCityName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">境外办事机构(英文)</td>
		<td class="tdcontent"><ext:write property="foreignOfficeEnglishName"/></td>
		<td class="tdtitle" nowrap="nowrap">所在城市(英文)</td>
		<td class="tdcontent"><ext:write property="foreignOfficeCityEnglishName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">母公司名称(中文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="motherCompanyName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">母公司名称(英文)</td>
		<td class="tdcontent" colspan="3"><ext:write property="motherCompanyEnglishName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">备注</td>
		<td class="tdcontent" colspan="3"><ext:write property="remark"/></td>
	</tr>
</table>
<center>
	<br>
	<input class="button" type="button" value="提交" onclick="FormUtils.submitForm()" style="width:80px">
</center>