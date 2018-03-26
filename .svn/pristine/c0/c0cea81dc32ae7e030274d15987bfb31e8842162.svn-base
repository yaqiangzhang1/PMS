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
        <div class="right_col" role="main" style="margin-left: 0px">
          <div class="" style="height: 960px">
            <div class="page-title">
              <div class="title_left">
                <h3>应急指挥</h3>
              </div>
              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                   <!-- <input type="text" class="form-control" placeholder="Search for..."> -->
                    <span class="input-group-btn">
                     <button class="btn btn-default" type="button"></button>
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>应急指挥动态显示 </h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table class="table" width="800" height="">  
                      <tbody>
                    <c:forEach items="${requestScope.list2 }" var="s">                
                        <tr>
                          <td>事故名称：</td>
                          <td><input type="hidden" id="sg" value="${s.sgname}" onchange="shigu()"> ${s.sgname}</td>
                          <td>事故地点：</td>
                          <td>${s.address}</td>
                        </tr>
                        <tr>
                          <td>发生时间：</td>
                          <td>${s.kstime}</td>
                      		<td>持续时间：</td>
                      		<td>${s.cxtime}</td>
                        </tr>
                        <tr>
                          <td>伤亡情况：</td>
                          <td>死亡${s.death}人<br>受伤${s.injured}人<br>失联${s.shilian}人</td>
                          <td>预案启动时间：${s.qdtime}<br><br>
                          	救援时间：${s.jytime}</td>
                          <td></td>
                        </tr>
                        <tr>
                          <td>事故最新动态</td>
                          <td>${s.jieguo}</td>
                        </tr>
                    </c:forEach>
                      </tbody>
                    </table>
                    <div>
						<h3>应急预案启动</h3>
						<div>
						事故类型：<input type="text" id="sgname" name="sgname" onchange="dj()">
							等级：<select name="dengji" >
							<c:forEach items="${requestScope.list }" var="h">
									<option id="dengji" value="${h.dengji}">${h.dengji}</option>
								</c:forEach>	
								</select><br>
								<button onclick="qiyong()">启用</button>
							</div>
						</div>
                  </div>
                </div>
              </div>
              <div class="clearfix"></div>
              <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>指挥机构应急指挥人员</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <table class="table table-bordered">
                      <thead>
                        <tr>
                          <th>岗位</th>
                          <th>姓名</th>
                          <th>职务</th>
                          <th>联系电话</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach items="${requestScope.list1}" var="m">
                        <tr>
                          <td name="gangwei">${m.gangwei}</td>
                          <td name="name">${m.name}</td>
                          <td name="zhiwu">${m.zhiwu}</td>
                          <td name="dianhua">${m.dianhua}</td>
                          <td><a href="javascript:toupdate(${m.id})">修改</a></td>
                        </tr>
                        </c:forEach>
                      </tbody>
                    </table>
                   <button onclick="zhihuiadd()">添加</button>
                   <div id="div"></div><div id="div1"></div>
                  </div>
                </div>
              </div>
              <div class="clearfix"></div>
            </div>
          </div>
        </div>
  
	 <!-- <script src="js/jquery.min.js"></script> -->
	 <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script>
    $().ready(function(){
    	alert(12)
    	var name=document.getElementById("sg").value;
    	alert(name);
    	$("#sgname").val(name)
    }
	function zhihuiadd(){
		$("#div").load("jsp/zhihuiadd.jsp");
	}
	function toupdate(id){
	    	$.ajax({
	    		type : "GET", //请求的方式，也有get请求
	    		url :"toupdate/"+id,
	    		success : function(result) {
	    			$("#div").html(result);
	    		}
	    	});
	}
	function dj(){
		var name=document.getElementById("sgname").value;
		alert(name)
		$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url :"yuanbyname/"+name,
    	});
	}
	function qiyong(){
		var name=document.getElementById("sgname").value;
		alert(name)
		var dengji=document.getElementById("dengji").value;
		$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url :"qiyong/"+name+"/"+dengji,
    	});
	}
	</script>
  </body>
</html>