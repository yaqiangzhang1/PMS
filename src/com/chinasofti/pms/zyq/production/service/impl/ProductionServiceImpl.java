/**
 * ProductionServiceImpl.java
 * com.chinasofti.pms.zyq.production.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.pms.zyq.production.dao.IProductionDao;
import com.chinasofti.pms.zyq.production.entity.MainPlan;
import com.chinasofti.pms.zyq.production.entity.Mine;
import com.chinasofti.pms.zyq.production.entity.Order;
import com.chinasofti.pms.zyq.production.service.IProductionService;

/**
 * ClassName:ProductionServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:07:20
 *
 * @see 	 
 *  
 */
@Service
public class ProductionServiceImpl implements IProductionService {
	@Autowired
	IProductionDao iproductionDao;

	@Override
	public boolean addMine(Mine mine) {
		
		// TODO Auto-generated method stub
		return iproductionDao.addMine(mine);
		
	}

	@Override
	public List<Mine> showMine() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMine();
		
	}

	@Override
	public List<Order> showOrder() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrder();
		
	}

	@Override
	public boolean addOrder(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.addOrder(order);
		
	}

	@Override
	public Order showOrderByid(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderByid(id);
		
	}

	@Override
	public Mine showMineByid(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMineByid(id);
		
	}

	@Override
	public boolean addMainPlan(MainPlan mainplan) {
		
		// TODO Auto-generated method stub
		return iproductionDao.addMainPlan(mainplan);
		
	}

	@Override
	public List<MainPlan> showMainPlanById(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMainPlanById(id);
		
	}

	@Override
	public List<MainPlan> showMainPlanAll() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMainPlanAll();
		
	}

	@Override
	public boolean updateAuditstatus(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateAuditstatus(id);
		
	}

	@Override
	public boolean updateOrderstate(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderstate(id);
		
	}

	@Override
	public List<Order> showOrderBycompany(String company) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderBycompany(company);
		
	}

	@Override
	public String showContratcoterByid(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showContratcoterByid(id);
		
	}

	@Override
	public boolean updateOrderOrderstate(String contratcoter) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstate(contratcoter);
		
	}

	

	@Override
	public Order showOrderByContratcoter(String contratcoter) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderByContratcoter(contratcoter);
		
	}

	@Override
	public boolean updateOrderXiadanumber(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderXiadanumber(order);
		
	}

	@Override
	public boolean updateOrderOrderstate(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstate(order);
		
	}

	@Override
	public boolean updateOrderOrderstateByXiadanumber(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstateByXiadanumber(order);
		
	}

	@Override
	public int showMineCount() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMineCount();
		
	}

	@Override
	public Double showMineOutputCount() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMineOutputCount();
		
	}

	@Override
	public Order showOrderEnddate() {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderEnddate();
		
	}

	@Override
	public boolean updateOrderOrderstatesetxiada(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstatesetxiada(order);
		
	}

	@Override
	public boolean updateOrderstateByNot(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderstateByNot(id);
		
	}

	@Override
	public boolean updateOrderOrderstateByXiadanumberByNot(Order order) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstateByXiadanumberByNot(order);
		
	}

	@Override
	public boolean updateOrderOrderstateByNot(String contratcoter) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderOrderstateByNot(contratcoter);
		
	}

	@Override
	public Double showMineOutputCountByMineId(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showMineOutputCountByMineId(id);
		
	}

	@Override
	public String showOrderEnddateByMineId(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderEnddateByMineId(id);
		
	}

	@Override
	public String showOrderBegindateByMineId(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.showOrderBegindateByMineId(id);
		
	}

	@Override
	public boolean updateOrderstateByid(Integer id) {
		
		// TODO Auto-generated method stub
		return iproductionDao.updateOrderstateByid(id);
		
	}





}