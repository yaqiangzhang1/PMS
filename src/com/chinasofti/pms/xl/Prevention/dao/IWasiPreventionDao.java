/**
 * IWasiPreventionDao.java
 * com.chinasofti.pms.xl.Prevention.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月30日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.dao;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Wasi;

/**
 * ClassName:IWasiPreventionDao
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月30日		下午3:26:14
 *
 * @see 	 
 *  
 */
public interface IWasiPreventionDao {
	public List<Wasi> showWasiDaily();
	public List<Wasi> showWasiWeekly();
	public List<Wasi> showWasiMonthly();
	public boolean insertWasi(Wasi wasi);
	public List<Wasi> showWasi();
	public List<Wasi> showWasiToOne();
	public boolean updateWasi(Wasi wasi);
}

