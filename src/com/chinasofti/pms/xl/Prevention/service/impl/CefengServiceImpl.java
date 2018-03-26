/**
 * CefengServiceImpl.java
 * com.chinasofti.pms.xl.Prevention.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月26日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.pms.xl.Prevention.dao.ICefengPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Cefeng;
import com.chinasofti.pms.xl.Prevention.service.ICefengService;

/**
 * ClassName:CefengServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		下午4:00:23
 *
 * @see 	 
 *  
 */

@Service
public class CefengServiceImpl implements ICefengService{

	@Autowired
	ICefengPreventionDao cefengPreventionDao;
	
	
	@Override
	public List<Cefeng> showCefengDaily() {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.showCefengDaily();
		
	}

	@Override
	public List<Cefeng> showCefengWeekly() {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.showCefengWeekly();
		
	}

	@Override
	public List<Cefeng> showCefengMonthly() {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.showCefengMonthly();
		
	}

	@Override
	@Transactional
	public boolean insertCefeng(Cefeng cefeng) {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.insertCefeng(cefeng);
		
	}

	@Override
	public List<Cefeng> showCefeng() {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.showCefeng();
		
	}

	@Override
	public List<Cefeng> showCefengToOne() {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.showCefengToOne();
		
	}

	@Override
	public boolean updateCefeng(Cefeng cefeng) {
		
		// TODO Auto-generated method stub
		return cefengPreventionDao.updateCefeng(cefeng);
		
	}
	
}

