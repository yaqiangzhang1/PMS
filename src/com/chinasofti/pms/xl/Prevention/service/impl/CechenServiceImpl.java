/**
 * CechenServiceImpl.java
 * com.chinasofti.pms.xl.Prevention.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月29日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.pms.xl.Prevention.dao.ICechenPreventionDao;
import com.chinasofti.pms.xl.Prevention.entity.Cechen;
import com.chinasofti.pms.xl.Prevention.service.ICechenService;

/**
 * ClassName:CechenServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月29日		上午8:59:13
 *
 * @see 	 
 *  
 */

@Service
public class CechenServiceImpl implements ICechenService{

	@Autowired
	ICechenPreventionDao cechenPreventionDao;
	
	@Override
	public List<Cechen> showCechenDaily() {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.showCechenDaily();
		
	}

	@Override
	public List<Cechen> showCechenWeekly() {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.showCechenWeekly();
		
	}

	@Override
	public List<Cechen> showCechenMonthly() {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.showCechenMonthly();
		
	}

	@Override
	public boolean insertCechen(Cechen cechen) {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.insertCechen(cechen);
		
	}

	@Override
	public List<Cechen> showCechen() {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.showCechen();
		
	}

	@Override
	public List<Cechen> showCechenToOne() {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.showCechenToOne();
		
	}

	@Override
	public boolean updateCechen(Cechen cechen) {
		
		// TODO Auto-generated method stub
		return cechenPreventionDao.updateCechen(cechen);
		
	}

}

