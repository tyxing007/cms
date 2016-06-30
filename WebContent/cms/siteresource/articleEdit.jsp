<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<%request.setAttribute("editabled", "true");%>
<script>
	function selectFirstImage() {
		DialogUtils.selectAttachment('/cms/siteresource/admin/selectAttachment.shtml', '<ext:write property="id"/>', 'images', 680, 400, 'setFirstImageName("{URL}")');
	}
	function setFirstImageName(url) {
		document.getElementsByName("firstImageName")[0].value = StringUtils.utf8Decode(url.substring(url.lastIndexOf('/') + 1));
	}
</script>
<table valign="middle" width="100%" border="1" cellpadding="0" cellspacing="0" class="table">
	<col>
	<col width="50%">
	<col>
	<col width="50%">
	<tr>
		<td class="tdtitle" valign="top">标题</td>
		<td class="tdcontent" colspan="3"><ext:field property="subject"/></td>
	</tr>
	<tr>
		<td class="tdtitle">副标题</td>
		<td class="tdcontent" colspan="3"><ext:field property="subhead"/></td>
	</tr>
	<tr>
		<td class="tdtitle">文号</td>
		<td class="tdcontent"><ext:field property="mark"/></td>
		<td class="tdtitle" nowrap="nowrap">匿名访问级别</td>
		<td class="tdcontent"><ext:field property="anonymousLevel"/></td>
	</tr>
	<tr>
		<td class="tdtitle">所属栏目</td>
		<td class="tdcontent" colspan="3"><ext:field property="columnFullName"/></td>
	</tr>
	<tr>
		<td class="tdtitle" nowrap="nowrap">所属其它栏目</td>
		<td class="tdcontent" colspan="3"><ext:field property="otherColumnNames"/></td>
	</tr>
	<tr>
		<td class="tdtitle">来源</td>
		<td class="tdcontent"><ext:field property="source"/></td>
		<td class="tdtitle">作者</td>
		<td class="tdcontent"><ext:field property="author"/></td>
	</tr>
	<tr>
		<td class="tdtitle">译者</td>
		<td class="tdcontent"><ext:field property="translator"/></td>
		<td class="tdtitle">校对</td>
		<td class="tdcontent"><ext:field property="review"/></td>
	</tr>
	<tr>
		<td class="tdtitle">关键字</td>
		<td class="tdcontent"><ext:field property="keyword"/></td>
		<td class="tdtitle" nowrap="nowrap">标题颜色</td>
		<td class="tdcontent"><ext:field property="subjectColor"/></td>
	</tr>
	<tr>
		<td class="tdtitle">创建时间</td>
		<td class="tdcontent"><ext:field property="created"/></td>
		<td class="tdtitle" nowrap="nowrap">发布时间</td>
		<td class="tdcontent"><ext:field property="issueTime"/></td>
	</tr>
	<ext:notEmpty property="readers.visitorNames">
		<tr>
			<td class="tdtitle">访问者</td>
			<td class="tdcontent" colspan="3"><ext:field writeonly="true" property="readers.visitorNames"/></td>
		</tr>
	</ext:notEmpty>
	<tr>
		<td class="tdtitle" valign="top">内容</td>
		<td colspan="3" class="tdcontent"><ext:field property="body"/></td>
	</tr>
</table>