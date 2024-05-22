<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="width: 100%; margin: 10px auto;">
<c:url var="app" value="/account"/>
	<h2>Đăng Nhập</h2>
	<hr>
	<form action="UserManager" method="post" style="width: 60%; margin: 0 auto;">
				<label class="badge bg-secondary">Tên</label> <input class="form-control" type="text" name="user" value="${user }" > <br>
				<label class="badge bg-secondary">Mật Khẩu</label> <input class="form-control" type="password" name="pass" value="${pass }"> <br>
				<input type="checkbox" name="check" value="true"> <label class="badge bg-secondary"> Remember ?</label> <br>
				<hr>
				<button class="btn btn-dark" formaction="${app}/sgin-in">Đăng Nhập</button> <br>
				<h1 class="badge bg-secondary">${message }</h1>
</form>
</div>