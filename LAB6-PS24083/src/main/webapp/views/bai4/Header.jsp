<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
.titlewep {
	font-size: 2rem;
	color: #66347F;
	font-weight: bold;
	font-style: italic;
}

.navs a {
	font-size: 15px;
}

.navs a:hover {
	transform: scale(1.05);
	transition: all linear 0.5s;
	color: #66347F;
}
/* pay */
.contentdialog {
	width: auto;
	width: 1000px;
	margin: 0;
	border-radius: 10px;
}

.pay {
	display: flex;
	justify-content: space-around;
	width: 100%;
}

.pay>div {
	text-align: center;
	padding: 10px;
	background-color: rgba(0, 0, 0, 0.1);
	border-radius: 20px;
	margin: 10px;
	width: 45%;
}

.pay>div:hover {
	transform: scale(1.02);
	transition: all linear .5s;
	box-shadow: rgba(14, 30, 37, 0.12) 0px 2px 4px 0px,
		rgba(14, 30, 37, 0.32) 0px 2px 16px 0px;
	background-color: rgba(0, 0, 0, 0.04);
}

.pay h3 {
	margin-bottom: 10px;
}

.pay a {
	border-radius: 10px;
}
a {
	color: black;
}

</style>
<div class="onhead">
	<c:url var="app" value="/bai4" />

	<div class="header"
		style="background-color: rgba(0, 0, 0, 0.1); height: auto;">
		<div>
			<div class="container d-flex flex-wrap"
				style="justify-content: space-between; text-align: center; margin: 0px auto; padding: 10px;">
				<a href="/ASM-PS24083/views/jsp/index.jsp"
					class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
					<svg class="bi me-2" width="40" height="32">
                            <use xlink:href="#bootstrap"></use>
                        </svg> <span class=" titlewep">Bai 4 &#169;</span>
				</a>
				<div
					style="display: flex; justify-content: space-between; align-items: center; cursor: pointer;"
					data-toggle="modal" data-target="#exampleModal">

					<h5
						style="margin: 0 0 0 10px; font-style: italic; font-family: 'Times New Roman', Times, serif; color: aliceblue; font-weight: bold;">
						Đăng Nhập</h5>
				</div>
			</div>
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content" style="border-radius: 10px;">
						<div class="modal-header">
							<a class="modal-title" id="exampleModalLabel"
								href="/ASM-PS24083/views/jsp/index.jsp"><span
								class=" titlewep">Manager&#169;</span></a>
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<div class="modal-body">
							<form>
								<div class="form-group valid">
									<label for="exampleInputEmail1" class="badge bg-success">Tên
										Tài Khoản</label> <input type="text" class="form-control" name="id"
										id="exampleInputEmail1" placeholder="Nhập tên tài khoản"
										required>

								</div>
								<div class="form-group valid">
									<label for="exampleInputPassword1" class="badge bg-success" >Mật
										Khẩu</label> <input type="password" class="form-control"
										name="password" id="exampleInputPassword1"
										placeholder="Nhập mật khẩu" required>
								</div>
								<div class="form-group form-check">
									<input type="checkbox" class="form-check-input"
										id="exampleCheck1"> <label for="exampleCheck1"
										class="badge bg-secondary">Nhớ tài khoản?</label>
								</div>

							</form>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Đóng</button>
							<button type="button" class="btn btn-dark" data-dismiss="modal">Đăng
								Nhập</button>
						</div>
					</div>
				</div>
			</div>
		</div>


	</div>
	<div class="rows bg-light">
		<nav class="navbar navbar-expand-lg navbar-light bg-light"
			style="margin-left: 10%;">
			<a class="navbar-brand" href="${app}/top10"><span><i
					class='bx bxs-home'></i></span>Top 10</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto navs">

					<li class="nav-item"><a class="nav-link"
						href="${app}/procedure" style="color: green; cursor: pointer;"
						class='bx bxs-heart'><i class='bx bxs-book-content'></i> Tổng Hợp </a></li>
					
				
				</ul>
			</div>
		</nav>

	</div>


</div>
<div class="modal fade" id="vd" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" style="margin: 20px 14%" role="document">
		<div class="modal-content contentdialog">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">
					<span class="badge badge-warning"> Vip Action Movie&#169;</span>
				</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body ">
				<div class="container pay">
					<div>
						<h2>Gói Tháng</h2>
						<p>Trải nghiệm của bạn sẽ tuyệt vời hơn !</p>
						<div style="display: flex; justify-content: space-evenly;">
							<h4 style="text-decoration: line-through;">249.000 VND</h4>
							<button class="btn btn-light"
								style="border-radius: 10px; color: red;">Giảm 40%</button>
						</div>
						<hr>
						<h2>163.000 VND</h2>
						<h5 style="color: red;">Thời gian sử dụng : 30 Ngày</h5>
						<h4 style="font-weight: bold;">Các Quyền lợi khi mua vip</h4>
						<ul style="list-style: none;">
							<li>Xem Phim ở độ phẩn giải FULLHD 1080P 60fps</li>
							<li>Đặt quyền xem được những phim vip ở web</li>
							<li>Chia sẻ trên mọi nền tảng không bị giới hạn</li>
						</ul>
						<a class="btn btn-success" data-dismiss="modal" aria-label="Close">Mua
							Ngay</a>
					</div>
					<div>
						<h2>Gói Năm</h2>
						<p>Trải nghiệm của bạn sẽ tuyệt vời hơn !</p>
						<div style="display: flex; justify-content: space-evenly;">
							<h4 style="text-decoration: line-through;">1.249.000 VND</h4>
							<button class="btn btn-light"
								style="border-radius: 10px; color: red;">Giảm 50%</button>
						</div>
						<hr>
						<h2>623.000 VND</h2>
						<h5 style="color: red;">Thời gian sử dụng : 365 Ngày</h5>
						<h4 style="font-weight: bold;">Các Quyền lợi khi mua vip</h4>
						<ul style="list-style: none;">
							<li>Xem Phim ở độ phẩn giải 4K HDR 60fps</li>
							<li>Đặt quyền xem được những phim vip ở web</li>
							<li>Chia sẻ không bị giới hạn và lưu video yêu thích</li>

						</ul>
						<a class="btn btn-success" data-dismiss="modal" aria-label="Close">Mua
							Ngay</a>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>
