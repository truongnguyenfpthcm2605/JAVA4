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
	<form action="form" method="post" enctype="multipart/form-data" style="width: 50%; margin: 10px auto;" >
		<label class="badge bg-secondary">Họ Và Tên : </label> 
		<input class="form-control" name="name" type="text"placeholder="FullName?"> <br> 
		<label class="badge bg-secondary">Hinh Anh</label>
		<input class="form-control" type="file" name="image"> <br>
		<label class="badge bg-secondary">Ngay Sinh :</label>
		<input class="form-control" name="date" type="date" placeholder="Recruitment Date?"> <br>
		<label class="badge bg-secondary">Quốc Tịch : </label>
		<select class="form-control" name="country">
			<option  value="vn">Việt Nam</option>
			<option value="us">United States</option>
			<option value="uk">England</option>
			<option value="gr">Gremany</option>
		</select> <br>
		<label class="badge bg-secondary">Giới Tính</label>
		<input type="radio" name="gender" value="true"> Male 
		<input type="radio" name="gender" value="false"> Female <br> 
			
		<label class="badge bg-secondary">Tình trạng Hôn nhân :</label>
		 <input type="checkbox" value="true" name="family"> 
		 <label >đã có gia đình</label>
		<br> 
		<label class="badge bg-secondary">Sở Thích :</label>
		<input type="checkbox" name="hobbies" value="0">
		Reading <input type="checkbox" name="hobbies" value="1">
		Traveling <input type="checkbox" name="hobbies" value="2">
		Music <input type="checkbox" name="hobbies" value="3"> Other <br>
	<label class="badge bg-secondary">Ghi Chu</label>
	<textarea class="form-control" name="note" rows="5" cols="10" placeholder="Ghi chú"></textarea> <br>
	<hr>
		<button class="btn btn-dark">Thêm Mới</button>

	</form>
</body>
</html>