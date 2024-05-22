<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%
		Object hobbies = request.getAttribute("hobbies");
		String[] a = { "No" };
		if (hobbies instanceof String[]) {
			a = (String[]) hobbies;
		}
		%>
		<ul>
			<li>Tên Đăng Nhập : ${name}</li>
			<li>Mật Khẩu : ${pass}</li>
			<li>Giới Tính : ${gender}</li>
			<li>Tình trạng hôn nhân : ${family}</li>
			<li>Quốc tích : ${Nationality}</li>
			<li>Ghi CHú : ${note}</li>
			<%
			for (String item : a) {
			%>
			<li><%=item%></li>
			<%
			}
			%>
		</ul>
	</div>
</body>
</html>