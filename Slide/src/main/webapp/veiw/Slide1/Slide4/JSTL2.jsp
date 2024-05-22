<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="message" value="Hello Family" scope="page"/>
		<c:set var="message" value="Hello JSTL" scope="request"/>
		<c:remove var="message" scope="request"/>
		<h2>${message}</h2>
		
		<c:url var="url" value="/hello.jsp" />
		<h2>${url }</h2>
		
		<c:import url="form.jsp"></c:import>
		
</body>
</html>