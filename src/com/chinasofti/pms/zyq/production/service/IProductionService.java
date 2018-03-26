/**
 * IProductionService.java
 * com.chinasofti.pms.zyq.production.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.service;


import java.util.List;

import com.chinasofti.pms.zyq.production.entity.MainPlan;
import com.chinasofti.pms.zyq.production.entity.Mine;
import com.chinasofti.pms.zyq.production.entity.MineOutPut;
import com.chinasofti.pms.zyq.production.entity.Order;

/**
 * ClassName:IProductionService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:06:43
 *
 * @see 	 
 *  
 */
public interface IProductionService {
	public boolean addMine(Mine mine); //添加矿区信息
	public List<Mine> showMine();//查询所有矿区信息
	public List<Order> showOrder();//查询所有订单信息
	public boolean addOrder(Order order);//添加订单信息
	public Order showOrderByid(Integer id);//通过id查询订单信息
	public Mine showMineByid(Integer id);//通过id查询矿区信息
	public boolean addMainPlan(MainPlan mainplan);//添加主生产计划
	public List<MainPlan> showMainPlanById(Integer id);//通过id查询主生产计划
	public List<MainPlan> showMainPlanAll();//查询所有的主生产计划
	public boolean updateAuditstatus(Integer id);//通过id修改生产计划审核状态
	public boolean updateOrderstate(Integer id);//通过id修改订单生产状态
	public List<Order> showOrderBycompany(String company);//根据公司名查到该客户的订单信息
	public String showContratcoterByid(Integer id);//根据id查询合同号
	public boolean updateOrderOrderstate(String contratcoter);//通过合同号修改订单状态
	public boolean updateOrderXiadanumber(Order order);//修改下达计划的数量
	public Order showOrderByContratcoter(String contratcoter);//根据合同号查到订单信息
	public boolean updateOrderOrderstate(Order order);//修改订单状态
	public boolean updateOrderOrderstateByXiadanumber(Order order);//根据已下达计划数量修改订单状态
	public int showMineCount();//查询煤矿数量
	public Double showMineOutputCount();//所有煤矿总生产量
	public Order showOrderEnddate();//查询截止日期
	public boolean updateOrderOrderstatesetxiada(Order order);//修改订单状态已下达
	public boolean updateOrderstateByNot(Integer id);//矿区不接受修改状态
	public boolean updateOrderOrderstateByXiadanumberByNot(Order order);
	public boolean updateOrderOrderstateByNot(String contratcoter);
	public Double showMineOutputCountByMineId(Integer id);
	public String showOrderEnddateByMineId(Integer id);//查询各截止日期
	public String showOrderBegindateByMineId(Integer id);//查询各开始日期
	public boolean updateOrderstateByid(Integer id);
}