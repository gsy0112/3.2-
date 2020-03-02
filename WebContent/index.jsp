<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息表</title>

</head>
<body>
	<table border="1">
		<tr><th colspan="4">学生信息表</th></tr>
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
		<c:forEach items="${stus}" var="stu">
			<tr>
				<td>${stu.sid}</td>
				<td>${stu.sname}</td>
				<td>${stu.sage}</td>
				<td>${stu.ssex}</td>
			<tr/>
		</c:forEach>
	</table>
</body>
</html>