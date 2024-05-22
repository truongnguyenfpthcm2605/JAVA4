<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<title>Hello</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<style type="text/css">
.form-group span {
	font-size: 10px;
	color: red;
}

.error {
	color: red;
	font-size: 10px;
}

.success {
	color: seagreen;
	font-size: 10px;
}
</style>
</head>
<body>
	<div class="container" style="margin: 10px auto;">
		<c:url var="url" value="/user" />


		<div class="row">


			<div style="margin-bottom: 20px; width: 100%">
				<form action="find" method="post">
					<div
						style="display: flex; justify-content: space-between; width: 40%; margin: 0 auto;">
						<input class="form-control" style="width: 60%" type="text"
							name=search>
						<button class="btn btn-dark" style="width: 35%">Tìm Kiếm</button>
					</div>
				</form>
			</div>
			<table class="table table-striped">
				<tbody>
					<tr>
						<td>Stt</td>
						<td>Username</td>
						<td>Password</td>
						<td>Ho Tên</td>
						<td>Email</td>
						<td>Giới Tính</td>
						
					</tr>
					<c:choose>
						<c:when test="${not empty items  }">
							<c:forEach var="item" items="${items }" varStatus="i">
								<tr>
									<td>${i.index}</td>
									<td>${item.getUsername() }</td>
									<td>${item.getPassword() }</td>
									<td>${item.getHoten() }</td>
									<td>${item.getEmail() }</td>
									<td>${item.getGioitinh()?'Nam':'Nữ' }</td>
									
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<p>Danh Sách Trống</p>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
			
		<a href='<c:url value="insert"></c:url>' class="btn btn-dark">New</a>
	</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>
</html>