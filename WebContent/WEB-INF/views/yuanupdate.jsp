<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<!-- <script type="text/javascript">
 function yuanupdate(){
	 alert(123)
	 var id= $("#id").val();
	var name= $("#name").val();
	var dengji= $("#dengji").val();
	var file = $("#file").val();
	$.get("yuanupdate?name="+name+"&dengji="+dengji+"&file="+file+"&id="+id,function(data){
		$("#ddgl").html(data);
	})
}
</script> -->
</head>
<body>
<form action="yuanupdate" method="post" enctype="multipart/form-data">
<c:forEach items="${requestScope.list}" var="f">
			<input type="hidden" id="id"  name="id" value="${f.id}">
		事故名称：${f.name}<input type="hidden" id="name"  name="name" value="${f.name}"><br>
		等级：${f.dengji}<input type="hidden" id="dengji" name="dengji" value="${f.dengji}"><br>
		预案:<input type="file" id="file" name="file"><br>
		<input type="submit" value="提交" >
		</c:forEach>
	</form>
</body>
</html>