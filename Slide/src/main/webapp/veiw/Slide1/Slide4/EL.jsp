<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1>Expression Language</h1>
			<p>requestScope.x  : ${ requestScope.x} = ${x }</p>
			<p>sessionScope.y  : ${ sessionScope.y} = ${y }</p>
			<p>applicationScope.Z  : ${ applicationScope.Z} = ${Z }</p>
			<p>applicationScope.x  : ${ applicationScope.x} = ${x }</p>
			<p>Bean.month  : ${ now.month + 1}</p>
			<p>Bean.year  : ${ now.year + 1900}</p>
</body>
</html>