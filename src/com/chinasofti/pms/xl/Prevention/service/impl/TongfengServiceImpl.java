/**
 * TongfengServiceImpl.java
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

import com.chinasofti.pms.xl.Prevention.dao.ITongfengPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Tongfeng;
import com.chinasofti.pms.xl.Prevention.service.ITongfengService;

/**
 * ClassName:TongfengServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		上午11:57:24
 *
 * @see 	 
 *  
 */

@Service
public class TongfengServiceImpl implements ITongfengService {

	@Autowired
	ITongfengPreventionDao tongfengPreventionDao;
	
	@Override
	public List<Tongfeng> showTongfengDaily() {

		// TODO Auto-generated method stub
		return tongfengPreventionDao.showTongfengDaily();

	}

	@Override
	public List<Tongfeng> showTongfengWeekly() {

		// TODO Auto-generated method stub
		return tongfengPreventionDao.showTongfengWeekly();

	}

	@Override
	public List<Tongfeng> showTongfengMonthly() {

		// TODO Auto-generated method stub
		return tongfengPreventionDao.showTongfengMonthly();

	}

	@Override
	public boolean insertTongfeng(Tongfeng tongfeng) {
		
		// TODO Auto-generated method stub
		return tongfengPreventionDao.insertTongfeng(tongfeng);
		
	}

	@Override
	public List<Tongfeng> showTongfeng() {
		
		// TODO Auto-generated method stub
		return tongfengPreventionDao.showTongfeng();
		
	}

	@Override
	public List<Tongfeng> showTongfengToOne() {
		
		// TODO Auto-generated method stub
		return tongfengPreventionDao.showTongfengToOne();
		
	}

	@Override
	public boolean updateTongfeng(Tongfeng tongfeng) {
		
		// TODO Auto-generated method stub
		return tongfengPreventionDao.updateTongfeng(tongfeng);
		
	}

}

