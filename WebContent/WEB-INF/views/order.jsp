<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script charset="utf-8" src="<%=request.getContextPath()%>/kindeditor/kindeditor-all.js"></script>
<script charset="utf-8" src="<%=request.getContextPath()%>/kindeditor/lang/zh-CN.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css">
 <!-- Bootstrap -->
    <link href="<%=request.getContextPath()%>/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="<%=request.getContextPath()%>/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="<%=request.getContextPath()%>/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- bootstrap-daterangepicker -->
    <link href="<%=request.getContextPath()%>/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="<%=request.getContextPath()%>/build/css/custom.min.css" rel="stylesheet">
    <script type="text/javascript">
		function mainplan(id){

				$.get("mainplan/"+id,function(data){
	
						$("#ddgl").html(data);
					})
			}
    </script>
    
</head>
<body class="nav-md">	
<h3>生产订单</h3>
<hr>
		<pg:pager url="" maxPageItems="20" maxIndexPages="20"
		export="offset,currentPageNumber=pageNumber" isOffset="false">
	<table class="table table-striped">
			<thead>
				<th>生产编号</th>
				<th>合同编号</th>
				<th>公司名称</th>
				<th>开始时间</th>
				<th>截止时间</th>
				<th>煤种类</th>
				<th>生产数量(万吨)</th>
				<th>单价</th>
				<th>总金额(万元)</th>
				<th>订单状态</th>
				<th>编制主计划</th>
			</thead>
			<tbody>
				<f:forEach items="${showOrder}" var="user">
					<pg:item>
						<tr>
							<td >${user.orderid }</td>
							<td>${user.contratcoter }</td>
							<td>${user.company}</td>
							<td>${user.begindate}
								</td>
							<td>
								${user.enddate}
							</td>
							<td>
								${user.coalspecies}
							</td>
							<td>
								${user.coalnumber}
							</td>
							<td>
								${user.oneprice}
							</td>
							<td>
								${user.totalprice}
							</td>
							<td>
								${user.orderstate}
							</td>
							<td><a href="javascript:mainplan(${user.id})" class="btn btn-xs btn-success">编制主计划</a>
								
							</td>
						</tr>
					</pg:item>
				</f:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="7" align="center"><pg:index>
							<pg:first>
								<a href="${pageUrl}">首页</a>
							</pg:first>
							<pg:prev>
								<a href="${pageUrl}">上一页</a>
							</pg:prev>
							<pg:pages>
								<f:choose>

						<f:when test="${currentPageNumber eq pageNumber}">
										<font color="red">[${pageNumber }]</font>
									</f:when>
									<f:otherwise>
										<a href="${pageUrl }">[${pageNumber }]</a>
									</f:otherwise>
								</f:choose>
							</pg:pages>
							<pg:next>
								<a href="${pageUrl }">下一页</a>
							</pg:next>
							<pg:last>
								<a href="${pageUrl }">尾页</a>
							</pg:last>
						</pg:index></td>
				</tr>
			</tfoot>
		</table>
	</pg:pager>
	 <footer>
          <div class="pull-right">
            
          </div>
          <div class="clearfix"></div>
        </footer>
</body>
</html>