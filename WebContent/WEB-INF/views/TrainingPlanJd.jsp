<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Gentelella Alela! | </title>


    <script type="text/javascript">
    	function deleteplan(id){
    		$.ajax({
        		type : "GET", //请求的方式，也有get请求
        		url : "<%=request.getContextPath() %>/deleteplan?id="+id,
        		success : function() {
        			
        		}		
        	});
    	}
    </script>
  </head> 

  <body class="nav-md">

    <div class="container body">
          <div class="left_col scroll-view">
          
        <div class="right_col" role="main" style="margin-left: 0px;">
          <div class="">
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
                      <li><a href="addPlan.jsp"><button>发布新计划</button></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr align="center">
                          <th>计划摘要</th>
                          <th>主要负责人</th>
                          <th>培训时间</th>
                          <th>培训进度</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.tplist }" var="t"> 
                        <tr>
                          <td>${t.trainabstract}</td>
                          <td>${t.personincharge}</td>
                          <td>${t.releasetime}</td>
                          <td>${t.pkhjd}</td>
                          <td><a href="javascript:deleteplan(${t.id})">删除记录</a></td>
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
                          <th>培训地点</th>
                          <th>培训进度</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.jdlist}" var="j">
                        <tr>
                          <td>${j.gleibie}</td>
                          <td>${j.gpici}</td>
                          <td>${j.gkemu}</td>
                          <td>${j.gteacher}</td>
                           <td>${j.gdidian}</td>
                           <td>${j.khjd}</td>
                           <td></td>
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