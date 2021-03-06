/**
 * ICechenService.java
 * com.chinasofti.pms.xl.Prevention.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月29日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.service;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Cechen;

/**
 * ClassName:ICechenService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月29日		上午8:41:24
 *
 * @see 	 
 *  
 */
public interface ICechenService {
	
	public List<Cechen> showCechenDaily();
	public List<Cechen> showCechenWeekly();
	public List<Cechen> showCechenMonthly();
	public boolean insertCechen(Cechen cechen);
	public List<Cechen> showCechen();
	public List<Cechen> showCechenToOne();
	public boolean updateCechen(Cechen cechen);
}

