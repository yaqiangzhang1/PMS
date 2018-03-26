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

    <script type="text/javascript">
		function mainplan(id){
				$.get("mainplan/"+id,function(data){
						$("#ddgl").html(data);
					})
			}

		function plsh(){
			var checkID=[];
            $("input[name='checkbox_cz']:checked").each(function(i){
                  checkID[i] = $(this).val();
            });
            $.ajax({
            	 type:'post',
                 url:'plsh',
                 dataType:'text',
                 traditional:true,
                 data:{'mainplan_id':checkID},
                 success: function(data){
                    $("#ddgl").html(data);
                  },
                });
			}

		function shbyid(id){
			$.get("shbyid?id="+id,function(data){
				$("#ddgl").html(data);
			})
			
			}
    </script>
     <script type="text/javascript">
   var CheckBox = document.getElementsByName("checkbox_cz")
     function CheckAll(){
         for(var i=0;i<CheckBox.length;i++){CheckBox[i].checked=true;};
         };
        function UnCheck(){
                for(var i=0;i<CheckBox.length;i++){CheckBox[i].checked=false;};
                };   
          function othercheck(){
                for(var i=0;i<CheckBox.length;i++){
                    if(CheckBox[i].checked==true){ CheckBox[i].checked=false;}
                    else{ CheckBox[i].checked=true}
                }
            };       
   
   </script>
</head>
<body class="nav-md">	
<h3>主生产计划</h3>
<hr>
<div id="checkBoxList">
		<pg:pager url="showuser" maxPageItems="20" maxIndexPages="20"
		export="currentPageNumber=pageNumber">
	<table class="table table-striped">
			<thead>
				<th>批量操作</th>
				<th>矿区编号</th>
				<th>矿区名称</th>
				<th>生产单号</th>
				<th>开始时间</th>
				<th>截止时间</th>
				<th>煤种类</th>
				<th>生产数量(万吨)</th>
				<th>生产状态</th>
				<th>审核状态</th>
				<th>审核</th>
			</thead>
			<tbody>
				<f:forEach items="${showMainPlanAll}" var="mainplan">
					<pg:item>
						<tr>
							<td><input type="checkbox" name="checkbox_cz" value="${mainplan.id }"/></td> 
							<td >${mainplan.mine_id }</td>
							<td>${mainplan.mine_name }</td>
							<td>${mainplan.order_id}</td>
							<td>${mainplan.begindate}
								</td>
							<td>
								${mainplan.enddate}
							</td>
							<td>
								${mainplan.coalspecies}
							</td>
							<td>
								${mainplan.number}
							</td>
							<td>
								${mainplan.orderstate}
							</td>
							<td>
								${mainplan.auditstatus}
							</td>
							<td><a href="javascript:shbyid(${mainplan.id })" class="btn btn-xs btn-success">审核</a>
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
	</pg:pager>
	</div>
  <input type="button" value="全选" onclick="CheckAll()" class="btn btn-xs btn-success"/>
  <input type="button" value="不选" onclick="UnCheck()" class="btn btn-xs btn-success"/>
  <input type="button" value="反选" onclick="othercheck()" class="btn btn-xs btn-success"/>
  <input type="button" value="批量审核" onclick="plsh()">
    <footer>
          <div class="pull-right">
            
          </div>
          <div class="clearfix"></div>
        </footer>
</body>
</html>