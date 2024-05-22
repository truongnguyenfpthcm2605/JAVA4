<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
	
	<div>
		<form action="FormReisgter-ok" method="post" style="width: 50%; margin: 0 auto;">
			<label class="badge bg-secondary">Tên Đăng Nhập : </label> <br>
			<input class="form-control" type="text" name="user"> <br>
			<label class="badge bg-secondary">Mật Khầu :</label> <br>
			<input class="form-control" type="password" name="pass"> <br>
			<label class="badge bg-secondary">Giới Tính : </label>
			<input type="radio" value="true" name="male"> <label>Nam</label>
			<input type="radio" value= "false" name="male"> <label>Nu</label> <br>
			<input type="checkbox"  name="family" value="true"> <label>Bạn có gia đình chưa ?</label> <br>
			<label class="badge bg-secondary">Quốc Tịch : </label>
			<select class="form-control" name="Country">
				<option value="VN">Viet Nam</option>
				<option value="US">United States</option>
				<option value="UK">England</option>
			</select> <br>
			<label class="badge bg-secondary">Sở Thích : </label> <br>
			<input type="checkbox" name="hobbies" value="Đọc Sách"> <label>Đọc Sách</label>
			<input type="checkbox" name="hobbies" value="Du lịch"> <label>Du lịch </label>
			<input type="checkbox" name="hobbies" value="Âm Nhạc"> <label>Âm Nhạc</label>
			<input type="checkbox" name="hobbies" value="Khác"> <label>Khác</label> <br>
			<label class="badge bg-secondary">Ghi CHú :</label>
			<textarea class="form-control" rows="5" cols="10" name="note">Nhà ANh ở Đâu ?</textarea>
			<hr>
			<button class="btn btn-dark">đăng kí</button>

		</form>
	</div>

</body>
</html>