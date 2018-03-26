/**
 * IWasiService.java
 * com.chinasofti.pms.xl.Prevention.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月30日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.service;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Wasi;

/**
 * ClassName:IWasiService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月30日		下午3:48:49
 *
 * @see 	 
 *  
 */
public interface IWasiService {
	public List<Wasi> showWasiDaily();
	public List<Wasi> showWasiWeekly();
	public List<Wasi> showWasiMonthly();
	public boolean insertWasi(Wasi wasi);
	public List<Wasi> showWasi();
	public List<Wasi> showWasiToOne();
	public boolean updateWasi(Wasi wasi);
}

