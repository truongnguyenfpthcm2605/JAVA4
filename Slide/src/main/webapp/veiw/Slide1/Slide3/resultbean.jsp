<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>${bean.fullname }</h1>
	<h1>${bean.salary }</h1>
	<h1>${bean.age }</h1>
	<c:forEach var="value" items="${bean.hobbies}">
   ${value}
</c:forEach>
	<h1>${bean.hobbies[0] }</h1>
	<h1>${bean.gender }</h1>
	<h1>${bean.select }</h1>
	<h1>${bean.file }</h1>
	<h1>${bean.birthday }</h1>

</body>
</html>