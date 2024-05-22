<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.form-group span {
	font-size: 10px;
	color:red;
}
</style>
<div class="container" style="margin: 10px auto;">
	<h2>Đăng Ký</h2>
	<hr>
	<div class="container">
		<c:url var="app" value="/account"/>
		<form action="UserManager" method="post">
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">ID</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="id"
						value="${user.id}"> <span>${errid }</span>
				</div>

			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">FULLNAME</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="fullname"
						value="${user.fullname}"> <span>${errfullname }</span>
				</div>

			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">PASSWORD</label>
				<div class="col-sm-10">
					<div class="input-group mb-3" style="margin: 0; padding: 0">
						<input type="text" class="form-control" value="${user.password}"
							name="password" aria-label="Recipient's username"
							id="password-field" aria-describedby="button-addon2">
						<div class="input-group-append">
							<button class="btn btn-outline-secondary" type="button"
								id="button-addon2">
								<i class='bx bx-show-alt'></i>
							</button>
						</div>

					</div>
					<span>${errpass }</span>

				</div>

			</div>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-2 col-form-label">EMAIL</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="email"
						value="${user.email}"> <span>${erremail }</span>

				</div>

			</div>
			<div
				style="display: flex; justify-content: space-evenly; width: 50%; margin: 0 auto;">
				<button formaction="${app}/sgin-up" class="btn btn-dark">Đăng Ký</button>
				
			</div>
			<span>${editregister}</span>
		</form>
		
	</div>
</div>
<script type="text/javascript">
	var passwordField = document.getElementById("password-field");
	var showPasswordButton = document.getElementById("button-addon2");

	showPasswordButton.addEventListener("click", function() {
		if (passwordField.type === "password") {
			passwordField.type = "text";
			showPasswordButton.innerHTML = "<i class='bx bx-low-vision'></i>";
		} else {
			passwordField.type = "password";
			showPasswordButton.innerHTML = "<i class='bx bx-show-alt'></i>";
		}
	});
</script>