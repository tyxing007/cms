<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-ext" prefix="ext" %>

<ext:form action="/admin/writeDocumentSalesReport" target="_blank" method="get">
	<table border="0" cellpadding="3" cellspacing="3" style="color:#000000" width="100%">
		<col align="right">
		<col width="100%">
		<tr>
			<td nowrap>开始时间：</td>
			<td><ext:field property="beginDate"/></td>
		</tr>
		<tr>
			<td>结束时间：</td>
			<td><ext:field property="endDate"/></td>
		</tr>
		<tr>
			<td>支付银行：</td>
			<td><ext:field property="paymentBanks"/></td>
		</tr>
		<tr>
			<td>地区：</td>
			<td><ext:field property="cities"/></td>
		</tr>
	</table>
	<script>
		function formOnSubmit() {
			var cities = document.getElementsByName("cities");
			var i = cities.length -1;
			for(; i>=0 && !cities[i].checked; i--);
			if(i<0) {
				alert("地区未选择");
				return false;
			}
			return true;
		}
	</script>
</ext:form>