<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
  
<!--	<base href="${pageContext.servletContext.contextPath}/">-->
	<meta charset="utf-8"/>
	<title>Tổ chức giao diện</title>
	<link href="../css/layout.css" rel="stylesheet"/>
	<link rel="stylesheet" href="../css/style.css" type="text/css" charset="utf-8"/>
	<style>
        body{
            margin:0px;
            padding:0px;
            background-color:#f0f0f0;
            font-family:Arial;
        }
        .title{
            position:absolute;
            top:100px;
            left:50%;
            margin-left:-204px;
            width:409px;
            height:348px;
            background:transparent url(title.png) no-repeat top left;
        }
        .info{
            position:fixed;
            bottom:0px;
            left:0px;
        }
        .back{
            display:block;
            background:transparent url(back.png) no-repeat top left;
            width:281px;
            height:143px;
        }
        a.dry{
            position:absolute;
            bottom:10px;
            right:10px;
            color:#000;
            font-weight:bold;
            font-size:16px;

        }
    </style>
</head>
<body>	
	<div class="container">
		<header>
			<h1>FPT POLYTECHNIC</h1>
		</header>
		<nav>
            <div id="content">
				<div class="title"></div>       
        	<div class="navigation">
            <ul class="menu" id="menu">
                <li><span class="ipod"></span><a href="" class="first">Players</a></li>
                <li><span class="video_camera"></span><a href="">Cameras</a></li>
                <li><span class="television"></span><a href="">TVs</a></li>
                <li><span class="monitor"></span><a href="">Screens</a></li>
                <li><span class="toolbox"></span><a href="">Tools</a></li>
                <li><span class="telephone"></span><a href="">Phones</a></li>
                <li><span class="print"></span><a href="" class="last">Printers</a></li>
            </ul>
        	</div>
			</div>  
			     
		</nav>
		<article>
                <jsp:include page="${view}"/>
		</article>
		<aside>CONTROL PANEL</aside>
		<footer>&copy; 2021 by Poly. All rightf reserved</footer>
	</div>
	<script type="text/javascript" src="../js/Jquery.js"></script>
    <script type="text/javascript">
            $(function() {
                var d=1000;
                $('#menu span').each(function(){
                    $(this).stop().animate({
                        'top':'-17px'
                    },d+=250);
                });

                $('#menu > li').hover(
                function () {
                    var $this = $(this);
                    $('a',$this).addClass('hover');
                    $('span',$this).stop().animate({'top':'40px'},300).css({'zIndex':'10'});
                },
                function () {
                    var $this = $(this);
                    $('a',$this).removeClass('hover');
                    $('span',$this).stop().animate({'top':'-17px'},800).css({'zIndex':'-1'});
                }
            );
            });
     </script>
</body>
</html>
