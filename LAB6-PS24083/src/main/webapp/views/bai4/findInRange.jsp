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
	<c:url var="app" value="/bai3"></c:url>
	<h2>Video Được Yêu Thích Trong Khoảng Thời Gian</h2>
	<hr>
	<form action="${app}/findInRange/*" method="post" style="width: 60%; margin: 10px auto;">
			<div class="form-group">
				<label class="">From</label> 
				<input type="date"name="fromDate" class="form-control" value="${dateBegin}"required="required" />
			</div>
			<div class="form-group">
				<label class="">To</label> 
				<input type="date" name="toDate" class="form-control" value="${dateEnd}"required="required">
			</div>
			<button class="btn btn-dark" type="submit">Search</button>
			
	</form>
	

	<p>${message }</p>
	<table class="table table-striped"
		style="width: 90%; margin: 0 auto; padding: 5px; border-radius: 5px; background: rgba(0, 0, 0, 0.2);">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Views</th>
				<th scope="col">Active</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${not empty videoIndate }">
					<c:forEach var="item" items="${videoIndate}">
						<tr>
							<td>${item.id }</td>
							<td>${item.title }</td>
							<td>${item.poster }</td>
							<td>${item.active }</td>
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

</html>