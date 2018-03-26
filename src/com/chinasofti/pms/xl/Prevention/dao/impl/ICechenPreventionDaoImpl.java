/**
 * ICechenPreventionDaoImpl.java
 * com.chinasofti.pms.xl.Prevention.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月28日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.xl.Prevention.dao.ICechenPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Cechen;

/**
 * ClassName:ICechenPreventionDaoImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月28日		下午5:52:43
 *
 * @see 	 
 *  
 */

@Repository
public class ICechenPreventionDaoImpl implements ICechenPreventionDao{
	boolean flag = false;
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<Cechen> showCechenDaily() {
		List<Cechen> listDaily = sqlSession.selectList("u.showCechenDaily");
		// TODO Auto-generated method stub
		return listDaily;
		
	}

	@Override
	public List<Cechen> showCechenWeekly() {
		List<Cechen> listWeekly = sqlSession.selectList("u.showCechenWeekly");
		// TODO Auto-generated method stub
		return listWeekly;
		
	}

	@Override
	public List<Cechen> showCechenMonthly() {
		List<Cechen> listMonthly = sqlSession.selectList("u.showCechenMonthly");
		// TODO Auto-generated method stub
		return listMonthly;
		
	}

	@Override
	public boolean insertCechen(Cechen cechen) {
		int i = sqlSession.insert("u.insertCechen", cechen);
		// TODO Auto-generated method stub
		if(1 == i ){
			flag = true;
		}
		return flag;
		
	}

	@Override
	public List<Cechen> showCechen() {
		List<Cechen> listCechen = sqlSession.selectList("u.showCechen");
		// TODO Auto-generated method stub
		return listCechen;
		
	}

	@Override
	public List<Cechen> showCechenToOne() {
		List<Cechen> listCechenToOne = sqlSession.selectList("u.listCechenToOne");
		// TODO Auto-generated method stub
		return listCechenToOne;
		
	}

	@Override
	public boolean updateCechen(Cechen cechen) {
		int u = sqlSession.update("u.updateCechen",cechen);
		// TODO Auto-generated method stub
		if(1 == u){
			flag = true;
		}
		return flag;
		
	}

}

