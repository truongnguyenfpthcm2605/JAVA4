<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Object a = request.getAttribute("hobby");
		String gender =(String) request.getAttribute("gender");
		String option =(String) request.getAttribute("select");
		String[] s = {"Không có gi"};
		if(a!=null){
			s = (String[]) a;
		}
	%>
	<h1> Chao bạn ${name }</h1>
	<h1> <%= gender %></h1>
	<h1> <%= option %></h1>
	
		<%for(String item : s ){ %>
				<p><%= item %></p>
		<%} %>	
	
</body>
</html>