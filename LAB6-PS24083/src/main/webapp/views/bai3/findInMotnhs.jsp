<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
td span i:hover {
	transform: scale(1.1);
	color: red;
	transition: all linear 0.5s;
}

.form-check a {
	color: black;
	text-decoration: none;
}
</style>

<div class="container" style="margin: 10px auto;">
	<c:url var="app" value="/bai3"></c:url>
	<h2>Video Yêu Thích Theo Tháng</h2>
	<hr>
	<form action="${app}/findInMotnhs/*" method="post"
		style="width: 60%; margin: 10px auto;">
		<div style="display: flex; justify-content: space-evenly;">
			<div class="form-check ">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth1 ? 'checked' : ''} id="january" value="1" name="month">
						<label class="badge badge-light" for="january">Tháng 1</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth2 ? 'checked' : ''} id="february" value="2" name="month">
						<label class="badge badge-light" for="february">Tháng 2</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth3 ? 'checked' : ''} id="march" value="3" name="month">
						<label class="badge badge-light" for="march">Tháng 3</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth4 ? 'checked' : ''} id="april" value="4" name="month">
						<label class="badge badge-light" for="april">Tháng 4</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth5 ? 'checked' : ''} id="may" value="5" name="month">
						<label class="badge badge-light" for="may">Tháng 5</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth6 ? 'checked' : ''} id="june" value="6" name="month">
						<label class="badge badge-light" for="june">Tháng 6</label>
					</div>
					<br>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth7 ? 'checked' : ''} id="july" value="7" name="month">
						<label class="badge badge-light" for="july">Tháng 7</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth8 ? 'checked' : ''} id="august" value="8" name="month">
						<label class="badge badge-light" for="august">Tháng 8</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth9 ? 'checked' : ''} id="september" value="9" name="month">
						<label class="badge badge-light" for="september">Tháng 9</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth10 ? 'checked' : ''} id="october" value="10" name="month">
						<label class="badge badge-light" for="october">Tháng 10</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth11 ? 'checked' : ''} id="november" value="11" name="month">
						<label class="badge badge-light" for="november">Tháng 11</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" onclick="this.form.submit()" ${isMonth12 ? 'checked' : ''} id="december" value="12" name="month">
						<label class="badge badge-light" for="december">Tháng 12</label>
					</div>
					

		</div>
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
				<c:when test="${not empty lstVideos }">
					<c:forEach var="item" items="${lstVideos}">
						<tr>
							<td>${item.id }</td>
							<td>${item.title }</td>
							<td>${item.poster }</td>
							<td>${item.active}</td>

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

<script>
	function selectRadio1() {
		var yes = document.getElementById("flexRadioDefault1");
		radioInput.setAttribute("checked", "checked");
	}
	function selectRadio2() {
		var no = document.getElementById("flexRadioDefault2");
		radioInput.setAttribute("checked", "checked");
	}
</script>


</body>

</html>