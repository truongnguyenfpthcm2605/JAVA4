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
		<c:forEach var="item" items="${list }">
				<h2>${item }</h2>
		</c:forEach>
		<c:forEach var="entry" items="${map }">
				<h2>${entry.key } = ${entry.value }</h2>
		</c:forEach>
</body>
</html>