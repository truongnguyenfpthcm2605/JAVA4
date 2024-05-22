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
		
		<c:if test="${!empty sessionScope.user }">
							<h1>Welcome</h1>
		</c:if>
		<c:choose>
				<c:when test="${!empty sessionScope.user }">
						<h1>Hello</h1>
				</c:when>
				<c:otherwise>
						<h1>Không</h1>
				</c:otherwise>
		</c:choose>
		
	<jsp:useBean id="now" class="java.util.Date"></jsp:useBean>
	<c:choose>
				<c:when test="${now.day == 1 }">
						<h1>thứ Hai</h1>
				</c:when>
				<c:when test="${now.day == 6 }">
						<h1>Chủ Nhật</h1>
				</c:when>
				<c:otherwise>
						<h1>Ngày Trong tuần</h1>
				</c:otherwise>
		</c:choose>
		
</body>
</html>