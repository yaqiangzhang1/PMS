<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>

</head>
<body>
<form action="yuanadd" method="post" enctype="multipart/form-data" id="yuanadd">
	事故名称：
	<select name="name" id="name">
	<c:forEach items="${requestScope.list }" var="m">
		<option value="${m.yinhuantype}" >${m.yinhuantype}</option>
	</c:forEach>
		</select><br>
	等级：<select name="dengji" >
		<option value="A" >A</option>
		<option value="B" >B</option>
		<option value="C" >C</option>
		<option value="D" >D</option>
		</select><span id="span"></span><br>
	预案：<input type="file" name="file"  id="file" required><br>
	<input type="submit" value="提交" >
	</form>	
</body>
</html>