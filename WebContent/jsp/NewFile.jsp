<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		alert(123)
			$.ajax({
				type : "GET", //请求的方式，也有get请求
				url : "http://localhost:8080/PMS_1/yuAnAll", //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
				dataType : "json", //json格式，后台返回的数据为json格式的。
				success : function(result) {
					var su = "";
					$.each(result, function(index, item) {
						su += "<option value="+item.id+">"+item.name+"</option>"
					}); 
						$("#leixin").html(su);//把内容入到这个div中即完成
					console.log(result); //可以在控制台打印一下看看，这是拼起来的标签和数据
				}
			});
	});
	/* function dj(){
		var name = document.getElementById("leixin").value;
		$.ajax({
			type : "GET", //请求的方式，也有get请求
			url : "getemp?id="+deptid, //请求地址，后台提供的,这里我在本地自己建立了个json的文件做例子
			dataType : "json", //json格式，后台返回的数据为json格式的。
			success : function(result) {
				var su = "";
				$.each(result, function(index, item) {
					su += "<option value="+item.id+">"+item.ename+"</option>"
				}); 
					$("#empselect").html(su);//把内容入到这个div中即完成
				console.log(result); //可以在控制台打印一下看看，这是拼起来的标签和数据
			}
		});
	} */
	</script>
</head>
<body>
<form action="http://172.16.8.26:8080/PMS/test/1">

<input type="submit"  >
<div>
		<h3>应急预案启动</h3>
		<div>
		事故类型：<select id="leixin" onchange="dj()"></select>
		等级：<select id="dj" >
				<option name="A">A</option>
				<option name="B">B</option>
				<option name="C">C</option>
				<option name="D">D</option>
			</select>
		
		</div>
		</div>
</form>
</body>
</html>