<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath }/saveUser" modelAttribute="user">
		
		用户名：<form:input path="userName"/><br/>
		年龄：<form:input path="age"/><br/>
		邮箱：<form:input path="email"/><br/>
		日期：<form:input path="birthday"/><br/>
		
		<% Map<String,String> map = new HashMap<String,String>(); %>
		<% map.put("val01", "值1"); %>
		<% map.put("val02", "值2"); %>
		<% map.put("val03", "值3"); %>
		<% map.put("val04", "值4"); %>
		<% map.put("val05", "值5"); %>
		<% map.put("val06", "值6"); %>
		<% request.setAttribute("valueMap", map); %>
		
		真值：<form:checkboxes items="${requestScope.valueMap }" path="multiValues"/>
		<br/>
		<input type="submit" value="保存"/>
		
	</form:form>

</body>
</html>