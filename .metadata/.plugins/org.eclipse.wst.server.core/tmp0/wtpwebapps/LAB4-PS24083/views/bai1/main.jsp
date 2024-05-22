<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
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
	<div class="container">
		<div class="container">
			<header
				class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
				<a href="/"
					class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
					<h2>Action Movie</h2>
				</a>

				<ul
					class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
					<li><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
					<li><a href="#" class="nav-link px-2 link-dark">Features</a></li>
					<li><a href="#" class="nav-link px-2 link-dark">Pricing</a></li>
					<li><a href="#" class="nav-link px-2 link-dark">FAQs</a></li>
					<li><a href="#" class="nav-link px-2 link-dark">About</a></li>
				</ul>

				<div class="col-md-3 text-end">
					<button type="button" class="btn btn-outline-primary me-2">Login</button>
					<button type="button" class="btn btn-primary">Sign-up</button>
				</div>
			</header>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-md-8">
					<div class="row">
						<c:choose>
							<c:when test="${not empty list}">
								<c:forEach var="item" items="${list}">
									<div class="col-md-4">
										<jsp:include page="Cart.jsp">
												<jsp:param value="${item.getImg()}" name="img"/>
												<jsp:param value="${item.getName()}" name="name"/>
												<jsp:param value="${item.getPrice()}" name="price"/>
										</jsp:include>
									</div>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<p>Danh sách rỗng.</p>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="col-md-4">
					<div class="container">
						<%@include file="login.jsp"%>
					</div>
					<hr>
					<div class="container">
						<%@include file="ListGroup.jsp"%>
					</div>
				</div>
			</div>
		</div>
		<hr>
		
		<div class="container" style="background-color: rgba(0, 0, 0, 0.1);">
			<footer class="py-3 my-4">

				<p class="text-center text-muted">Action Movie @2023 All
					Coppyright</p>
			</footer>
		</div>
	</div>
</body>
</html>