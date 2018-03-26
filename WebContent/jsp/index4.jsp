<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>安全持证管理</title>
   
  </head>

  <body class="nav-md" >
  
    <div style="margin-left: -230px"> 
    <f:forEach items="${requestScope.list4}" var="zs">
    <tr>
                          <td >${zs.neirong}</td>
    </tr>
    
    </f:forEach>
    </div>
    
     
     
     
			
        <!-- page content -->
<!--           <div class="right_col" role="main"> -->
<!--           <div class=""> -->
<!--           <div class="page-title"> -->
<!--               <div class="title_left"> -->
<!--                 <h3>安全持证管理</h3> -->
<!--               </div> -->

              
<!--             </div> -->

<!--             <div class="clearfix"></div> -->

<!--             <div class="row"> -->
<!--               <div class="col-md-12 col-sm-12 col-xs-12"> -->
<!--                 <div class="x_panel"> -->
<!--                   <div class="x_title"> -->
<!--                     <h2>煤矿从业人员持证上岗管理规定<small></small></h2> -->
<!--                     <ul class="nav navbar-right panel_toolbox"> -->
<!--                       <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a> -->
<!--                       </li> -->
<!--                       <li class="dropdown"> -->
<!--                         <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a> -->
<!--                         <ul class="dropdown-menu" role="menu"> -->
<!--                           <li><a href="#">Settings 1</a> -->
<!--                           </li> -->
<!--                           <li><a href="#">Settings 2</a> -->
<!--                           </li> -->
<!--                         </ul> -->
<!--                       </li> -->
<!--                       <li><a class="close-link"><i class="fa fa-close"></i></a> -->
<!--                       </li> -->
<!--                     </ul> -->
<!--                     <div class="clearfix"></div> -->
<!--                   </div> -->
<!--                   <div class="x_content"> -->
<!--                     <p class="text-muted font-13 m-b-30"> -->
                    
<!--                     </p> -->
<!--                     <table id="datatable" class="table table-striped table-bordered"> -->
<!--                       <thead> -->
<!--                         <tr> -->
<!--                           <th>编号</th> -->
<!--                           <th>持证上岗人员类别</th> -->
<!--                           <th>包括工种</th> -->
<!--                           <th>包括人员</th> -->
<!--                           <th>所需证书</th> -->
                          
<!--                         </tr> -->
<!--                       </thead> -->


<!--                       <tbody> -->
<!--                         <tr> -->
<!--                           <td align="center">1</td> -->
<!--                           <td align="center">煤矿主要负责人</td> -->
<!--                           <td align="center">煤矿正副矿长、正副总工程师等</td> -->
<!--                           <td align="center">无</td> -->
<!--                           <td align="center">煤矿安全监察机构颁发的主要负责人安全资格考核合格证明材料</td> -->
                         
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center" style="line-height:35px">2</td> -->
<!--                           <td align="center" style="line-height:35px">安全生产管理人员</td> -->
<!--                           <td align="center">安全生产管理机构的部长、科长<br> -->
<!--                                                                                                                             安全监察人员、工程技术人员、区队长等</td> -->
<!--                           <td align="center" style="line-height:35px">（含副职）</td> -->
<!--                           <td align="center">煤矿安全生产管理人员安全资格证 </td>  -->
                          
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center" rowspan="12" style="line-height:380px">3</td> -->
<!--                           <td align="center" rowspan="12" style="line-height:380px">特种作业人员</td> -->
<!--                           <td align="center" style="line-height:40px">电工作业</td>                                                                                                           -->
<!--                           <td align="center">发电、送电、变电、配电工，电气设备的安装、运行<br> -->
<!--                                                                                                                                        检修（维修）、试验工，矿山井下电钳工</td> -->
<!--                           <td align="center" rowspan="12" style="line-height:380px">特种作业人员操作资格证</td>                                                                                                              -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">金属焊接、切割作业</td>                                                                                                           -->
<!--                           <td align="center">焊接工、切割工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">起重机械（含电梯）作业</td>                                                                                                           -->
<!--                           <td align="center">起重机械（含电梯）司机，司索工，信号指挥工，安装与维修工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">企业内机动车辆驾驶</td>                                                                                                           -->
<!--                           <td align="center">含在企业内生产作业区域和施工现场行驶的各类机动车辆驾驶人员</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">登高架设作业</td>                                                                                                           -->
<!--                           <td align="center">含2米以上登高架设、拆除、维修工，高层建筑物表面清洗工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">锅炉作业（含水质化验）</td>                                                                                                           -->
<!--                           <td align="center">含承压锅炉的操作工，锅炉水质化验工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">压力容器作业</td>                                                                                                           -->
<!--                           <td align="center">含压力容器罐装工、检验工、运输押运工，大型空气压缩机操作工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">制冷作业</td>                                                                                                           -->
<!--                           <td align="center">含制冷设备安装工、操作工、维修工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">爆破作业</td>                                                                                                           -->
<!--                           <td align="center">含地面工程爆破、井下爆破工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">矿业通风作业</td>                                                                                                           -->
<!--                           <td align="center">含主扇风机操作工，瓦斯抽放工，通风安全监测工，测风测尘工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                           <td align="center">矿山排水作业</td>                                                                                                           -->
<!--                           <td align="center">含矿井主排水泵工等，尾矿坝作业工</td> -->
<!--                         </tr> -->
                        
                        
<!--                         <tr> -->
<!--                           <td align="center">矿山救护作业</td>                                                                                                           -->
<!--                           <td align="center">无</td> -->
<!--                         </tr> -->
                                                                                                                              
                        
<!--                         <tr> -->
<!--                         <td align="center" rowspan="7" style="line-height:250px">4</td> -->
<!--                         <td align="center" rowspan="7" style="line-height:250px">4.普通工种</td> -->
<!--                         <td align="center">采煤工<br>                                                                               -->
<!--                         <td align="center">含回料工、下料工、送饭工、支架工、支护工、巷道维修工、零活、回柱、打眼工</td> -->
<!--                         <td align="center" rowspan="7" style="line-height:250px">普通工种安全生产资格证</td> -->
<!--                         </tr> -->
                     
