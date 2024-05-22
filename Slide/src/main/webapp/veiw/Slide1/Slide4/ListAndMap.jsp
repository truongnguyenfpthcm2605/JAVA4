<%@page import="com.poly.ps24083.util.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Student> list = (List<Student>) request.getAttribute("list");
	%>
	MAP :
	<li>map.ly : ${map.ly } = ${map['ly'] }</li>
	<li>map.toan: ${map.toan } = ${map['toan'] }</li>
	<li>(map.ly + map.toan)/ 2 : ${(map.ly + toan)/2 }</li> List :
	<h1>Cách 1</h1>
	<li>list[0] : ${list[0].id}</li>
	<li>list[1] : ${list[0].name}</li>

	<h1>Cách 2</h1>
	<c:choose>
		<c:when test="${not empty list}">
			<c:forEach var="item" items="${list}">
				<h2>${item.getId()}</h2>
				<h2>${item.getName()}</h2>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<p>Danh sách rỗng.</p>
		</c:otherwise>
	</c:choose>
	<h2>Hello</h2>

	<h1>Cach 3</h1>
	<%
	for (Student sv : list) {
	%>
	<tr>
		<td><%=sv.getId()%></td>
		<td><%=sv.getName()%></td>
	</tr>
	<%
	}
	%>

	</h1>
</body>
</html>