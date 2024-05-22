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
<style type="text/css">
input {
	display: block;
}
</style>
</head>
<body>
	<div>
		
		<form action="Tamgiac" method="post" style="width: 50%; margin: 10px auto;">
			<h1>TAM GIÁC</h1>
			<div style="width: 30%">
				<input type="text" placeholder="Cạnh a>" name="a" class="form-control mb-2"> 
				<input
					type="text" placeholder="Cạnh b>" name="b"  class="form-control mb-2">
					 <input
					type="text" placeholder="Cạnh c>" name="c"  class="form-control mb-2">
			</div>
			<hr>
			<button formaction="dientich" class="btn btn-dark">Tích Diện Tích</button>
			<button formaction="chuvi" class="btn btn-dark">Tính Chu Vi</button>
			<h3>${message}</h3>
		</form>
	</div>
	
</body>
</html>