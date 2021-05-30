<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery-1.7.2.js"></script>
<script type="text/javascript">

	$(function(){
		
		$(".empRemove").click(function(){
			
			$("form").attr("action",this.href).submit();
			
			return false;
			
		});
		
	});

</script>
</head>
<body>

	<form method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>

	<table align="center">
		<c:if test="${requestScope.empList == null || empty requestScope.empList }">
			<tr>
				<td>当前还没有员工数据！</td>
			</tr>
		</c:if>
		<c:if test="${requestScope.empList != null && !empty requestScope.empList }">
			<tr>
				<th>ID</th>
				<th>员工姓名</th>
				<th>社会保险号</th>
				<th>所在部门</th>
				<th>删除</th>
				<th>编辑</th>
			</tr>
			
			<c:forEach items="${requestScope.empList }" var="emp">
				
				<tr>
					<td>${emp.empId }</td>
					<td>${emp.empName }</td>
					<td>${emp.ssn }</td>
					<td>${emp.department.deptName }</td>
					<td>
						<a class="empRemove" href="${pageContext.request.contextPath }/emp/${emp.empId}">删除</a>
					</td>
					<td>
						<a href="${pageContext.request.contextPath }/emp/${emp.empId}">编辑</a>
					</td>
				</tr>
				
			</c:forEach>
			
		</c:if>
		
		<tr>
			<td colspan="6" align="center">
				<a href="${pageContext.request.contextPath }/emp/toAddUI">添加新员工</a>
			</td>
		</tr>
		
	</table>

</body>
</html>