/**
 * ProductionImpl.java
 * com.chinasofti.pms.zyq.production.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.zyq.production.dao.IProductionDao;
import com.chinasofti.pms.zyq.production.entity.MainPlan;
import com.chinasofti.pms.zyq.production.entity.Mine;
import com.chinasofti.pms.zyq.production.entity.MineOutPut;
import com.chinasofti.pms.zyq.production.entity.Order;

/**
 * ClassName:ProductionImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:06:10
 *
 * @see 	 
 *  
 */
@Repository
public class ProductionImpl implements IProductionDao {
	@Autowired
	SqlSession sqlsession;
	boolean flag = false;
	@Override
	public boolean addMine(Mine mine) {
		int insert = sqlsession.insert("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.addMine", mine);
		// TODO Auto-generated method stub
		if(insert==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public List<Mine> showMine() {
		List<Mine> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMine");
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public List<Order> showOrder() {
		List<Order> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrder");
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public boolean addOrder(Order order) {
		int insert = sqlsession.insert("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.addOrder", order);
		// TODO Auto-generated method stub
		System.out.println(insert);
		if(insert==1){
			flag = true;
		}
		return flag;
	}
	@Override
	public Order showOrderByid(Integer id) {
		Order selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderByid", id);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public Mine showMineByid(Integer id) {
		Mine selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMineByid", id);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public boolean addMainPlan(MainPlan mainplan) {
		int insert = sqlsession.insert("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.addMainPlan", mainplan);
		// TODO Auto-generated method stub
		System.out.println(insert);
		if(insert==1){
			flag = true;
		}
		return flag;
	
		
	}
	@Override
	public List<MainPlan> showMainPlanById(Integer id) {
		List<MainPlan> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMainPlanByid",id);
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public List<MainPlan> showMainPlanAll() {
		List<MainPlan> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMainPlanAll");
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public boolean updateAuditstatus(Integer id) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateAuditstatus", id);
		// TODO Auto-generated method stub
		if(update==1){
			flag=true;
		}
		return flag;
		
	}
	@Override
	public boolean updateOrderstate(Integer id) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderstate", id);
		// TODO Auto-generated method stub
		if(update==1){
			flag=true;
		}
		return flag;
	}
	@Override
	public List<Order> showOrderBycompany(String company) {
		List<Order> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderBycompany", company);
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public String showContratcoterByid(Integer id) {
		String selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showContratcoterByid",id);
		// TODO Auto-generated method stub
		System.out.println(selectOne);
		return selectOne;
		
	}
	@Override
	public boolean updateOrderOrderstate(String contratcoter) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstate",contratcoter);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public boolean updateOrderXiadanumber(Order order) {
		
			int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderXiadanumber", order);
			// TODO Auto-generated method stub
			if(update==1){
				flag = true;
			}
			return flag;
			
		
		
	}
	@Override
	public Order showOrderByContratcoter(String contratcoter) {
		Order selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderByContratcoter", contratcoter);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public boolean updateOrderOrderstate(Order order) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstateByorder", order);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public boolean updateOrderOrderstateByXiadanumber(Order order) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstateByXiadanumber", order);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
	}
	@Override
	public int showMineCount() {
		int selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMineCount");
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public Double showMineOutputCount() {
		double selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMineOutputCount");

		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public Order showOrderEnddate() {
		Order selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderEnddate");
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public boolean updateOrderOrderstatesetxiada(Order order) {
		
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstatesetxiada", order);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public boolean updateOrderstateByNot(Integer id) {
		
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderstateByNot", id);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
	}
	@Override
	public boolean updateOrderOrderstateByXiadanumberByNot(Order order) {
		
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstateByXiadanumberByNot", order);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public boolean updateOrderOrderstateByNot(String contratcoter) {
		
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderOrderstateByNot", contratcoter);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public Double showMineOutputCountByMineId(Integer id) {
		Double selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showMineOutputCountByMineId", id);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public String showOrderEnddateByMineId(Integer id) {
		String selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderEnddateByMineId", id);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public String showOrderBegindateByMineId(Integer id) {
		String selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.showOrderBegindateByMineId", id);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public boolean updateOrderstateByid(Integer id) {
		int update = sqlsession.update("com.chinasofti.pms.zyq.production.entity.mapping.productionmapping.updateOrderstateByid", id);
		// TODO Auto-generated method stub
		if(update==1){
			flag = true;
		}
		return flag;
		
	}

	
	
}

