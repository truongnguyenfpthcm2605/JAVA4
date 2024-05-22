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

        .error{
            color: red;
            font-size: 10px;
        }
        .success{
            color: seagreen;
            font-size: 10px;
        }

</style>
</head>
<body>
	<div class="container" style="margin: 10px auto;">
		<c:url var="url" value="/user" />


		<div class="row">
			<div class="col-3">
				<div class="nav flex-column nav-pills" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link  show  " id="v-pills-home-tab"
						data-toggle="pill" href="#v-pills-home" role="tab"
						aria-controls="v-pills-home" aria-selected="true">Danh Sách</a> <a
						class="nav-link active show " id="v-pills-profile-tab"
						data-toggle="pill" href="#v-pills-profile" role="tab"
						aria-controls="v-pills-profile" aria-selected="false">Cập Nhật</a>
				</div>
			</div>
			<div class="col-9">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade    " id="v-pills-home" role="tabpanel"
						aria-labelledby="v-pills-home-tab">
						<table class="table table-striped">
							<tbody>
								<tr>
									<td>ID</td>
									<td>PASSWORD</td>
									<td>FULLNAME</td>
									<td>EMAIL</td>
									<td>ADMIN</td>

									<td>EDIT</td>
								</tr>
								<c:choose>
									<c:when test="${not empty items  }">
										<c:forEach var="item" items="${items }">
											<tr>
												<td>${item.id}</td>
												<td>${item.password }</td>
												<td>${item.fullname }</td>
												<td>${item.email }</td>
												<td>${item.admin }</td>

												<td><a href="${url }/edit/${item.id}"
													aria-controls="v-pills-profile">Click</a></td>
											</tr>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<p>Danh Sách Trống</p>
									</c:otherwise>
								</c:choose>
							</tbody>
						</table>
					</div>
					<div class="tab-pane fade active show " id="v-pills-profile"
						role="tabpanel" aria-labelledby="v-pills-profile-tab">
						<form action="${url}/index" method="post">
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">ID</label>
								<div class="col-sm-10">
									<input type="text"  onchange="checkID(this)" class="form-control" name="id"
										value="${from.id}"> <span>${errid }</span>
								</div>

							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">FULLNAME</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="fullname"
										onchange="checkFulname(this)"  value="${from.fullname}"> <span>${errfullname }</span>
								</div>

							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">PASSWORD</label>
								<div class="col-sm-10">
									<div class="input-group mb-3" style="margin: 0; padding: 0">
										<input type="text" class="form-control"  onchange="checkPass(this)"
											value="${from.password}" 
											name="password" aria-label="Recipient's username"
											id="password-field" aria-describedby="button-addon2">
										<div class="input-group-append">
											<button class="btn btn-outline-secondary" type="button"
												id="button-addon2">
												<i class='bx bx-show-alt'></i>
											</button>
										</div>
										
									</div>
									<span id="err-pass">${errpass }</span>
									
								</div>

							</div>
							<div class="form-group row">
								<label for="inputPassword3"  onchange="checkEmail(this)"   class="col-sm-2 col-form-label">EMAIL</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="email"
										value="${from.email}"> <span>${erremail }</span>

								</div>

							</div>
							<div class="form-group">
								<label for="" class="badge badge-success">Admin</label> <br>
								<input type="radio" name="admin" value="true"
									${from.admin?'checked':''}> <label for="">Kích
									hoạt </label> <br> <input type="radio" name="admin" value="false"
									${from.admin?'':'checked'}> <label for="">Không
									Kích Hoạt</label>

							</div>
							<div
								style="display: flex; justify-content: space-evenly; width: 50%; margin: 0 auto;">
								<button formaction="${url}/create" class="btn btn-dark">New</button>
								<button formaction="${url}/update" class="btn btn-dark">Update</button>
								<button formaction="${url}/delete?id=${from.id}"
									class="btn btn-dark">Delete</button>
								<a href="${url }/index" class="btn btn-dark">Reset</a>
							</div>

						</form>
						<p>${mesage}</p>
					</div>
				</div>
			</div>
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
		var showPasswordButton = document
				.getElementById("button-addon2");

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
	<script src="/LAB5-PS24083/views/Js/validate.js"></script>
</body>
</html>