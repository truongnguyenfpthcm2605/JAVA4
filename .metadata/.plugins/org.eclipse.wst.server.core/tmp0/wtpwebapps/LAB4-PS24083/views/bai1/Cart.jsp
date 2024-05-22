<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div class="card" style="width: auto; margin-bottom: 5px;box-shadow: rgba(0, 0, 0, 0.4) 0px 0px 10px;">
		<img src="/LAB4-PS24083/imgs/${param.img }" class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">${param.name }</h5>
			<p class="card-text">${param.price }</p>
			<a href="#" class="btn btn-success">Buy Now</a>
		</div>
	</div>