<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thông Tin</h1>
	<ul>
	<li>Tên : ${bean.name}</li>
	<li>Hinh anh : ${bean.image}</li>
	<li>Ngay sinh : ${bean.date}</li>
	<li>Quốc tịch : ${bean.country}</li>
	<li>Giới tính : ${bean.gender}</li>
	<li>Hôn Nhân : ${bean.family}</li>
	<li>Sở Thích : ${bean.hobbies}</li>
	<li>Ghi chu : ${bean.note}</li>
	</ul>
</body>
</html>