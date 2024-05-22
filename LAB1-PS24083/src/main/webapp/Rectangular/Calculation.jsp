<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<style type="text/css">
		.container{
		width: 400px;
		margin: 0 auto;
		padding: 10px;
		border-radius: 5px;
		box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
		}
		h1{
		text-align: center;
		color: #FF4A4A;
		font-size: bold;
		}
		input{
			display: block;
			outline: none;
			border: none;
			border-radius: 5px;
			background-color: #FDEEDC;
			width: 100%;
			line-height: 30px;
		}
		div{
			margin-bottom: 10px;
		}
		div .but{
			width : 200px;
			margin: 0 auto;
		}
		button {
			width: 100%;
			line-height: 30px;
			outline: none;
			border: none;
			border-radius: 5px;
		}
		button:hover {
			transition: all 0.3s linear;
			background-color: #FF7F3F;
			 transform: scale(1.03);
			
			
		}
		label ,h2 {
			font-style: italic;
			color: #7DCE13
		}
	</style>
</head>
<body>

	<% String error = String.valueOf(request.getAttribute("error")); %>
	<div class="container">
		<form action="Rectangular" method="post">
			<h1>Thông tin hình chữ nhật </h1> <br>
			<div>
				<label for="dai">Chiều Dài :</label>
				<input type="text" name="height" id="dai">
			</div>
			<div>
				<label for="rong">Chiều Rộng :</label>
				<input type="text" name="width" id="rong">
			</div>
			<span>${error }</span>
			<div class="but">
			<button>Kết Quả</button>
			</div>
		</form>
	</div>
</body>
</html>