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
	<center><h3>发布新考核计划</h3></center>
	<form action="../../addgw" method="post">
	<table align="center">
	<tr>
		<td>岗位类别</td>
		<td><input type="text" name="gleibie" pattern="^[\u4e00-\u9fa5]{0,}$" required="required"></td>
	</tr>
	<tr>
		<td>培训批次</td>
		<td><input type="text" name="gpici" required="required"></td>
	</tr>
	<tr>
		<td>培训科目</td>
		<td><input type="text" name="gkemu" pattern="^[\u4e00-\u9fa5]{0,}$" required="required"></td>
	</tr>
	<tr>
		<td>培训讲师</td>
		<td><input type="text" name="gteacher" pattern="^[\u4e00-\u9fa5]{0,}$" required="required"></td>
	</tr>
	<tr>
		<td>开课时间</td>
		<td><input type="text" name="gbegintime" pattern="^\d{4}-\d{1,2}-\d{1,2}" required="required"></td>
	</tr>
	<tr>
		<td>结课时间</td>
		<td><input type="text" name="gendtime" pattern="^\d{4}-\d{1,2}-\d{1,2}" required="required"></td>
	</tr>
	<tr>
		<td>培训地点</td>
		<td><input type="text" name="gdidian" pattern="^[\u4e00-\u9fa5]{0,}$" required="required"></td>
	</tr>
	<tr align="center">
		<td colspan="2"><input type="hidden" name="khjd" value="未开始">
			<input type="submit" value="提交"></td>
	</tr>
	</table>
	</form>
</body>
</html>