<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 消息框样式 --> 
<style type="text/css">
body { background:#333333;}
#winpop { width:200px; height:0px; position:absolute; right:0; bottom:0; border:1px solid #999999; margin:0; padding:1px; overflow:hidden; display:none; background:#FFFFFF}
#winpop .title { width:100%; height:20px; line-height:20px; background:#FFCC00; font-weight:bold; text-align:center; font-size:12px;}
#winpop .con { width:100%; height:80px; line-height:80px; font-weight:bold; font-size:12px; color:#FF0000; text-decoration:underline; text-align:center}
#silu { font-size:13px; color:#999999; position:absolute; right:0; text-align:right; text-decoration:underline; line-height:22px;}
.close { position:absolute; right:4px; top:-1px; color:#FFFFFF; cursor:pointer}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 标题 --> 
<title>山煤国际煤炭生产管理系统</title>
    <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="vendors/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
    
 <!-- jQuery --> 
<script src="vendors/jquery/dist/jquery.min.js"></script>
<script type="text/javascript">
$().ready(function(){
	var qx = $("#qx").val();
	$("#aqgl").hide();
	$("#yfyj").hide();
	$("#scjh").hide();
	$("#scdd").hide();
	$("#aqpx").hide();
	$("#tjfx").hide();
	$("#rygl").hide();
	var xx = "${requestScope.userout}";
	
	if(xx!=""){
			window.location.href="useroutout";
		}
	var xxx = "${requestScope.haha}";
	
	if(xxx==""){
		window.location.href="outRefresh";
		}
	$.ajax({
			type:"POST",
			url:"showqxByjs?qx="+qx,
			success:function(date){
				
				var a = date.split(",");
				for(var i=0;i<a.length;i++){
					
								if(a[i].trim() == 1){
									$("#aqgl").show();
									continue;
									}if(a[i].trim() == 2){
										$("#yfyj").show();
										continue;
										}if(a[i].trim() == 3){
											$("#scjh").show();
											continue;
											}if(a[i].trim() == 4){
												$("#scdd").show();
												continue;
												}if(a[i].trim() == 5){
													$("#aqpx").show();
													continue;
													}if(a[i].trim() == 6){
														$("#tjfx").show();
														continue;
														}if(a[i].trim() == 7){
															$("#rygl").show();
															continue;
															}
								/* if(a[i].trim() != 2){
									$("#yfyj").hide();
								}else{
									$("#yfyj").show();
									}
								if(a[i] != 3){
									$("#scjh").hide();
								}else{
									$("#scjh").show();
									}
								if(a[i] != 4){
									$("#scdd").hide();
								}else{
									$("#scdd").show();
									}
								if(a[i] != 5){
									$("#aqpx").hide();
								}else{
									$("#aqpx").show();
									}
								if(a[i] != 6){
									$("#tjfx").hide();
								}else{
									$("#tjfx").show();
									}
								if(a[i] != 7){
									$("#rygl").hide();
								}else{
									$("#rygl").show();
									}
								 */
						
					}
			}
		})
})

<!-- 每隔30秒执行一次方法 --> 
setInterval("tips_pop()",30000);
function tips_pop(){
	var MsgPop=document.getElementById("winpop");//获取窗口这个对象,即ID为winpop的对象.
	var popH=MsgPop.offsetHeight;//用parseInt将对象的高度转化为数字,以方便下面比较
	$.ajax({
		type:"get",
		url:"showaddorder",
		success:function(data){
				if(data==1){
					MsgPop.style.display="block";//那么将隐藏的窗口显示出来
					show=setInterval("changeH('up')",2);//开始以每0.002秒调用函数changeH("up"),即每0.002秒向上移动一次
					}
				else {//否则
					hide=setInterval("changeH('down')",2);//开始以每0.002秒调用函数changeH("down"),即每0.002秒向下移动一次
					}
			}
	})

}
function changeH(str) {
var MsgPop=document.getElementById("winpop");
var popH=MsgPop.offsetHeight;
if(str=="up"){//如果这个参数是UP
if (popH<=100){//如果转化为数值的高度小于等于100
	MsgPop.style.height=(popH+4).toString()+"px";//高度增加4个象素
}
else{
clearInterval(show);//否则就取消这个函数调用,意思就是如果高度超过100象度了,就不再增长了
}
}
if(str=="down"){
if (popH>=4){//如果这个参数是down
	MsgPop.style.height=(popH-4).toString()+"px";//那么窗口的高度减少4个象素
}
else{//否则
clearInterval(hide);//否则就取消这个函数调用,意思就是如果高度小于4个象度的时候,就不再减了
MsgPop.style.height="none";//因为窗口有边框,所以还是可以看见1~2象素没缩进去,这时候就把DIV隐藏掉
}
}
}

function guanbi(){
	hide=setInterval("changeH('down')",2);//关闭窗口
}
	function ddgl(){
			$.get("showorder",function(data){
				$("#ddgl").html(data);
				})
		}

	function scjh(){
		$.get("showMainPlanAll",function(data){
			$("#ddgl").html(data);
			})
	}
function scjxjh(){
	$.get("showJxPlanAll",function(data){
		$("#ddgl").html(data);
		})
}

	//生产调度
	
	function diaodu1(){
    		$.get("planAll",function(data){
    			$("#ddgl").html(data);
    		})
    	}
    	function diaodu2(){
    		$.get("getAll",function(data){
    			$("#ddgl").html(data);
    		})
    	}
    	function diaodu3(){
    		$.get("yuAnAll",function(data){
    			$("#ddgl").html(data);
    		})
    	}
    	function diaodu4(){
    		$.get("zhihui",function(data){
    			$("#ddgl").html(data);
    		})
    		/* $("#diaodu").load("http://localhost:8080/PMS_1/jsp/diaodu4.jsp"); */
    	}



    	//安全管理
    	
    	 function index1(){
    	alert(1)
		$.get("showYinhuan",function(date){
			$("#ddgl").html(date);
		})
	}
    function index2(){
    	alert(2)
    	$.get("http://localhost:8080/PMS/showJganquan",function(date){
			$("#ddgl").html(date);
		})
	}
    function index5(){
    	alert(3)
    /* 	$("#anquan").load("http://localhost:8080/PMS/ReportServer?reportlet=jingg.cpt"); */
    	$.get("http://localhost:8080/PMS/ReportServer?reportlet=jingg.cpt",function(date){
    		
    		$("#ddgl").html(date);
    	});
	}
    function index3(){
    	alert(4)
    	$.get("http://localhost:8080/PMS/showWeixian",function(date){
			$("#ddgl").html(date);
		})
	}
    function index4(){
    	alert(5)
    	$.get("http://localhost:8080/PMS/showZhengshu",function(date){
			$("#ddgl").html(date);
		})
	}


    //安全培训
    
     function kemu(){
		$.get("jsp/xddjsp/TrainingSubjects.jsp",function(date){
		$("#ddgl").html(date);});
	}
    function plan(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "getAllPlan",
    		success : function(result) {
    			$("#ddgl").html(result);
    			
    		}
    	});
	}
    function planjd(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/getpxjd",
    		success : function(result) {
    			$("#ddgl").html(result);
    			
    		}
    	});
	}
    function zsgl(){
    	$.ajax({
    		type : "GET", //请求的方式，也有get请求
    		url : "<%=request.getContextPath() %>/getAllzs",
    		success : function(result) {
    			$("#ddgl").html(result);
    			
    		}
    	});

	}


    //预防预警
    
    function tongfeng(){
			$.get("jsp/tongfeng.jsp",function(date){
				$("#ddgl").html(date);
			})
		}
		function wasi(){
			$.get("jsp/wasi.jsp",function(date){
				$("#ddgl").html(date)
			})
		}
		function cefeng(){
			alert(123)
			$.get("jsp/cefeng.jsp",function(date){
				$("#ddgl").html(date)
			})
		}
		function cechen(){
			$.get("jsp/cechen.jsp",function(date){
				$("#ddgl").html(date)
			})
		}


		//人员管理
		function yhjs(){
			alert(1);
			$.get("showyhjs",function(date){
				$("#ddgl").html(date)
				})
			}

		function yhgl(){
			alert(1);
			$.get("showyhgl",function(date){
				$("#ddgl").html(date)
				})
			}

