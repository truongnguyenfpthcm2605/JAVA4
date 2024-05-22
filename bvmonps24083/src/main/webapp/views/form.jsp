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
		<h1>Form Xử Lý</h1>
		<hr>
		<div class="row" style="width: 100%; margin: 0 auto;">
			<form action="form" method="post"
				style="width: 100%; margin: 0 auto;">
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">Username</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="username"
							value="${from.username}">
					</div>

				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">hoten</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="hoten"
							value="${from.hoten}">
					</div>

				</div>
				<div class="form-group row">
					<label for="inputPassword3" class="col-sm-2 col-form-label">password</label>
					<div class="col-sm-10">
						<div class="input-group mb-3" style="margin: 0; padding: 0">
							<input type="text" class="form-control"
								onchange="checkPass(this)" value="${from.password}"
								name="password" aria-label="Recipient's username"
								id="password-field" aria-describedby="button-addon2">
							<div class="input-group-append">
								<button class="btn btn-outline-secondary" type="button"
									id="button-addon2">
									<i class='bx bx-show-alt'></i>
								</button>
							</div>

						</div>


					</div>

				</div>
				<div class="form-group row">
					<label for="inputPassword3" onchange="checkEmail(this)"
						class="col-sm-2 col-form-label">email</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="email"
							value="${from.email}">

					</div>

				</div>
				<div class="form-group">
					<label for="" class="badge badge-success">gioitinh</label> <br>
					<input type="radio" name="gioitinh" value="true"
						${from.gioitinh?'checked':''}> <label for="">Nam
						hoạt </label> <br> <input type="radio" name="gioitinh" value="false"
						${from.gioitinh?'':'checked'}> <label for="">Nữ
						</label>
				</div>
				<div
					style="display: flex; justify-content: space-evenly; width: 20%; margin: 0 auto;">
					<button formaction="insert" class="btn btn-dark">New</button>
					<a   href='<c:url value="index"></c:url>' class="btn btn-dark">Quay Lại</a>
				</div>

			</form>
			<p>${mesage}</p>
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
	<script type="text/javascript">
		var passwordField = document.getElementById("password-field");
		var showPasswordButton = document.getElementById("button-addon2");

		showPasswordButton
				.addEventListener(
						"click",
						function() {
							if (passwordField.type === "password") {
								passwordField.type = "text";
								showPasswordButton.innerHTML = "<i class='bx bx-low-vision'></i>";
							} else {
								passwordField.type = "password";
								showPasswordButton.innerHTML = "<i class='bx bx-show-alt'></i>";
							}
						});
	</script>
	<script src="/LAB5-PS24083/views/Js/validate.js"></script>
</body>
</html>