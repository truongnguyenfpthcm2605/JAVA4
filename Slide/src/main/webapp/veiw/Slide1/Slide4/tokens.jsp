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
	<select>
		<c:forTokens var="item" items="B AS D FK S F G H D S" delims=" ">

			<option>${item }</option>

		</c:forTokens>
	</select>
	
	Group : <c:forTokens var="item" items="B AS D FK S F G H D S" delims=" ">

			<label> <input type="radio" name="gender"> ${item } </label>

		</c:forTokens>
</body>
</html>