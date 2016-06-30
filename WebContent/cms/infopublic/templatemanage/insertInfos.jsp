<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<ext:form action="/templatemanage/insertInfos">
	<script language="JavaScript" charset="utf-8" src="<%=request.getContextPath()%>/cms/templatemanage/dialog/recordlist/js/insertRecordListExtend.js"></script>
	<script type="text/javascript">
		//获取配置元素标题,由继承者实现
		function getElementTitle(isSearchResults, isRssChannel) {
			return isRssChannel ? "" : "<%=("publicArticles".equals(request.getParameter("recordListName")) ? "文章列表:" : "政府信息列表:")%>" + (document.getElementsByName("directorySelect")[0].checked ? "当前目录" : document.getElementsByName("directoryNames")[0].value);
		}
		//显示扩展属性,由继承者实现
		function showExtendProperties(recordListProperties, recordListTextContent) {
			if(recordListProperties=="") {
				return;
			}
			var directoryIds =  StringUtils.getPropertyValue(recordListProperties, "directoryIds");
			if(directoryIds!="-1") {
				var directoryNames = recordListTextContent.substring(recordListTextContent.indexOf(":")+1).replace("&gt;", ""); //站点名称
				document.getElementsByName("directoryIds")[0].value = directoryIds;
				document.getElementsByName("directoryNames")[0].value = directoryNames;
				document.getElementsByName("directorySelect")[1].checked = true;
				directorySelectChanged('other');
			}
			//是否包含子目录资源
			document.getElementsByName("containChildren")[0].checked = "true"==StringUtils.getPropertyValue(recordListProperties, "containChildren");
		}
		//保存扩展属性,如果校验出错返回"ERROR",由继承者实现
		function getExtendPropertiesAsText() {
			var directoryIds = "-1";
			if(document.getElementsByName("directorySelect")[1].checked) {
				directoryIds = document.getElementsByName("directoryIds")[0].value;
				if(directoryIds=="") {
					alert("目录不能为空");
					return "ERROR";
				}
			}
			return "directoryIds=" + directoryIds + 
				   (!document.getElementsByName("containChildren")[0].checked ? "" : "&containChildren=true"); //是否显示子栏目数据
		}
		
		//获取默认的左侧记录格式
		function getDeafultRecordLeftFormat() {
			return '<a id="field" urn="name=subject&link=true">&lt;名称&gt;</a>';
		}
		//获取默认的右侧记录格式
		function getDeafultRecordRightFormat() {
			return '';
		}
		function directorySelectChanged(mode) {
			document.getElementById("selectedDirectories").style.display = (mode=="current" ? "none" : "");
		}
		function onDirectoryChanged() { //选择的目录改变,修改统计栏目属性
			var directoryIds = document.getElementsByName("directoryIds")[0].value;
			if(directoryIds=="") {
				return;
			}
			var link = recordListDocument.getElementsByName("totalLink")[0];
			if(link && link.value!="") {
				var url = link.value;
				var index = url.indexOf("?");
				if(index!=-1) {
					url = url.substring(0, index);
				}
				link.value = url + "?directoryId=" + directoryIds.split(",")[0];
			}
			var totalTitle = recordListDocument.getElementsByName("totalTitle")[0];
			if(totalTitle) {
				totalTitle.value = document.getElementsByName("directoryNames")[0].value;
			}
		}
	</script>
	<table border="0" cellspacing="5" cellpadding="0px">
		<tr>
			<td height="26px" nowrap="nowrap" align="right">目录选择：</td>
			<td nowrap="nowrap"><ext:field property="directorySelect" onclick="directorySelectChanged(this.value)"/></td>
			<td id="selectedDirectories" style="display:none;width:185px"><ext:field property="directoryNames" onchange="onDirectoryChanged()"/></td>
			<td nowrap="nowrap"><ext:field property="containChildren"/></td>
			</td>
		</tr>
    </table>
</ext:form>