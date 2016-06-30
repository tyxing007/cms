<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.beanutils.PropertyUtils"%>
<%@page import="com.yuanluesoft.jeaf.util.Environment"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.Collection"%>
<html>
<body>
<%
	if(!request.getServerName().equals("localhost") &&
	   !"admin".equals(PropertyUtils.getProperty(request.getSession().getAttribute("SessionInfo"), "loginName"))) {
		out.print("failed");
		return;
	}
	
	try {
		Object cache = (Object)Environment.getService("requestCodeCache");
		Collection keys = (Collection)PropertyUtils.getProperty(cache, "keys");
		for(Iterator iterator = (keys==null ? null : keys.iterator()); iterator!=null && iterator.hasNext();) {
			String key = (String)iterator.next();
			out.println(key + "=" + cache.getClass().getMethod("get", new Class[]{Object.class}).invoke(cache, new Object[]{key}) + "<br>");
		}
	}
	catch(Exception e) {
		out.println(e + e.getMessage());
	}
%>
</body>
</html>