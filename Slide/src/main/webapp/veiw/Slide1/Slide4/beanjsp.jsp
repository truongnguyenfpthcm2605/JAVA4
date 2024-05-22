<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="now" class="java.util.Date"></jsp:useBean>
	<jsp:setProperty property="date" name="now" value="2023" />
	<h1>
		Month :
		<jsp:getProperty property="month" name="now" /></h1>

</body>
</html>