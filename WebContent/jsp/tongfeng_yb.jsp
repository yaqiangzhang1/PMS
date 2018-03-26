<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>通风月报</title>
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
	
	<script type="text/javascript">
	$().ready(function(){
		$.ajax({
			type:"POST",
			url:"http://172.16.8.15:8080/MES/tongfeng",
			dataType:"jsonp",
			jsonp:"callbackparam",
			success:function(data){
				var tfyb = "<tr>";
		           $.each(data,function(index,item){
		        	 tfyb += "<td><input type='checkbox' class='flat' name='table_records'></td><td>"+item.id+"</td><td>"+item.didian+"</td><td>"+item.biansu+"</td><td>"+item.fengsu+"</td><td>"+item.fengliang+"</td><td>"+item.jiawan+"</td><td>"+item.eryanghuatan+"</td><td>"+item.wendu+"</td><td>"+item.shijian+"</td><td>"+item.zhuangtai+"</td><td><input type='button' value='审核' class='flat' ></td></tr>"
		        	 
		           })
		           
		           $("#tfyb").html(tfyb);
		       }
		})
	})
</script>	
</head>
<body>
	<div id="main-wrapper">


		<div
			class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center templatemo-logo margin-top-20">
			<h1 class="templatemo-site-title">
				<a href="#">通风预警监控系统</a>
			</h1>
			<h3 class="templatemo-site-title">
				☆ <a href="#"><span class="blue">一通</span><span class="green">三防</span></a>
			</h3>
		</div>
		
		<div class="image-section">
                <div class="image-container">
                    <img src="images/zoom-bg-2.jpg" id="menu-img" class="main-img inactive" alt="Zoom HTML5 Template by templatemo.com">
                    <img src="images/zoom-bg-1.jpg" id="products-img" class="inactive" alt="Product">
                    <img src="images/zoom-bg-3.jpg" id="services-img"  class="inactive" alt="Services">
                    <img src="images/zoom-bg-4.jpg" id="about-img" class="inactive" alt="About">
                    <img src="images/zoom-bg-5.jpg" id="contact-img" class="inactive" alt="Contact">
                    <img src="images/zoom-bg-6.jpg" id="company-intro-img" class="main-img inactive" alt="Company Intro">
                    <img src="images/zoom-bg-7.jpg" id="testimonials-img" class="main-img inactive" alt="Testimonials">
                </div>
        </div>

		<div class="container">
			<div>
				<div class="templatemo-content" style="margin-top: 200px">
				
					<div class="x_panel">
						<div class="x_title">
							<h4>通风月报</h4>
							<ul class="nav navbar-right panel_toolbox">
								<li><a class="collapse-link"><i
										class="fa fa-chevron-up"></i></a></li>
								<li><a class="close-link"><i class="fa fa-close"></i></a></li>
							</ul>
							<div class="clearfix"></div>
						</div>

						<div class="x_content">


							<div class="table-responsive">
								<table class="table table-striped jambo_table bulk_action">
									<thead>
										<tr class="headings">
											<th><input type="checkbox" id="check-all" class="flat">
											</th>
											<th class="column-title">序列号</th>
											<th class="column-title">地点</th>
											<th class="column-title">变速</th>
											<th class="column-title">风速(m/s)</th>
											<th class="column-title">风量 (CFM)</th>
											<th class="column-title">CH4</th>
											<th class="column-title">CO2</th>
											<th class="column-title">温度</th>
											<th class="column-title">时间</th>
											<th class="column-title">状态</th>
											<th class="column-title no-link last">操作</th>
											<th class="bulk-actions" colspan="9"><a class="antoo"
												style="color: #fff; font-weight: 500;">批量操作 ( <span
													class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
											</th>
										</tr>
									</thead>

									<tbody id="tfyb"></tbody>
								</table>
							</div>
						</div>
					</div>




					<div class="row margin-top-20">
						<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6  pull-right">
							<a href="#menu" class="change-section">
								<div class="black-bg btn-menu" style="width: 400px; margin-left: 400px;">
									<h2>
										<a href="index.jsp">返回上层菜单</a>
									</h2>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>		

				<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
				<script src="<%=request.getContextPath()%>/js/jquery-ui.min.js"></script>
				<script
					src="<%=request.getContextPath()%>/js/jquery.backstretch.min.js"></script>
				<script src="<%=request.getContextPath()%>/js/templatemo_script.js"></script>
				<script
					src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.min.js"></script>
				<script
					src="<%=request.getContextPath()%>/vendors/fastclick/lib/fastclick.js"></script>
				<script
					src="<%=request.getContextPath()%>/vendors/nprogress/nprogress.js"></script>
				<script
					src="<%=request.getContextPath()%>/vendors/iCheck/icheck.min.js"></script>
				<script src="<%=request.getContextPath()%>/build/js/custom.min.js"></script>
</body>
</html>