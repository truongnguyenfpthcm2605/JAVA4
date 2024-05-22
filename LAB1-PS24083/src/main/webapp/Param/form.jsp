<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container" style="width: 50%; margin: 50vh auto; ">
		<form action="ParamServlet" method="post">
				<div class="row" style="width: 100%">
						<div class="col-md-8">
					<label for="inputPassword2" class="visually-hidden">Password</label>
					<input type="text" class="form-control" id="inputPassword2"
						placeholder="Nhập Tên bạn" name= "name">
				</div>
				<div class="col-md-4">
					<button type="submit" class="btn btn-primary mb-3">Confirm
						</button>
				</div>
				</div>
			</form>
		</form>
	</div>
</body>
</html>