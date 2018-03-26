<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测尘巡检监控系统</title>
<!-- Bootstrap -->
<link
	href="<%=request.getContextPath()%>/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="<%=request.getContextPath()%>/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="<%=request.getContextPath()%>/vendors/nprogress/nprogress.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<%=request.getContextPath()%>/build/css/custom.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/templatemo_main.css">
<!-- NProgress -->
<link
	href="<%=request.getContextPath()%>/vendors/nprogress/nprogress.css"
	rel="stylesheet">
<!-- iCheck -->
<link
	href="<%=request.getContextPath()%>/vendors/iCheck/skins/flat/green.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="<%=request.getContextPath()%>/build/css/custom.min.css"
	rel="stylesheet">
</head>
<body>
	<div id="main-wrapper" style="height:880px; background-image: url(images/zoom-bg-4.jpg);background-repeat:no-repeat;
    background-position:center; ">
		
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center templatemo-logo margin-top-20" >
			<h1 class="templatemo-site-title">
				<a href="#">测尘巡检监控系统</a>
			</h1>
			<h3 class="templatemo-site-title">
				☆ <a href="#"><span class="blue">一通</span><span class="green">三防</span></a>
			</h3>
		</div>
		<div id="menu-section"  style="margin: 300px 270px">
			<div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 margin-bottom-20">
				<a href="javascript:cechenrb()" class="change-section">
					<div class="black-bg btn-menu" style="width: 300px">
						<i class="fa fa-cubes"></i>
						<h2>测尘日报</h2>
					</div>
				</a>
			</div>
			<div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 margin-bottom-20">
				<a href="javascript:cechenzb()" class="change-section">
					<div class="black-bg btn-menu" style="width: 300px; margin-left: 60px;">
						<i class="fa fa-tasks"></i>
						<h2>测尘周报</h2>
					</div>
				</a>
			</div>
			<div class="col-xs-6 col-sm-3 col-md-3 col-lg-3 margin-bottom-20">
				<a href="javascript:cechenyb()" class="change-section">
					<div class="black-bg btn-menu" style="width: 300px; margin-left: 120px;">
						<i class="fa fa-send"></i>
						<h2>测尘月报</h2>
					</div>
				</a>
			</div>

			<br> <br> <br>
			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 margin-bottom-20">
				<a href="javascript:cechenjz()" class="change-section">
					<div class="black-bg btn-menu" style="width: 470px;">
						<h2>防尘措施管理机制</h2>
					</div>
				</a>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 margin-bottom-20">
				<a href="javascript:cechengonggao()" class="change-section">
					<div class="black-bg btn-menu" style="width: 470px; margin-left: -50px;">
						<h2>测尘巡检相关公告</h2>
					</div>
				</a>
			</div>
		</div>
		
	</div>
	<script type="text/javascript">
	function cechenrb(){
		$.get("jsp/cechen_rb.jsp",function(date){
			$("#yufang").html(date)
		})
	}
	function cechenzb(){
		$.get("jsp/cechen_zb.jsp",function(date){
			$("#yufang").html(date)
		})
	}
	function cechenyb(){
		$.get("jsp/cechen_yb.jsp",function(date){
			$("#yufang").html(date)
		})
	}
	function cechenjz(){
		$.get("jsp/cechenjz.jsp",function(date){
			$("#yufang").html(date)
		})
	}
	function cechengonggao(){
		$.get("jsp/cechen_gonggao.jsp",function(date){
			$("#yufang").html(date)
		})
	}
	
	</script>
</body>
</html>