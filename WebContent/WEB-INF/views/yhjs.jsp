<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="f"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户角色管理</title>
<script type="text/javascript">
function selectedAll() {  
	   var id = $("#bumen").val();
	        var allsel = document.getElementsByName("qxname");/* teleCheckbox为复选框的name属性值 */  
	        var allsel = document.getElementsByName("qxname");/* qxname为复选框的name属性值 */  
	        for ( var i = 0; i < allsel.length; i++) {  
	            allsel[i].checked = !allsel[i].checked;  
	        }  
	    }  

function addyhjs(){
	var juesename = $("#juesename").val();
	alert(juesename);
	var qxname = document.getElementsByName("qxname");
	var value = new Array();
	  for(var i = 0; i < qxname.length; i++){
		     if(qxname[i].checked)
		     value.push(qxname[i].value);
		    } 
	   alert(value);
	$.ajax({
		url: "addyhjs?juesename="+juesename,
		type: "post",
		data: {"qxname": value},
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
			<label>添加角色信息窗口</label>
		</legend>
		<div class="form-horizontal" >
			<div class="form-group has-success">
				<label for="inputEmail3" class="col-sm-2 control-label">角色名称</label>
				<div class="col-sm-8">
					<input type="text"  required="true"  class="form-control" id="juesename"
						placeholder="角色名称" name="juesename"  onchange="CheckChinese('test',this.value)" >
				</div>
			</div>
			<div class="form-group has-success">
				<label for="inputEmail2" class="col-sm-2 control-label">角色权限</label>
				<div class="col-sm-8">
					<div class="checkbox">
						<label> <input type="checkbox" id="sel" name="sel" value="yes" onclick="selectedAll()">全选/取消 
						</label> <br>
						<label> 
						 <input type="checkbox" name="qxname" value="1">安全管理
						</label>
						<label>
						<input type="checkbox" name="qxname" value="2">预防预警
						</label>
						 <label> 
						 <input type="checkbox" name="qxname" value="3">生产计划
						</label>  
						<label> 
						<input type="checkbox" name="qxname" value="4">生产调度
						</label>
						<label> 
						<input type="checkbox" name="qxname" value="5">安全培训
						</label>
						<label> 
						<input type="checkbox" name="qxname" value="6">统计分析
						</label>
						<label> 
						<input type="checkbox" name="qxname" value="7">人员管理
						</label>
					</div>
				</div>
			</div>
			<div class="col-sm-offset-2 col-sm-8">
					<button type="button" class="btn btn-success" onclick="addyhjs()">提交</button>
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
                  <h2>用户角色</h2>
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
                  
                  <table class="table table-striped"  border="1" bordercolor="black" >
			<thead>
				<th>序号</th>
				<th>角色名称</th>
				<th>角色权限</th>
				<th>操作</th>
			</thead>
			<tbody>
				<f:forEach items="${requestScope.showBumenAll}" var="bumen">
					
						<tr>
							<td>${bumen.bm_id }</td>
							
							<td>${bumen.bm_name}</td>
							<td>
								<f:set var="qx" value="${bumen.bm_qx }" />
								<f:if test="${fn:contains(qx, '1')}">
									安全管理,
								</f:if>
								<f:if test="${fn:contains(qx, '2')}">
									预防预警,
								</f:if>
								<f:if test="${fn:contains(qx, '3')}">
									生产计划,
								</f:if>
								<f:if test="${fn:contains(qx, '4')}">
									生产调度,
								</f:if>
								<f:if test="${fn:contains(qx, '5')}">
									安全培训,
								</f:if>
								<f:if test="${fn:contains(qx, '6')}">
									统计分析,
								</f:if>
								<f:if test="${fn:contains(qx, '7')}">
									人员管理,
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
                  <h2>权限说明</h2>
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
                            <p class="excerpt">安全管理：
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">预防预警:可审核各煤矿一通三防
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">生产计划：整改难度小，班组解决不了，需要区队组织整改；
                            </p>
                          </div>
                        </div>
                      </li>
                     <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">生产调度：班组能够现场立即整改；；
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">安全培训：班组能够现场立即整改；；
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">统计分析：班组能够现场立即整改；；
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">人员管理：班组能够现场立即整改；；
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
    
     <footer>
          <div class="pull-right">
            
          </div>
          <div class="clearfix"></div>
        </footer>
	
  </body>

</html>
