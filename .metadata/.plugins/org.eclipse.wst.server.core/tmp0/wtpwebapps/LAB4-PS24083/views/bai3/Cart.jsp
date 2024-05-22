<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<body>
	<div class="container" style="width: 30%; margin: 10px auto;">
		<div class="card" style="width: auto; margin-bottom: 5px;box-shadow: rgba(0, 0, 0, 0.4) 0px 0px 10px;">
			<img src="/LAB4-PS24083/imgs/${item.img }" class="card-img-top"
				alt="...">
			<div class="card-body">
					<h3>${item.name}</h3>
				<p class="card-title" style="text-decoration: line-through;">Giá gốc : <fmt:formatNumber value="${item.price}" /></p>
				<c:set var="newprice" value="${item.price*(1- item.discount) }" />
				<h5 class="card-text">
					Giá mới :
					<fmt:formatNumber value="${newprice}" />
				</h5>
				<c:choose>
					<c:when test="${newprice< 10}">Giá thấp</c:when>
					<c:when test="${newprice> 100}">Giá cao</c:when>
					<c:otherwise>Bình thường</c:otherwise>
				</c:choose>
				<br>
				<p> Ngày Đăng : ${item.date }</p>
				<a href="#" class="btn btn-success">Buy Now</a>
			</div>
		</div>
	</div>
</body>
</html>