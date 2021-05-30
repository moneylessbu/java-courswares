<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		border: 1px solid black;
		border-collapse: collapse;
	}
	
	table td,th {
		border: 1px solid black;
	}
</style>
</head>
<body>

	<form:form action="${pageContext.request.contextPath }/emp" method="post" modelAttribute="employee">
		<input type="hidden" name="_method" value="put"/>
		<form:hidden path="empId"/>
		<table align="center">
			
			<tr>
				<td colspan="2" align="center">编辑员工</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>
					<form:input path="empName"/>
				</td>
			</tr>
			<tr>
				<td>社会保险号</td>
				<td>${requestScope.employee.ssn }</td>
			</tr>
			<tr>
				<td>所在部门</td>
				<td>
					<form:select path="department.deptId" items="${requestScope.deptList }" itemValue="deptId" itemLabel="deptName"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="更新"/>
				</td>
			</tr>
			
		</table>
		
	</form:form>

</body>
</html>