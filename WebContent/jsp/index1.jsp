<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="f"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>隐患管理</title>

    

<script type="text/javascript">
function CheckChinese(obj,val){     
	　　var reg = new RegExp("[\\u4E00-\\u9FFF]+","g");
	　　if(!reg.test(val)){     
	       alert("请输入汉字！");  
	       var strObj = document.getElementById(obj);  
	       strObj.value = "";  
	       strObj.focus();          
	　　}       
	  }
</script>

<script type="text/javascript">
function fun(){
    var select = document.getElementById("test");
    var str = [];
    for(i=0;i<select.length;i++){
        if(select.options[i].selected){
            str.push(select[i].value);
        }
    }
    alert(str);
}

</script>

<script type="text/javascript">



function addYinhuan(){
	var yinhuantype = $("#yinhuantype").val();
	alert(yinhuantype);
	var yinhuandengji = document.getElementsByName("yinhuandengji");
	var value = new Array();
	  for(var i = 0; i < yinhuandengji.length; i++){
		     if(yinhuandengji[i].checked)
		     value.push(yinhuandengji[i].value);
		    } 
	   alert(value);
	$.ajax({
		url: "addYinhuan?yinhuantype="+yinhuantype,
		type: "post",
		data: {"yinhuandengji": value},
		success: function(data){
			$("#ddgl").html(data);
		}
		});
}



function deleteYinhuan(id){
	  alert(id)
		$.ajax({
			url: "deleteYinhuan/"+id,
			type: "post",
			success: function(data){
				$("#ddgl").html(data);
			}
			});
}



</script>
  </head>

  <body class="nav-md">
  

      

        <!-- page content -->
        
        <div class="right_col" role="main" style="margin-left: 0px">
          

          <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
              <div class="dashboard_graph">

                <div class="row x_title">
                  <div class="col-md-6">
                    
			
			
			
                  <fieldset>
		<legend>
			<label>添加隐患信息窗口</label>
		</legend>
		<div class="form-horizontal" >
			<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">隐患种类</label>
				<div class="col-sm-8">
					<input type="text"  required="true"  class="form-control" id="yinhuantype"
						placeholder="种类" name="yinhuantype"  onchange="CheckChinese('test',this.value)" >
				</div>
			</div>
			
			<div class="form-group has-success">
				<label for="inputEmail2" class="col-sm-2 control-label">隐患等级</label>
				<div class="col-sm-8">
					<div class="checkbox">
						<label> <input type="checkbox" name="yinhuandengji" id="c1" value="A">A
						</label> <label> <input type="checkbox" name="yinhuandengji" id="c2"
							value="B">B
						</label> <label> <input type="checkbox" name="yinhuandengji" id="c3"
							value="C">C
						</label>  <label> <input type="checkbox" name="yinhuandengji" id="c4"
							value="D">D
						</label>
					</div>
				</div>
			</div>
					
			
	
			<div class="col-sm-offset-2 col-sm-8">
					<button type="button" class="btn btn-success" onclick="addYinhuan()">提交</button>
					<button type="reset" class="btn btn-warning">重填</button>
			</div>
			</div>
			</fieldset>
			</div>

                <div class="clearfix"></div>
              </div>
            </div>
            </div>
            
            
          <br />
          <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="ç½ç«æ¨¡æ¿">ç½ç«æ¨¡æ¿</a></div>

          <div class="row">


            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel tile fixed_height_450">
                <div class="x_title">
                  <h2>隐患管理</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                
                <div class="x_content">
                  
                  <table class="table table-striped"  border="1" bordercolor="black">
			<thead>
				<th>序号</th>
				<th>隐患种类</th>
				<th>隐患等级</th>
				<th>操作</th>
			</thead>
			<tbody>
				<f:forEach items="${requestScope.list}" var="yinhuan">
					
						<tr>
							<td>${yinhuan.id }</td>
							
							<td>${yinhuan.yinhuantype}</td>
							<td>
								<f:set var="dj" value="${yinhuan.yinhuandengji }" />
								<f:if test="${fn:contains(dj, 'A')}">
									A,
								</f:if>
								<f:if test="${fn:contains(dj, 'B')}">
									B,
								</f:if>
								<f:if test="${fn:contains(dj, 'C')}">
									C,
								</f:if>
								<f:if test="${fn:contains(dj, 'D')}">
									D
								</f:if>
								</td>
							<td><a href="javascript:deleteYinhuan(${yinhuan.id})" class="btn btn-xs btn-success">删除</a></td>
						</tr>
					
				</f:forEach>
			</tbody>
            </table>

                </div>
                
              </div>
            </div>
               <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>等级说明</h2>
                  <ul class="nav navbar-right panel_toolbox">
                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                    </li>
                    <li class="dropdown">
                      <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                      <ul class="dropdown-menu" role="menu">
                        <li><a href="#">Settings 1</a>
                        </li>
                        <li><a href="#">Settings 2</a>
                        </li>
                      </ul>
                    </li>
                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                    </li>
                  </ul>
                  <div class="clearfix"></div>
                </div>
                <div class="x_content">
                  <div class="dashboard-widget-content">

                    <ul class="list-unstyled timeline widget">
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">A:整改难度大，矿方解决不了，需要上报集团公司帮助组织整改；
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">B:整改难度一般，区队解决不了，需要由矿级别组织就进行整改；
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">C:整改难度小，班组解决不了，需要区队组织整改；
                            </p>
                          </div>
                        </div>
                      </li>
                     <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">D:班组能够现场立即整改；；
                            </p>
                          </div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            
            
            
            
            

                    </div>
                
                
                
                
            

            

            <div class="col-md-8 col-sm-8 col-xs-12">



              

                </div>
                <!-- end of weather widget -->
              </div>
            </div>
          
        <!-- /page content -->

        
      </div>
    

	
  </body>
  
  
<script>
var banks = $('.all').siblings().children();
$('.all>input').click(function() {
  var flag = $(this).prop('checked');
  banks.prop('checked', flag);
})
banks.click(function() {
  // 如果有一个没选中，全选按钮不选中
  // 如果全部选中，全选按钮被选中
  var num = 0;
  banks.each(function() {
    if ($(this).prop("checked")) {
      num++;
    }
  })
  if (num == banks.length) {
    $('.all>input').prop('checked', true);
  } else {
    $('.all>input').prop('checked', false);
  }
})
</script>
</html>
