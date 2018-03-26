<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
<form action="update">
	<c:forEach items="${requestScope.list}" var="m">
	<input type="hidden" name="id" value="${m.id}">
	岗位：${m.gangwei}<input type="hidden" name="gangwei" value="${m.gangwei}"><br>
	姓名：<input type="text" name="name" required value="${m.name}"><br>
	职务：<input type="text" name="zhiwu" required value="${m.zhiwu}"><br>
	联系电话：<input type="text" name="dianhua" required pattern="^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\d{8}$" value="${m.dianhua}"><br>
	<input type="submit" value="提交">
	<input type="reset">
	</c:forEach>
	</form>	
</body>
</html>