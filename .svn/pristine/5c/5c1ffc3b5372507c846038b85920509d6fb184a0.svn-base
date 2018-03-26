<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script type="text/javascript">
        function zhihuiadd() {
        	alert(123)
            $.ajax({
            //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "zhihuiAll" ,//url
                data: $('#zhihuiadd').serialize(),
                success: function (result) {
                	alert(result)
                    console.log(result);//打印服务端返回的数据(调试用)
                    alert(result.resultCode)
                    if (result.resultCode == 200) {
                        alert("SUCCESS");
                    }
                },
                error : function() {
                    alert("异常！");
                }
            });
        }
    </script>
</head>
<body>
<form action="" id="zhihuiadd" method="post">
	岗位：<select name="gangwei" >
		<option value="总指挥" >总指挥</option>
		<option value="副总指挥" >副总指挥</option>
		<option value="常务副总指挥" >常务副总指挥</option>
		</select><span id="span"></span><br>
	姓名：<input type="text" name="name" required><br>
	职务：<input type="text" name="zhiwu" required><br>
	联系电话：<input type="text" name="dianhua" required pattern="^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\d{8}$"><br>
	<input type="button" value="提交" onclick="zhihuiadd()">
	<input type="reset">
	</form>	
</body>
</html>