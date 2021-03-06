<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Gentelella Alela! | </title>
  </head>
  <body class="nav-md">
        <!-- page content -->
        <div class="right_col"  style="margin-left: 0px">
          <div class="" style="height: 960px">
            <div class="page-title">
              <div class="title_left">
                <h3>调度指令管理</h3>
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
              <div class="col-md-6 col-sm-6 col-xs-12" style="width: 65%">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>产量记录</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table class="table" border="1">
                      <thead>
                        <tr>
                          <th rowspan="2" >矿名</th>
                          <th rowspan="2" >名称</th>
                          <th colspan="5" style="text-align: center;">当日累计产量</th>
                          <th colspan="4" style="text-align: center;">当月累计产量</th>
                          <th colspan="4" style="text-align: center;">年累计产量</th>
                        </tr>
                        <tr>
                          <th>日期</th>
                          <th>日实际产量</th>
                          <th>日计划产量</th>
                          <th>日超亏</th>
                          <th>备注</th>
                          <th>月份</th>
                          <th>月实际产量</th>
                          <th>月计划产量</th>
                          <th>月超亏</th>
                          <th>年份</th>
                          <th>年实际产量</th>
                          <th>年计划产量</th>
                          <th>年超亏</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.list}" var="m">
                        <tr>
                          <td name="mine_name" >${m.mine_name}</td>
                          <td name="name" id="cname">${m.name}</td>
                          <td name="rqi" id="crqi"></td>
                          <td name="rshiji" id="crshiji"></td>
                          <td name="rplan" id="crplan">${m.rplan}</td>
                          <td name="rchaokui" id="crchaokui"></td>
                          <td name="beizhu" id="cbeizhu"></td>
                          <td name="month" id="month"></td>
                          <td name="mshiji" id="cmshiji"></td>
                          <td name="mplan" id="cmplan">${m.mplan}</td>
                          <td name="mchaokui" id="cmchaokui"></td>
                          <td name="year" id="year"></td>
                          <td name="yshiji" id="cyshiji"></td>
                          <td name="yplan" id="cyplan">${m.yplan}</td>
                          <td name="ychaokui" id="cychaokui"></td>
                        </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                  </div>
                  <div id="zmx"></div>
                </div>
              </div>
              <div class="clearfix"></div> 
            </div>
          </div>
        </div>
        <!-- /page content -->
    <script type="text/javascript">
    $().ready(function(){
    	alert(111)
		$.ajax({
			type:"POST",
			url:"http://172.16.8.15:8080/MES/",
			dataType:"jsonp",
			jsonp:"",
			success:function(data){
				alert(data);
				var day=data.date;
				var crshiji=data.rawcoalnum;
				var xrshiji=data.blindcoalnum+data.browncoalnum+data.softcoalnum+data.bogheadcoalnum;
				$.ajax({
					type:"POST",
					url:"addshiji?mine_name="+mine_name+"&crshiji="+crshiji+"&xrshiji="+xrshiji+"&day="+day,
					success:function(result){
						$("#ddgl").html(result);
				    }
				})
		    }
		})
	})
    </script>
  </body>
</html>