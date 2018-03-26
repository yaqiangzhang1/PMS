/**
 * IWasiPreventionDaoImpl.java
 * com.chinasofti.pms.xl.Prevention.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月30日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.xl.Prevention.dao.IWasiPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Wasi;

/**
 * ClassName:IWasiPreventionDaoImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月30日		下午3:31:29
 *
 * @see 	 
 *  
 */

@Repository
public class IWasiPreventionDaoImpl implements IWasiPreventionDao {
	boolean flag = false;
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<Wasi> showWasiDaily() {
		List<Wasi> listDaily = sqlSession.selectList("u.showWasiDaily");
		// TODO Auto-generated method stub
		return listDaily;

	}

	@Override
	public List<Wasi> showWasiWeekly() {
		List<Wasi> listWeekly = sqlSession.selectList("u.showWasiWeekly");
		// TODO Auto-generated method stub
		return listWeekly;

	}

	@Override
	public List<Wasi> showWasiMonthly() {
		List<Wasi> listMonthly = sqlSession.selectList("u.showWasiMonthly");
		// TODO Auto-generated method stub
		return listMonthly;

	}

	@Override
	public boolean insertWasi(Wasi wasi) {
		int i = sqlSession.insert("u.insertWasi", wasi);
		// TODO Auto-generated method stub
		if(1 == i ){
			flag = true;
		}
		return flag;
		
	}

	@Override
	public List<Wasi> showWasi() {
		List<Wasi> listWasi = sqlSession.selectList("u.showWasi");
		// TODO Auto-generated method stub
		return listWasi;
		
	}

	@Override
	public List<Wasi> showWasiToOne() {
		List<Wasi> listWasiToOne = sqlSession.selectList("u.showWasiToOne");
		// TODO Auto-generated method stub
		return listWasiToOne;
		
	}

	@Override
	public boolean updateWasi(Wasi wasi) {
		int u = sqlSession.update("u.updateWasi",wasi);
		// TODO Auto-generated method stub
		if(1 == u ){
			flag = true;
		}
		return flag;
		
	}

}

