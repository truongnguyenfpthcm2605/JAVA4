<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
td span i:hover {
	transform: scale(1.1);
	color: red;
	transition: all linear 0.5s;
}
</style>

<div class="container" style="margin: 10px auto;">
<c:url var="app"  value="/home"></c:url>
	<h2>Danh sách Người Dùng Yêu Thích Theo Video</h2>
	<hr>
	<form action="${app}/user/*" method="post"
		style="width: 60%; margin: 10px auto;">
		<div style="display: flex; justify-content: space-evenly;">
			<input type="text" name="videoid" class="form-control" placeholder="Nhập ID Video"
				style="width: 70%">
			<button class="btn btn-dark" style="width: 20%">Search</button>
		</div>
	</form>
	
	<p>${message } </p>
	<table class="table table-striped"
		style="width: 90%; margin: 0 auto; padding: 5px; border-radius: 5px; background: rgba(0, 0, 0, 0.2);">
		<thead class="thead-dark">
			<tr>

				<th scope="col">ID</th>
				<th scope="col">FULLNAME</th>
				<th scope="col">EMAIL</th>
				<th scope="col">ROLE</th>
			
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${not empty videoToUser }">
					<c:forEach var="item" items="${videoToUser}">
						<tr>
							<td>${item.id }</td>
							<td>${item.fullname }</td>
							<td>${item.email }</td>
							<td>${item.admin ?'Admin':'Người Dùng'}</td>
							
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
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
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