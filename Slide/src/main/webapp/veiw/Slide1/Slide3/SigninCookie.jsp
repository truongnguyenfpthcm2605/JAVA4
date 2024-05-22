<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="Cookie" method="post">
				Tên <input type="text" name="user" value="${user }" > <br>
				Pass <input type="pass" name="pass" value="${pass }"> <br>
				<input type="checkbox" name="check" value="true"> Remember ? <br>
				<button >Submit</button>
				<h1>${message }</h1>
		</form>
</body>
</html>