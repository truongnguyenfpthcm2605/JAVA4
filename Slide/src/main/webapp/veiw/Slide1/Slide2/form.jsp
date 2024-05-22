<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
		<form action="XuLyForm" method="post">
				Tên <input type="text" name="name" > <br>
				<input type="checkbox" name="hobbies" value="music"> Mucsic <br>
				<input type="checkbox" name="hobbies" value="reading"> Reding <br>
				<input type="checkbox" name="hobbies" value=shopping> Shopping <br>
				<input type="radio" name="gender" value="Male"> Nam <br>
				<input type="radio" name="gender" value="Female"> Nữ <br>
				<select name="select">
						<option value="1">Tp hcm</option>
						<option value="2">An giang</option>
						<option value="3">Đồng Tháp</option>
						<option value="4">Long An</option>
				</select>
				<button>Nộp</button>
		</form>
</body>
</html>