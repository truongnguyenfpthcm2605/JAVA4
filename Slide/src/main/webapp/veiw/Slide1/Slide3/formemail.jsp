<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<div class="container">
        <h1>Send Email</h1>
        <form action="SendEmail" method="post" enctype="multipart/form-data">
            <div class="box">
                <label for="user">Email</label>
                <input type="text" name="user" id="user" value="truongnvps24083@fpt.edu.vn">

            </div>
            <div class="box">
                <label for="pass">Password</label>
                <input type="password" name="pass" id="pass" value="dkfkilftpeszjupq">

            </div>
            <div class="box">
                <label for="user">TO</label>
                <input type="text" name="to" id="to">

            </div>
            <div class="box">
                <label for="cc">CC</label>
                <input type="text" name="cc" id="cc">

            </div>
            <div class="box">
                <label for="user">BCC</label>
                <input type="text" name="bcc" id="bcc">

            </div>
            <div class="box">
                <label for="sub">Subject</label>
                <input type="text" name="sub" id="sub">

            </div>
            <div class="box">
                <label for="ct">Content</label>
                <textarea name="content" id="ct" cols="30" rows="10"></textarea>

            </div>
           
            <div class="box">
                <span>${message}</span>
            </div>
            <div class="but">
                <button class="cancel" type="button">Cancel</button>
                <button class="done">Send</button>
            </div>
        </form>
    </div>
</body>
</html>