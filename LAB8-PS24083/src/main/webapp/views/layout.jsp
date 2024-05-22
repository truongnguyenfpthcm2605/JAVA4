<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
  
	<meta charset="utf-8"/>
	<title>Tổ chức giao diện</title>
	<link href="../css/layout.css" rel="stylesheet"/>
</head>
<body>	
	<div class="container">
		<header>
			<h1>FPT POLYTECHNIC</h1>
		</header>
		<fmt:setLocale value="${sessionScope.lang }" scope="request"/>
		<fmt:setBundle basename="global"  scope="request"/>
		<nav>
				
               <!--  --> 
               <c:url var="home" value="/home"/> 
               <a href="${home}/index" <fmt:message key="menu.home"></fmt:message>></a> |
               <a href="${home}/about"  <fmt:message key="menu.about"></fmt:message>></a> |
               <a href="${home}/contact"  <fmt:message key="menu.contact"></fmt:message>></a> |
               <a href="?lang=en">English</a> |
               <a href="?lang=vi">Tiếng Việt</a>                   
                          
		</nav>
		<article>
                <jsp:include page="${view}"/>
		</article>
		<aside>CONTROL PANEL</aside>
		<footer>&copy; 2021 by Poly. All rightf reserved</footer>
	</div>
</body>
</html>
