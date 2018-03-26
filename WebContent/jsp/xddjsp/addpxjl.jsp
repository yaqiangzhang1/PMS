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
	td{
	width: 80px;
	
	}
</style>
</head>
<body>
	<form action="../../addzhengshu" method="post">
	<table>
		<tr>
			<td align="center">姓名</td>
			<td><input type="text" name="name" pattern="^[\u4e00-\u9fa5]{0,}$" required="required"></td>
			<td align="center">年龄</td>
			<td><input type="text" name="age" pattern="^\d{2}$" required="required"></td>
			<td align="center">性别</td>
			<td><input type="radio" name="sex" value="男">男
			<input type="radio" name="sex" value="女">女</td>
		</tr>
		<tr>
			<td align="center">职位类别</td>
			<td><input type="text" name="gleibie"required="required"></td>
			<td align="center">考核进度</td>
			<td><input type="text" name="khjd" /></td>
			<td align="center">考核成绩</td>
			<td><input type="text" name="khscore" /></td>
		</tr>
		<tr align="center">
			<td colspan="6"><input type="submit" value="提交"></td>
		</tr>
	</table>
	</form>
</body>
</html>