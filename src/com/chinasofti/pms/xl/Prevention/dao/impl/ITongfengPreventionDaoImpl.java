/**
 * ITongfengPreventionDaoImpl.java
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

import com.chinasofti.pms.xl.Prevention.dao.ITongfengPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Tongfeng;


/**
 * ClassName:ITongfengPreventionDaoImpl

 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		上午10:10:42
 *
 * @see 	 
 *  
 */
@Repository
public class ITongfengPreventionDaoImpl implements ITongfengPreventionDao{
	boolean flag = false;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Tongfeng> showTongfengDaily() {
		List<Tongfeng> listDaily = sqlSession.selectList("u.showTongfengDaily");
		// TODO Auto-generated method stub
		return listDaily;
		
	}

	@Override
	public List<Tongfeng> showTongfengWeekly() {
		List<Tongfeng> listWeekly = sqlSession.selectList("u.showTongfengWeekly");
		// TODO Auto-generated method stub
		return listWeekly;
		
	}

	@Override
	public List<Tongfeng> showTongfengMonthly() {
		List<Tongfeng> listMonthly = sqlSession.selectList("u.showTongfengMonthly");
		// TODO Auto-generated method stub
		return listMonthly;
		
	}

	@Override
	public boolean insertTongfeng(Tongfeng tongfeng) {
		int i = sqlSession.insert("u.insertTongfeng",tongfeng);
		// TODO Auto-generated method stub
		if(1 == i){
			flag = true;
		}
		return flag;
		
	}

	@Override
	public List<Tongfeng> showTongfeng() {
		List<Tongfeng> listTongfeng = sqlSession.selectList("u.showTongfeng");
		// TODO Auto-generated method stub
		return listTongfeng;
		
	}

	@Override
	public List<Tongfeng> showTongfengToOne() {
		List<Tongfeng> listTongfengToOne = sqlSession.selectList("u.showTongfengToOne");
		// TODO Auto-generated method stub
		return listTongfengToOne;
		
	}

	@Override
	public boolean updateTongfeng(Tongfeng tongfeng) {
		
		int i = sqlSession.update("u.updateTongfeng",tongfeng);
		// TODO Auto-generated method stub
		if(1 == i){
			flag = true;
		}
		return flag;
		
	}

}

