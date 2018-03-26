/**
 * ICefengService.java
 * com.chinasofti.pms.xl.Prevention.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月26日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.service;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Cefeng;

/**
 * ClassName:ICefengService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		下午3:57:50
 *
 * @see 	 
 *  
 */
public interface ICefengService {
	public boolean insertCefeng(Cefeng cefeng);
	public List<Cefeng> showCefengDaily();
	public List<Cefeng> showCefengWeekly();
	public List<Cefeng> showCefengMonthly();
	public List<Cefeng> showCefeng();
	public List<Cefeng> showCefengToOne();
	public boolean updateCefeng(Cefeng cefeng);
}

