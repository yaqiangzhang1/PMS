<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>

<script type="text/javascript">
function mainxx(id,oid){
		$.get("showMainByid/"+id+"/"+oid,function(data){
				$("#mainxx").html(data);
			})
	}

function plxd(id){
	$.get("plxd/"+id,function(data){
		$("#mainxx").html(data);
	})
}
</script>

<body class="nav-md">
	<h3>订单信息</h3>
	<hr>
	<font size="4">
	生产单号：${showOrderByid.orderid}&nbsp;&nbsp;&nbsp;&nbsp; 种类：${showOrderByid.coalspecies}&nbsp;&nbsp;&nbsp;&nbsp;总生产量：${showOrderByid.coalnumber}万吨 &nbsp;&nbsp;&nbsp;&nbsp;已下达计划${showOrderByid.xiadanumber}万吨&nbsp;&nbsp;&nbsp;&nbsp;剩余计划生产量：${shengyunumber}万吨&nbsp;&nbsp;&nbsp;&nbsp;开始时间：${showOrderByid.begindate}
	&nbsp;&nbsp;&nbsp;&nbsp;结束时间：${showOrderByid.enddate}</font>
	<hr>
	<br>
	<div style="background-color: #FFFFFF;width: 1600px;height: 900px">
	<div style="width:300px;float: left;" >
	<button onclick="plxd(${showOrderByid.id})" class="btn btn-xs btn-success">批量下达主计划</button>
	<h2>矿区列表</h2>
	
	<ul style="list-style-type:none">
		<f:forEach items="${requestScope.showMine}" var="mine">
			<li><a href="javascript:mainxx(${mine.id },${showOrderByid.id} )" class="btn btn-xs btn-success">${mine.mineName}</a></li>
		</f:forEach>
	</ul>	
	</div>
	<div style="float: left;" id="mainxx">
		
	</div>
	</div>

</body>
</html>
