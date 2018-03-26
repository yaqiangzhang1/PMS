<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户管理</title>

    <!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<%=request.getContextPath()%>/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="<%=request.getContextPath()%>/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="<%=request.getContextPath()%>/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="<%=request.getContextPath()%>/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="<%=request.getContextPath()%>/build/css/custom.min.css" rel="stylesheet">
   <script type="text/javascript">
	function addyhxx(){
			var gonghao = $("#gonghao").val();
			var u_name = $("#u_name").val();
			var password = $("#u_password").val();
			var password1 = $("#u_password1").val();
			var qx = $("#u_bmid").val();
			
			alert(qx)
			if(password!="" && password==password1){
				$.ajax({
						type:"POST",
						url:"addyhxx?gonghao="+gonghao+"&u_name="+u_name+"&password="+password+"&qx="+qx,
						success:function(data){
								$("#ddgl").html(data);
							}
					})
				}
			else{
					alert("两次密码不一致！！！");
				}
		}

	function deleteyh(id){
			$.ajax({
				type:"POST",
				url:"deleteyh?id="+id,
				success:function(data){
						$("#ddgl").html(data);
					}
				})
		}
   </script>
  </head>

  <body class="nav-md">
    
        <!-- page content -->
        <div class="right_col" role="main" style="margin-left: 0px">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>用户信息管理</h3>
              </div>
            </div>
<!-- 添加井工 -->
            <div class="clearfix"></div>
            <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>增加用户信息</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
            
            
            <div class="form-horizontal" >
			<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">用户工号</label>
				<div class="col-sm-8">
					<input type="text"  required="true"  class="form-control" id="gonghao"
						placeholder="输入工号" name="gonghao"  onchange="CheckChinese('test',this.value)" >
				</div>
			</div>
			
			<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">用户姓名</label>
				<div class="col-sm-8">
					<input type="text"  required="true"  class="form-control" id="u_name"
						placeholder="输入姓名" name="u_name" >
				</div>
			</div>
			
				<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">用户密码</label>
				<div class="col-sm-8">
					<input type="password"  required="true"  class="form-control" id="u_password"
						placeholder="输入密码" name="u_password" >
				</div>
			</div>
			
				<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">确认密码</label>
				<div class="col-sm-8">
					<input type="password"  required="true"  class="form-control" id="u_password1"
						placeholder="确认密码" name="u_password1" >
				</div>
			</div>
			
			<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">角色</label>
				<div class="col-sm-8">
				<select class="form-control" id="u_bmid" placeholder="权重" name="U_bmid">
				<f:forEach items="${requestScope.showBumenAll}" var="bumen">
					<option>${bumen.bm_name}</option>
				</f:forEach>
					
				</select>
					
				</div>
			</div>
					
			
	
			<div class="col-sm-offset-2 col-sm-8">
					<button type="submit" class="btn btn-success" onclick="addyhxx()">提交</a></button>
					<button type="reset" class="btn btn-warning">重填</button>
			</div>
			</div>
			
			
                </div>
              </div>
            </div>
 
                    </div>
            
            
  				  <!-- 查询用户信息 -->
              <div class="col-md-12 col-sm-12 col-xs-12" style="float: left">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>用户信息<small></small></h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>编号</th>
                          <th>工号</th>
                          <th>姓名</th>
                          <th>角色</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                    <tbody>
						<f:forEach items="${requestScope.showUserAll}" var="user">
					
						<tr>
							<td>${user.u_id }</td>
							<td>${user.u_gonghao }</td>
							<td>${user.u_name }</td>
							<td>${user.u_bmid}</td>
							<td><a href="javascript:deleteyh(${user.u_id})" class="btn btn-xs btn-success">删除</a></td>

						</tr>
					
				</f:forEach>
			</tbody>
            </table>
                  </div>
                </div>
              </div>
            
             
          
            </div>
          </div>
       
            
        <!-- /page content -->

        <footer>
          <div class="pull-right">
            
          </div>
          <div class="clearfix"></div>
        </footer>
 
    <!-- jQuery -->
    <script src="<%=request.getContextPath()%>/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="<%=request.getContextPath()%>/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="<%=request.getContextPath()%>/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="<%=request.getContextPath()%>/vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="<%=request.getContextPath()%>/vendors/iCheck/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="<%=request.getContextPath()%>/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/jszip/dist/jszip.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="<%=request.getContextPath()%>/vendors/pdfmake/build/vfs_fonts.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="../build/js/custom.min.js"></script>

  </body>
</html>