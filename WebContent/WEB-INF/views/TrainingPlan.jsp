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
    	function deleteplan(id){
    		$.ajax({
        		type : "GET", //请求的方式，也有get请求
        		url : "<%=request.getContextPath() %>/deleteplan?id="+id,
        		success : function() {
        			
        		}		
        	});
    	}
    	function addplan(){
    		$("#div2").load("jsp/xddjsp/addPlan.jsp");
    	}
    	function updategw(){
    		alert(111);
    		$("#div2").load("jsp/xddjsp/updategwplan.jsp");
    	}
    </script>
  </head> 

  <body class="nav-md">

    <div class="container body">
          
        <div class="right_col" role="main" style="margin-left: 0px;">
            <div class="page-title">
              <div class="title_left">
                <h3>培训计划</h3>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>安全意识培训</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a href="javascript:addplan()"><button>发布新计划</button></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div id="div2"></div>
                  <div class="x_content">
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr align="center">
                          <th>计划摘要</th>
                          <th>主要负责人</th>
                          <th>培训时间</th>
                          <th>查看名单</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.list }" var="l">
                        <tr>
                          <td>${l.trainabstract}</td>
                          <td>${l.personincharge}</td>
                          <td>${l.releasetime}</td>
                          <td>查看详情</td>
                          <td><a href="javascript:deleteplan(${l.id})">删除记录</a></td>
                        </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>岗位考核培训</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a href="jsp/xddjsp/addGplan.jsp"><button>发布新考核</button></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table id="datatable-checkbox" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>岗位类别</th>
                          <th>培训批次</th>
                          <th>培训科目</th>
                          <th>培训讲师</th>
                          <th>开课时间</th>
                          <th>结课时间</th>
                          <th>培训地点</th>
                          <th>查看名单</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.glist}" var="g">
                        <tr>
                          <td>${g.gleibie}</td>
                          <td>${g.gpici}</td>
                          <td>${g.gkemu}</td>
                          <td>${g.gteacher}</td>
                          <td>${g.gbegintime}</td>
                          <td>${g.gendtime}</td>
                           <td>${g.gdidian}</td>
                           <td>查看名单</td>
                           <td><a href="javascript:updategw()">修改</a></td>
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