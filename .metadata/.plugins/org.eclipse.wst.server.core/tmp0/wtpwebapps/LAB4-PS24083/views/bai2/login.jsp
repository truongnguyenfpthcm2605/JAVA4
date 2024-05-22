<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>User Editon</h3>
    <form action="Management" method="post">
        <label class="badge bg-secondary">Tên</label> <input class="form-control" type="text" name="user" value="${form.getUsername() }"> <br>
        <label class="badge bg-secondary">Mật Khẩu</label> <input class="form-control" type="pass" name="pass" value="${form.getPassword() }"> <br>
        <input type="checkbox" name="check" ${form.isRemember()?'checked':'' } value="true"> <label class="badge bg-secondary"> Remember ?</label> <br>
        <hr>
        <button class="btn btn-dark">Submit</button> <br>

  </form>