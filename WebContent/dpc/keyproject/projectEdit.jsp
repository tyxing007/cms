<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>
<%@ taglib uri="/WEB-INF/struts-logic" prefix="logic" %>

<%request.setAttribute("editabled", "true");%>
<table valign="middle" width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col width="50%">
	<col>
	<col width="50%">
	<tr>
		<td class="tdtitle" nowrap="nowrap">项目全称</td>
		<td class="tdcontent" title="项目可分父项目和子项目，子项目指具体的项目，父项目只是项目分类，没有明细的信息"><ext:field property="name"/></td>
		<td class="tdtitle" nowrap="nowrap">建设地点</td>
		<td class="tdcontent"><ext:field property="address"/></td>
	</tr>
	<tr title="概要描述项目的地点、规模、内容、总体安排、投资资金等信息">
		<td class="tdtitle" nowrap="nowrap">项目主要建设目标</td>
		<td class="tdcontent" colspan="3"><ext:field property="summary"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">建设规模及主要建设内容</td>
		<td class="tdcontent" colspan="3"><ext:field property="constructionScale"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">项目性质</td>
		<td class="tdcontent"><ext:field property="status"/></td>
		<td class="tdtitle" nowrap="nowrap">项目级别</td>
		<td class="tdcontent"><ext:field property="level"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">所属行业</td>
		<td class="tdcontent"><ext:field property="industry"/></td>
		<td class="tdtitle" nowrap="nowrap">所属子行业</td>
		<td class="tdcontent"><ext:field property="childIndustry"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">所属区域</td>
		<td class="tdcontent"><ext:field property="area"/></td>
		<td class="tdtitle" nowrap="nowrap">项目挂点领导</td>
		<td class="tdcontent" title="对本项目关注的领导以及挂点领导名单">
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td nowrap="nowrap">市&nbsp;</td>
					<td width="50%"><ext:field property="leader"/></td>
					<td nowrap="nowrap">&nbsp;县&nbsp;</td>
					<td width="50%"><ext:field property="otherLeader"/></td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">建设年限</td>
		<td class="tdcontent">
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="50%"><ext:field property="constructionBeginYear"/></td>
					<td nowrap="nowrap">&nbsp;至&nbsp;</td>
					<td width="50%"><ext:field property="constructionEndYear"/></td>
				</tr>
			</table>
		</td>
		<td class="tdtitle" nowrap="nowrap">开竣工时间</td>
		<td class="tdcontent">
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td width="50%"><ext:field property="beginDate"/></td>
					<td nowrap="nowrap">&nbsp;和&nbsp;</td>
					<td width="50%"><ext:field property="endDate"/></td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">大干150天力争完成投资(万元)</td>
		<td class="tdcontent"><ext:field property="investPlan150"/></td>
		<td class="tdtitle" title="项目总投资资金拼盘中投资列表的总和" nowrap="nowrap">项目总投资</td>
		<td class="tdcontent"><ext:field property="invest"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">市或县挂钩责任单位</td>
		<td class="tdcontent"><html:text property="managementUnit" styleClass="field required"/></td>
		<td class="tdtitle" nowrap="nowrap">责任人</td>
		<td class="tdcontent"><ext:field property="managementUnitResponsible"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">联络人</td>
		<td class="tdcontent"><ext:field property="managementUnitLinkman"/></td>
		<td class="tdtitle" nowrap="nowrap">电话</td>
		<td class="tdcontent"><ext:field property="managementUnitTel"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">项目业主单位</td>
		<td class="tdcontent" title="项目建设法人机构或者负责筹建的单位名称"><ext:field property="unit"/></td>
		<td class="tdtitle" nowrap="nowrap">所属开发区</td>
		<td class="tdcontent"><ext:field property="developmentArea"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">法人代表或者负责人</td>
		<td class="tdcontent"><ext:field property="lawPerson"/></td>
		<td class="tdtitle" nowrap="nowrap">联系人</td>
		<td class="tdcontent"><ext:field property="linkman"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">单位电话</td>
		<td class="tdcontent"><ext:field property="unitTel"/></td>
		<td class="tdtitle" nowrap="nowrap">单位传真</td>
		<td class="tdcontent"><ext:field property="unitFax"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">单位地址</td>
		<td class="tdcontent"><ext:field property="unitAddress"/></td>
		<td class="tdtitle" nowrap="nowrap">邮政编码</td>
		<td class="tdcontent"><ext:field property="unitPostcode"/></td>
	</tr>
</table>