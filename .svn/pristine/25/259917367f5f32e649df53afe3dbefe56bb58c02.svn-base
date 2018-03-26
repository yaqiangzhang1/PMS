<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	tr{
	height: 40px;
	}
	
</style>
</head>
<body>
	<center><h3>发布新计划</h3></center>
	<form id="formId" action="<%=request.getContextPath() %>/addplan" method="post" onsubmit="return sub();">
	<table align="center">
	<tr>		
		<td>计划摘要</td>
		<td><input type="text" name="trainabstract"></td>
	</tr>
	<tr>		
		<td>负责人</td>
		<td><input type="text" name="personincharge"></td>
	</tr>
	<tr>		
		<td>发布时间</td>
		<td><input type="text" name="releasetime"></td>
	</tr>
	<tr>		
		<td>主要内容</td>
		<td><textarea rows="3" cols="22" name="content"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="hidden" name="pkhjd" value="未开始">
		<input type="submit" value="提交">
		</td>
	</tr>
	</table>
	</form>
</body>
</html>