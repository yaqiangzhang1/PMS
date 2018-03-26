<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>

<script type="text/javascript">
       function xdjh() {
          	var  order_id = $("#orderid").val()+"_";
          	var number = document.getElementsByName("number");
            var tabLen = document.getElementById("tableID");
            var contratcoter = document.getElementsByName("contratcoter");
            var jsonT = "[";
            for (var i = 1; i < tabLen.rows.length-1; i++) {
                alert(contratcoter[i-1].value);
            	 jsonT += '{"mine_id":' + tabLen.rows[i].cells[0].innerHTML + ',"mine_name":"' + tabLen.rows[i].cells[1].innerHTML + 
            	 '","order_id":"' + order_id+tabLen.rows[i].cells[0].innerHTML + '","begindate":"' + tabLen.rows[i].cells[4].innerHTML + '","enddate":"' + tabLen.rows[i].cells[5].innerHTML + 
            	 '","coalspecies":"'+tabLen.rows[i].cells[6].innerHTML + '","number":"' +number[i-1].value+ '","contratcoter":"' +contratcoter[i-1].value+ '"},'
            }
            jsonT= jsonT.substr(0, jsonT.length - 1);
            jsonT += "]";
            console.log(jsonT);
            $.ajax({
                type: 'post',
                url: 'plxdzjh',
                data:{mine:jsonT},
                success: function (data) {
                    	$("#ddgl").html(data);
                }
            });     
        };
    </script>
    
</head>
<body class="nav-md">	
<input type="hidden" id="orderid" value="${showOrderByid.orderid}">
		<pg:pager url="showuser" maxPageItems="20" maxIndexPages="20"
		export="currentPageNumber=pageNumber">
	<table class="table table-striped" id="tableID">
			<thead>
			<tr>
				<th align="center" >矿区编号</th>
				<th align="center">矿区名称</th>
				<th align="center">矿区年生产量(万吨)</th>
				<th align="center">矿区现有储存量(万吨)</th>
				<th align="center">下达时间</th>
				<th align="center">截止时间</th>
				<th align="center">煤种类</th>
				<th align="center">生产数量(万吨)</th>
			</tr>
			</thead>
			<tbody>
				<f:forEach items="${requestScope.showMine}" var="showMineByid">
					<pg:item>
						<tr>
							<td align="center">${showMineByid.id }</td>
							<td align="center">${showMineByid.mineName }</td>
							<td align="center">${showMineByid.output }</td>
							<td align="center">${showMineByid.mineNature }</td>
							<td align="center">${format}</td>
							<td align="center">${showOrderByid.enddate }</td>
							<td align="center">${showOrderByid.coalspecies }</td>
							<td><input type="text" name="number" placeholder="最大可生产${map.get(showMineByid.id)}万吨" required="required" pattern="^${map.get(showMineByid.id)}$|^(\d|[1-9]\d)(\.\d+)*$" >万吨</td>
							<td><input type="hidden" value="${showOrderByid.contratcoter }" name="contratcoter"></td>
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
								<a href="${pageUrl }">上一页</a>
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
		<input type="button" class="btn btn-xs btn-success" value="下达主计划" onclick="xdjh()">
	</pg:pager>
</body>
</html>