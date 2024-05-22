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
</head>
<body>
	<div class="container" style="margin: 10px auto;">
		<c:url var="url" value="/user" />
		<p>${message}</p>
		
		<div class="row">
			<div class="col-3">
				<div class="nav flex-column nav-pills" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<a class="nav-link " id="v-pills-home-tab" data-toggle="pill"
						href="#v-pills-home" role="tab" aria-controls="v-pills-home"
						aria-selected="true">Danh Sách</a> 
						<a class="nav-link active show"
						id="v-pills-profile-tab" data-toggle="pill"
						href="#v-pills-profile" role="tab" aria-controls="v-pills-profile"
						aria-selected="false">Cập Nhật</a>
				</div>
			</div>
			<div class="col-9">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade " id="v-pills-home"
						role="tabpanel" aria-labelledby="v-pills-home-tab">
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
												
												<td><a href="${url }/edit/${item.id}" aria-controls="v-pills-profile" >Click</a></td>
											</tr>
										</c:forEach>
									</c:when>
									<c:otherwise>
											<p>Danh Sách Trống </p>
									</c:otherwise>
								</c:choose>
							</tbody>
						</table>
					</div>
					<div class="tab-pane fade active show" id="v-pills-profile" role="tabpanel"
						aria-labelledby="v-pills-profile-tab">
						<form action="${url}/index" method="post">
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">ID</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="id"
										value="${from.id}">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">FULLNAME</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="fullname"
										value="${from.fullname}">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">PASSWORD</label>
								<div class="col-sm-10">
									<input type="password" class="form-control" name="password"
										value="${from.password}">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputPassword3" class="col-sm-2 col-form-label">EMAIL</label>
								<div class="col-sm-10">
									<input type="email" class="form-control" name="email"
										value="${from.email}">

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
								<button formaction="${url}/delete?id=${from.id}" class="btn btn-dark">Delete</button>
								<a href="${url }/index" class="btn btn-dark">Reset</a>
							</div>

						</form>
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
</body>
</html>