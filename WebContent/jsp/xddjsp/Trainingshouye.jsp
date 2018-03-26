<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>安全培训科目</title>


    <!-- Bootstrap -->
    <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
   <link href="../../vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../../build/css/custom.min.css" rel="stylesheet">
    <script type="text/javascript">
    function kemu(){
		$.get("TrainingSubjects.jsp",function(date){
		$("#div1").html(date);});
	}
    function plan(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/getAllPlan",
    		success : function(result) {
    			$("#div1").html(result);
    			
    		}
    	});
	}
    function planjd(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/getpxjd",
    		success : function(result) {
    			$("#div1").html(result);
    			
    		}
    	});
	}
    function zsgl(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/getAllzs",
    		success : function(result) {
    			$("#div1").html(result);
    			
    		}
    	});

	}
    </script>
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>山煤国际生产管理</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> 安全管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.jsp">隐患管理</a></li>
                      <li><a href="index2.jsp">安全质量标准管理</a></li>
                      <li><a href="index3.jsp">危险源管理</a></li>
                      <li><a href="index4.jsp">安全持证管理</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> 预防预警 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="yufang1.jsp">通风</a></li>
                      <li><a href="yufang2.jsp">瓦斯巡检</a></li>
                      <li><a href="yufang3.jsp">测风巡检</a></li>
                      <li><a href="yufang4.jsp">测尘巡检</a></li>
                     
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i> 计划管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="jihua1.jsp">周计划管理</a></li>
                      <li><a href="jihua2.jsp">月计划管理</a></li>
                      
                    </ul>
                  </li>
                  <li><a><i class="fa fa-table"></i> 生产调度<span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="diaodu1.jsp">调度指令管理</a></li>
                      <li><a href="diaodu2.jsp">生产调度日志</a></li>
                      <li><a href="diaodu3.jsp">应急预案管理</a></li>
                      <li><a href="diaodu4.jsp">应急指挥</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i> 安全培训 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="javascript:kemu()">培训科目</a></li>
                      <li><a href="javascript:plan()">培训计划</a></li>
                      <li><a href="javascript:planjd()">培训实施进度</a></li>
                      <li><a href="javascript:zsgl()">岗位考核</a></li>
                      <li><a href="javascript:zsgl()">证件发放</a></li>
                      <li><a href="javascript:zsgl()">岗位持证人员管理</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-clone"></i>统计分析 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="tongji1.jsp">一通三防报表</a></li>
                      <li><a href="tongji2.jsp">计划完成/实际完成对比</a></li>
                      <li><a href="tongji3.jsp">人力支出统计</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
              </div>
              </div>
              </div>
              </div>
              </div>
              <div id="div1"></div>


    <!-- jQuery -->
    <script src="../../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../../vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="../../vendors/iCheck/icheck.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="../../build/js/custom.min.js"></script>
  </body>
</html>