<!--                         <tr> -->
<!--                         <td align="center">掘进工<br>                                                                               -->
<!--                         <td align="center">含打眼工、迎头工、推车工、送饭工、下料工、锚喷工、支护工、巷道维修工、钉道工</td> -->
                        
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                         <td align="center">通风安全工<br>                                                                               -->
<!--                         <td align="center">含风筒工、管子工、风袋工、密闭工、通风工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                         <td align="center">大巷轨道工<br>                                                                               -->
<!--                         <td align="center">含轨道维修工、钉道工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                         <td align="center">电瓶车司机<br>                                                                               -->
<!--                         <td align="center">含电瓶车跟车信号工、挂钩工、充电工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                         <td align="center" style="line-height:40px">水枪工<br>                                                                               -->
<!--                         <td align="center">枪后工、架空乘人装置操作工、验收员、机电安装工、井下钻探工、<br> -->
<!--                         煤质采样工、乳化液泵站工、矿灯工、上仓司机、拣矸工、安全生产系统监控工</td> -->
<!--                         </tr> -->
                        
<!--                         <tr> -->
<!--                         <td align="center"> 班组长<br>                                                                               -->
<!--                         <td align="center">采煤班组长、掘进班组长、机电班组长、运输班组长</td> -->
<!--                         </tr> -->
                        
<!--                         </tbody> -->
<!--                     </table> -->
<!--                   </div> -->
<!--                 </div> -->
<!--               </div> -->
              
              
              
<!--               <div class="row"> -->
<!--             <div class="col-md-4 col-sm-4 col-xs-12"> -->
<!--               <div class="x_panel"> -->
<!--                 <div class="x_title"> -->
<!--                   <h2>安全资格证书的有效期限 </h2> -->
<!--                   <ul class="nav navbar-right panel_toolbox"> -->
<!--                     <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a> -->
<!--                     </li> -->
<!--                     <li class="dropdown"> -->
<!--                       <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a> -->
<!--                       <ul class="dropdown-menu" role="menu"> -->
<!--                         <li><a href="#">Settings 1</a> -->
<!--                         </li> -->
<!--                         <li><a href="#">Settings 2</a> -->
<!--                         </li> -->
<!--                       </ul> -->
<!--                     </li> -->
<!--                     <li><a class="close-link"><i class="fa fa-close"></i></a> -->
<!--                     </li> -->
<!--                   </ul> -->
<!--                   <div class="clearfix"></div> -->
<!--                 </div> -->
<!--                 <div class="x_content"> -->
<!--                   <div class="dashboard-widget-content"> -->

