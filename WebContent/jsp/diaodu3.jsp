<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Gentelella Alela! | </title>


  </head>

  <body class="nav-md">
        <!-- page content -->
        <div class="right_col" role="main" style="margin-left: 0px">
          <div class="" style="height: 960px">
            <div class="page-title">
              <div class="title_left">
                <h3>预案管理窗口</h3>
              </div>
              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>

            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>应急预案</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table  border="1" width="800" height="" class="table" >
                      <thead>
                        <tr  style="text-align: center;">
                          <th style="text-align: center;">事故名称</th>
                          <th style="text-align: center;">等级</th>
                          <th style="text-align: center;">预案</th>
                          <th style="text-align: center;" >操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.list }" var="s">
                        <tr style="text-align: center;">
                          <td >${s.name}</td>
                          <td >${s.dengji}</td>
                          <td>${s.yuan}</td>
                          <td><a href="javascript:yuantoupdate(${s.id})">修改</a></td>
                        </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                  <button onclick="yuanadd()">添加</button>
                   <div id="div2"></div> <div id="div3"></div>
                </div>
              </div>
              <div class="clearfix"></div>
            </div>
          </div>
        </div>
        <!-- /page content -->

   
    <script type="text/javascript">
    //预案添加
    function yuanadd(){
    	alert(123)
		//$("#div2").load("jsp/yuanadd.jsp");
		$.get("yinhuanAll",function(data){
			$("#div2").html(data);
		})
	}
    function yuantoupdate(id){
		$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url :"yuantoupdate/"+id,
    		success : function(result) {
    			$("#div2").html(result);
    			
    		}
    	});
    }
    </script>
  </body>
</html>