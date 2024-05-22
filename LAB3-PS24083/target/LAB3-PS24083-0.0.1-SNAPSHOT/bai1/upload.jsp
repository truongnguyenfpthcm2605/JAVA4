<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Upload" method="post" enctype="multipart/form-data">
		<label>Hinh</label> <input type="file" name="image"> <br>
		<label>Tai Lieu</label> <input type="file" name="document"> <br>
		<hr>
		<button>Upload</button>
	</form>
</body>
</html>