<!--                     <ul class="list-unstyled timeline widget"> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                              
<!--                             </div> -->
<!--                             <p class="excerpt">1、对调整工种岗位、离岗一年以上重新上岗，应当进行专门安全培训。未经安全培训和培训不合格的从业人员，不得上岗作业。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                             
<!--                             </div> -->
<!--                             <p class="excerpt">2、煤矿安全资格证书有效期为4年，每2年由发证单位主管部门复审一次；特种作业操作证有效期为6年，每2年由发证单位主管部门复审一次，连续从事本工种10年（含10年）以上的，可4年进行一次复审。证书复审前应参加复训和考核。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                              
<!--                             </div> -->
<!--                             <p class="excerpt">3、证书复审包括违法违章记录，负主要责任事故记录，参加复训记录等。复审时间至复审到期前2个月内进行，不按规定办理复审的，按无效证件处理。复审不合格的，须重新参加培训。证书有效期到期前2个月内必须重新培训，领取新证书。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                              
<!--                             </div> -->
<!--                             <p class="excerpt">4、证书持有人一岗一证，因岗位变动，应取得相应岗位的证书。根据工作需要，一本证书可登记一个主工种，1—2个兼职工种，但必须经过相应工种的安全培训。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                     </ul> -->
<!--                   </div> -->
<!--                 </div> -->
<!--               </div> -->
<!--             </div> -->
            
            
            
            
<!--             <div class="row"> -->
<!--             <div class="col-md-4 col-sm-4 col-xs-12"> -->
<!--               <div class="x_panel"> -->
<!--                 <div class="x_title"> -->
<!--                   <h2>处罚规定 </h2> -->
<!--                   <ul class="nav navbar-right panel_toolbox"> -->
<!--                     <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a> -->
<!--                     </li> -->
<!--                     <li class="dropdown"> -->
<!--                       <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a> -->
<!--                       <ul class="dropdown-menu" role="menu"> -->
<!--                         <li><a href="#">Settings 1</a> -->
<!--                         </li> -->
<!--                         <li><a href="#">Settings 2</a> -->
<!--                         </li> -->
<!--                       </ul> -->
<!--                     </li> -->
<!--                     <li><a class="close-link"><i class="fa fa-close"></i></a> -->
<!--                     </li> -->
<!--                   </ul> -->
<!--                   <div class="clearfix"></div> -->
<!--                 </div> -->
<!--                 <div class="x_content"> -->
<!--                   <div class="dashboard-widget-content"> -->

<!--                     <ul class="list-unstyled timeline widget"> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                              
<!--                             </div> -->
<!--                             <p class="excerpt">1、未取得相应的“安全资格证书”，一律不准上岗，凡无证上岗的，属严重“三违”行为，给予留用察看处分，对单位党政主管各罚款500元，并责令立即参加安全培训，取得“安全资格证书”后，方准持证上岗；外联人员无证上岗的，一律予以辞退，并罚款1000元。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                             
<!--                             </div> -->
<!--                             <p class="excerpt">2、凡已取得“安全资格证书”，但未持证上岗的人员，给予50～500元的罚款。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
<!--                       <li> -->
<!--                         <div class="block"> -->
<!--                           <div class="block_content"> -->
                            
<!--                             <div class="byline"> -->
                              
<!--                             </div> -->
<!--                             <p class="excerpt">3、凡因无证上岗或未持证上岗人员被上级有关部门查出而对我矿的处罚，一律由责任单位、责任人承担，并对其单位党政主管各罚款100元/人次。 -->
<!--                             </p> -->
<!--                           </div> -->
<!--                         </div> -->
<!--                       </li> -->
                     
<!--                     </ul> -->
<!--                   </div> -->
<!--                 </div> -->
<!--               </div> -->
<!--             </div> -->
            
            
            
            
            

<!--                     </div> -->
<!--                   </div> -->
<!--                 </div> -->
<!--               </div> -->
        <!-- /page content -->

<!--         footer content -->
<!--         <footer> -->
<!--           <div class="pull-right"> -->
<!--             Gentelella - Bootstrap Admin Template by Colorlib. More Templates <a href="http://www.cssmoban.com/" target="_blank" title="?¨?????1????">?¨?????1????</a> - Collect from <a href="http://www.cssmoban.com/" title="???é?μ?¨????" target="_blank">???é?μ?¨????</a> -->
<!--           </div> -->
<!--           <div class="clearfix"></div> -->
<!--         </footer> -->
<!--         /footer content -->
<!--       </div> -->
    

 
    
    <!-- Custom Theme Scripts -->
    
<script>
		KindEditor.ready(function(K) {
			window.editor = K.create('#editor_id');
		});
	</script>
  </body>
</html>