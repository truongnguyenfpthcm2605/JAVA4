<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>FPOLY HCM</h1>
		<hr>
	<c:url  var="home" value="/home"/>
	<a href="${home}/feedback"> feedback </a>
	<a href="${home}/about"> About </a>
	<a href="${home}/contact"> Contact </a>
	<hr>
	<jsp:include page="${view}"></jsp:include>
	<hr>
</body>
</html>