<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript">
function update(){
	var id= $("#id").val();
	var gangwei= $("#gangwei").val();
	var name = $("#name").val();
	var zhiwu = $("#zhiwu").val();
	var dianhua = $("#dianhua").val();
	$.get("update?id="+id+"&gangwei="+gangwei+"&name="+name+"&zhiwu="+zhiwu+"&dianhua="+dianhua,function(data){
		$("#ddgl").html(data);
	})
}
</script>
</head>
<body>

	<c:forEach items="${requestScope.list}" var="m">
	<input type="hidden" id="id" value="${m.id}">
	岗位：${m.gangwei}<input type="hidden" id="gangwei" value="${m.gangwei}"><br>
	姓名：<input type="text" id="name" required  value="${m.name}"><br>
	职务：<input type="text" id="zhiwu" required  value="${m.zhiwu}"><br>
	联系电话：<input type="text" id="dianhua" required pattern="^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\d{8}$" value="${m.dianhua}"><br>
	<input type="button" value="提交" onclick="update()">
	</c:forEach>

</body>
</html>

