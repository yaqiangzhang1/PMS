/**
 * ICechenPreventionDao.java
 * com.chinasofti.pms.xl.Prevention.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月28日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.dao;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Cechen;

/**
 * ClassName:ICechenPreventionDao
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月28日		下午5:39:08
 *
 * @see 	 
 *  
 */
public interface ICechenPreventionDao {
	public List<Cechen> showCechenDaily();
	public List<Cechen> showCechenWeekly();
	public List<Cechen> showCechenMonthly();
	public boolean insertCechen(Cechen cechen);
	public List<Cechen> showCechen();
	public List<Cechen> showCechenToOne();
	public boolean updateCechen(Cechen cechen);
}

