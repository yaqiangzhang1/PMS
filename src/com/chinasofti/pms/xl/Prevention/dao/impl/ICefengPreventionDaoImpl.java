/**
 * ICefengPreventionDaoImpl.java
 * com.chinasofti.pms.xl.Prevention.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月26日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.xl.Prevention.dao.ICefengPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Cefeng;

/**
 * ClassName:ICefengPreventionDaoImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		下午2:31:28
 *
 * @see 	 
 *  
 */

@Repository
public class ICefengPreventionDaoImpl implements ICefengPreventionDao{
	boolean flag = false;
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Cefeng> showCefengDaily() {
		List<Cefeng> listDaily = sqlSession.selectList("u.showCefengDaily");
		// TODO Auto-generated method stub
		return listDaily;
		
	}

	@Override
	public List<Cefeng> showCefengWeekly() {
		List<Cefeng> listWeekly = sqlSession.selectList("u.showCefengWeekly");
		// TODO Auto-generated method stub
		return listWeekly;
		
	}

	@Override
	public List<Cefeng> showCefengMonthly() {
		List<Cefeng> listMonthly = sqlSession.selectList("u.showCefengMonthly");
		// TODO Auto-generated method stub
		return listMonthly;
		
	}

	@Override
	public boolean insertCefeng(Cefeng cefeng) {
		// TODO Auto-generated method stub
		int i = sqlSession.insert("u.insertCefeng", cefeng);
		if(1==i){
			flag = true;
		}
		return flag;
		
	}

	@Override
	public List<Cefeng> showCefeng() {
		List<Cefeng> listCefeng = sqlSession.selectList("u.showCefeng");
		// TODO Auto-generated method stub
		return listCefeng;
		
	}

	@Override
	public List<Cefeng> showCefengToOne() {
		List<Cefeng> listCefengToOne = sqlSession.selectList("u.showCefengToOne");
		// TODO Auto-generated method stub
		return listCefengToOne;
		
	}

	@Override
	public boolean updateCefeng(Cefeng cefeng) {
		
		int i = sqlSession.update("u.updateCefeng", cefeng);
		if(1==i){
			flag = true;
		}
		return flag;
	}
	
}