</script>
</head>
  <body class="nav-md">
  <input type="hidden" id="asa" value="${requestScope.i}">
  <input type="hidden" id="qx" value="${sessionScope.userqx}">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>煤炭生产管理系统</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>${sessionScope.username}</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu" style="float: left;">
              <div class="menu_section">
     
                <ul class="nav side-menu" >
                  <li id="aqgl"><a><i class="fa fa-home"></i> <input type="hidden" name="gnqx" value="1">安全管理<span class="fa fa-chevron-down"></span></a>
                     <ul class="nav child_menu">
                      <li><a href="javascript:index1()">隐患管理</a></li>
                      <li><a href="javascript:index2()">安全质量标准管理</a></li>
                      <li><a href="javascript:index5()">安全质量标准详情</a></li>
                      <li><a href="javascript:index3()">危险源管理</a></li>
                      <li><a href="javascript:index4()">安全持证管理</a></li>
                    </ul>
                  </li>
                  <li id="yfyj"><a><i class="fa fa-edit"></i> <input type="hidden" name="gnqx" value="2">预防预警 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="javascript:tongfeng()">通风</a></li>
                      <li><a href="javascript:wasi()">瓦斯巡检</a></li>
                      <li><a href="javascript:cefeng()">测风巡检</a></li>
                      <li><a href="javascript:cechen()">测尘巡检</a></li>
                      
                    </ul>
                  </li>
                  <li id="scjh"><a><i class="fa fa-desktop"></i><input type="hidden" name="gnqx" value="3"> 生产计划 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="javascript:ddgl()">订单管理</a></li>
                      <li><a href="javascript:scjh()">主生产计划</a></li>
                      <li><a href="javascript:scjxjh()">生产接续计划</a></li>
                   
              
                    </ul>
                  </li>
                  <li id="scdd"><a><i class="fa fa-table"></i> <input type="hidden" name="gnqx" value="4">生产调度 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="javascript:diaodu1()">调度指令管理</a></li>
                      <li><a href="javascript:diaodu2()">生产调度日志</a></li>
                      <li><a href="javascript:diaodu3()">应急预案管理</a></li>
                      <li><a href="javascript:diaodu4()">应急指挥</a></li>
                    </ul>
                  </li>
                  <li id="aqpx"><a><i class="fa fa-bar-chart-o"></i> <input type="hidden" name="gnqx" value="5">安全培训 <span class="fa fa-chevron-down"></span></a>
                     <ul class="nav child_menu">
                      <li><a href="javascript:kemu()">培训科目</a></li>
                      <li><a href="javascript:plan()">培训计划</a></li>
                      <li><a href="javascript:planjd()">培训实施进度</a></li>
                      <li><a href="javascript:zsgl()">岗位考核</a></li>
                      <li><a href="javascript:zsgl()">证件发放</a></li>
                      <li><a href="javascript:zsgl()">岗位持证人员管理</a></li>
                    </ul>
                  </li>
                  <li id="tjfx"><a><i class="fa fa-clone"></i><input type="hidden" name="gnqx" value="6">统计分析 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="fixed_sidebar.html">一通三防报表</a></li>
                      <li><a href="fixed_footer.html">计划完成/实施对比</a></li>
                      <li><a href="fixed_footer.html">人力支出统计</a></li>
                    </ul>
                  </li>
                  <li id="rygl"><a><i class="fa fa-clone"></i><input type="hidden" name="gnqx" value="7">人员管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="javascript:yhjs()">用户角色</a></li>
                      <li><a href="javascript:yhgl()">用户管理</a></li>
                    </ul>
                  </li>
                </ul>
              </div>

            </div>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">

                  <a class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                    <img src="images/img.jpg" alt="">${sessionScope.username}
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
       
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>设置</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">帮助</a></li>
                    <li><a href="userout"><i class="fa fa-sign-out pull-right"></i> 退出</a></li>
                  </ul>
                </li>
   
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
       <div id="ddgl" style="margin-left: 230px;background-color: #FFFFFF">
       	<div class="right_col" role="main" style="margin-left: 0px">
          <div class="">
          <div class="page-title">
              <div class="title_left">
                <h3>煤矿安全文化及规章制度</h3>
              </div>

              
            </div>

            <div class="clearfix"></div>

            <div class="row">
              
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>安全生产责任制度 </h2>
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
                            <p class="excerpt">一、各单位行政正职是本单位的安全第一责任人，按“谁主管，谁负责”、管业务必须管安全的原则。对安全生产负全面领导责任。负责组织制定本单位的安全目标及长远发展规划，定期召开安全生产办公会议，研究解决安全生产中出现的问题、隐患等。  各单位行政副职是自己分管工作范围内的安全第一责任人，对分管工作范围内的安全工作负领导责任。  矿总工程师对安全技术工作负全面责任。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">二、安全生产人人有责，按有岗必有责，有责必落实原则，各级、各部门人员，都应在各自不同的工作岗位上，贯彻“安全第一、预防为主、综合治理”方针，执行国家有关安全生产的政策、法规和上级有关规定，对安全工作密切配合，互相扶持。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">三、各级领导和员工有责任和义务参加各种安全管理（技术）的教育和培训，不断提高自身的安全生产意识和安全生产工作能力，从而有效地遏制事故的发生。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">四、各级党组织、工会负责管理者和员工的安全教育工作。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">五、安全监察部门负责贯彻落实党和国家的安全生产方针、政策、法律法规以及上级部门、矿各项安全管理规定；负责组织开展安全检查；负责权限范围内的各类安全事故的调查与处理；负责安全费用提取、使用情况的监督检查。负责对本企业各级人员和各职能部门安全职责履行情况进行监督监察。对安全职责履行好的应予以表彰和奖励，对不负责任、失职造成事故的，应按本规定分清责任进行追究。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">六、保卫部门是公司消防工作的业务主管部门，对易燃易爆的重点防火要害部门，必须建立健全各项管理制度，按规定配齐消防器材，并管理到位。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">七、各级领导在各自的工作范围和管理权限内，负责组织贯彻执行国家和上级部门的有关安全生产法律、法规和企业的规章制度。在计划、布置 、检查、总结、评比生产工作的同时，必须计划、布置、检查、总结、评比安全工作
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">八、各级、各部门领导人员除应履行本制度中所列的安全职责外，还应及时完成上级或主管领导临时交办的安全工作任务，并对所属部门人员履行安全职责的情况进行督促检查。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">九、违犯上级及公司有关规定的按上级及公司有关规定执行。由于安全生产责任制不落实造成伤亡事故或重大经济损失者，除对责任人追究行政处罚和经济处罚外，并追究刑事责任。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">十、各单位按照本制度必须建立各级人员安全生产责任制。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">十一、本制度如与国家、上级有关规定相抵触的，按上级有关规定执行。
                            </p>
                          </div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
              
              
             <!-- 第二块 --> 
              <div class="row">
              
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>安全会议制度 </h2>
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
                            <p class="excerpt">为认真贯彻落实安全生产方针和安全生产法律、法规及上级有关安全生产的政策、规定、指示，研究分析和解决我公司安全生产中存在的问题及安全隐患，保证安全生产工作正常、规范运行，根据《煤矿安全规程》及上级有关规定，公司特制定安全会议制度。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">一、会议时间  安全会议制度包括安全办公会、“一通三防”例会、紧急办公会、安全例会等与安全相关的会议。  公司每月召开一次安全办公会，时间定于每月的月底（若有变动另行通知），时间以公司总经理办公室通知为准。  “一通三防”例会由总工程师每月组织一次。会议召开时间由总工程师确定并安排人员通知。  安全例会每周召开一次。  其他临时性安全会议的召开时间由提议部门负责通知。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">二、会议主持及参加会议人员  安全办公会议由矿长或安全矿长主持。公司四职矿长、安全副总、生产副总、机电副总、总工程师出席，生产职能部室正副经理和工程技术人 员、生产区队队长及所有地面单位全体在职管理人员参加。                        “一通三防”例会由总工程师主持，参加人员由总工程师负责确定并安排人员通知。  每周安全例会由安全矿长主持。公司主管生产副总、机电副总、总工程师出席，生产职能部室正副经理和工程技术人员、生产区队队长、机电

    副队长等参加。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">三、安全会议内容  1、学习贯彻国家、上级有关安全文件、政策、规定、指示。 2、研究分析当前安全生产方面存在的问题，分析原因，及时制定安全管理对策及防范措施。提出解决的办法，落实到单位和人员。  3、布置上级部门下达的安全管理工作任务，安排本单位安全管理工作任务，确保安全管理工作有序进行。  4、检查上次安全例会确定事项的落实情况，完成好的给予表扬，完成不好的给予批评，并追究有关人员的责任并重新按五定原则处理，作好会议记录。  5、对有关事故进行分析，通报事故责任处理结果和违章人员，吸取事故教训，制定防范措施，防止同类事故发生。  6、安监部负责安全会议所决定的安全管理事项进行落实和监督检查。 7、通报上级对公司“双基”验收情况及公司对各单位“双基”验收情况，并对存在的问题积极整改。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">四、要求  1、总经办负责做好安全办公会议记录，其它安全会议有组织单位负责记录，存档备案。必要时对会议所决定的事项形成会议纪要上报或下发。  2、按照上级要求，随时召开有关安全方面会议，及时传达贯彻落实上级有关指示精神。  3、参加会议人员要提前做好发言准备及材料，在发言汇报中简明扼要，

    5  突出重点，提高会议效率。  4、其它安全会议由组织部门做好记录。  5、安全工作会议实行签到制，被通知参加会议的人员，都应按通知要求的会议时间、会议地点准时参加会议。确实不能参加的，要在开会之前和召集人说明情况并履行请假手续。对未经允许擅自不参加的部门或迟到、早退的人员，会议召集人按公司有关规定对其进行处罚。
                            </p>
                          </div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
            
            
            
            
            <!-- 第三块 -->
            <div class="row">
              
            <div class="col-md-4 col-sm-4 col-xs-12">
              <div class="x_panel">
                <div class="x_title">
                  <h2>安全目标管理制度 </h2>
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
                            <p class="excerpt">为深入贯彻“安全第一、预防为主、综合治理”的安全生产方针和《安全生产法》、《国务院关于预防煤矿生产安全事故的特别规定》、《煤矿安全规程》等法律法规，强化安全管理，努力实现公司安全生产形势持续稳定好转，确保实现安全目标，制定本制度。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                             
                            </div>
                            <p class="excerpt">一、每年依据上级下达的安全指标，结合我公司安全生产具体条件和职工队伍安全技术素质状况，制定年度安全生产总体目标，总体目标应具有先进性、可操作性。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">二、公司要将年度安全生产总体目标逐级分解，层层落实责任，形成自下而上一级对一级负责的安全保证体系。安全目标与经济利益挂钩。对完不成年度安全管理目标的单位和责任人按公司有关规定给予相关处分并实行安全“一票否决”制。

    。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">三、各级安全生产第一责任者对安全目标的落实负全面责任，各部门必须制定规划措施，保证安全目标的全面实施，执行到位。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">四、安全监察部门负责安全目标的考核，严格按规定兑现奖罚，使安全目标管理起到促进和保证安全生产的杠杆作用。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">五、各级领导必须全面贯彻“安全第一、预防为主、综合治理”方针。在安全生产过程中，必须始终把安全放在首位。坚持生产必须安全，坚决做到不安全不生产。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">六、各级领导要把年度《安全目标管理工作意见》列入到日常工作及议事日程。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">七、各级行政正职是安全生产的第一责任人，必须亲自抓、负总责。
   党政工团齐抓共管，共同做好安全生产工作。
                            </p>
                          </div>
                        </div>
                      </li>
                      <li>
                        <div class="block">
                          <div class="block_content">
                            
                            <div class="byline">
                              
                            </div>
                            <p class="excerpt">八、各级领导要加强现场管理，控制各类事故发生，抓好质量标准化、隐患排查与治理、培训、反“三违”等各项工作，定期分析研究安全生产存在的问题，确保年度安全管理目标顺利实施完成。
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
                  </div>
                </div>
              </div>
       </div>
       </div>
       <div id="silu">
</div>
<div id="winpop">
<div class="title">您有新生产订单<span class="close" onclick="guanbi()">X</span></div>
<div class="con"><a href="javascript:ddgl()">点击查看新订单</a></div>
</div>
        <!-- /page content -->
		
        <!-- footer content -->
  
        <!-- /footer content -->
      </div>
    </div>
	   <!-- Bootstrap -->
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="vendors/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="vendors/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="vendors/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="vendors/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="vendors/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="vendors/Flot/jquery.flot.js"></script>
    <script src="vendors/Flot/jquery.flot.pie.js"></script>
    <script src="vendors/Flot/jquery.flot.time.js"></script>
    <script src="vendors/Flot/jquery.flot.stack.js"></script>
    <script src="vendors/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="vendors/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="vendors/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="vendors/jqvmap/dist/jquery.vmap.js"></script>
    <script src="vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="vendors/moment/min/moment.min.js"></script>
    <script src="vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="build/js/custom.min.js"></script>
   
  </body>
</html>
