<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Gentelella Alela! | </title>

<%-- 
     <!-- Bootstrap -->
    <link href="<%=request.getContextPath() %>/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<%=request.getContextPath() %>/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="<%=request.getContextPath() %>/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="<%=request.getContextPath() %>/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="<%=request.getContextPath() %>/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
 --%>
    <!-- Custom Theme Style -->
    <link href="<%=request.getContextPath() %>/build/css/custom.min.css" rel="stylesheet">
    <script type="text/javascript">
    function addzs(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/addzsgl.jsp",
    		success : function(result) {
    			$("#div2").html(result);
    		}
    	});
	}
    </script>
  </head> 

  <body class="nav-md">

    <div class="container body">
          
        <div class="right_col" role="main" style="margin-left: 0px;">
            <div class="page-title">
              <div class="title_left">
                <h3>持证人员记录</h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>持证人员信息</h2>
                    <div class="clearfix"><a href="javascript:addzs()"><button>发布新考核</button></a></div>
                  </div>
                  <div id="div2"></div>
                  <div class="x_content">
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                      <tr>
                          <th width="80px">姓名</th>
                          <th width="80px">年龄</th>
                          <th width="80px">性别</th>
                          <th>职位</th>
                          <th>证书</th>	
                          <th>持证时间</th>
                          <th>操作</th>
                          </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.zlist}" var="z">
                        <tr>
                          <td>${z.name}</td>
                          <td>${z.age}</td>
                          <td>${z.sex}</td>
                          <td>${z.zhiwei}</td>
                          <td>${z.zhenshu}</td>
                          <td>${z.cztime}</td>
                          <td><a href="#">删除</a>/<a href="#">修改</a></td>
                        </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>

             </div>
            </div>
          </div>

        <!-- /footer content -->
      </div>
    </div>

   <!-- jQuery -<%-- ->
    <script src="<%=request.getContextPath() %>/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="<%=request.getContextPath() %>/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="<%=request.getContextPath() %>/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="<%=request.getContextPath() %>/vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="<%=request.getContextPath() %>/vendors/iCheck/icheck.min.js"></script> --%>
    <!-- Datatables -->
    <script src="<%=request.getContextPath() %>/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/jszip/dist/jszip.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="<%=request.getContextPath() %>/vendors/pdfmake/build/vfs_fonts.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="<%=request.getContextPath() %>/build/js/custom.min.js"></script>

  </body>
</html>