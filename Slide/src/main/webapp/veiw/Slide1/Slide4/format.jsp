<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<jsp:useBean id="now" class="java.util.Date"></jsp:useBean>
			
			<h3> <fmt:formatDate value="${now }"/> </h3>
				<h3> <fmt:formatDate value="${now }" pattern="EEE,dd-MM-yyyy"/> </h3>
			
</body>
</html>