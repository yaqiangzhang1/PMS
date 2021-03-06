/**
 * ITongfengService.java
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
import com.chinasofti.pms.xl.Prevention.entity.Tongfeng;

/**
 * ClassName:ITongfengService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		上午11:54:00
 *
 * @see 	 
 *  
 */
public interface ITongfengService {
	public List<Tongfeng> showTongfengDaily();
	public List<Tongfeng> showTongfengWeekly();
	public List<Tongfeng> showTongfengMonthly();
	public boolean insertTongfeng(Tongfeng tongfeng);
	public List<Tongfeng> showTongfeng();
	public List<Tongfeng> showTongfengToOne();
	public boolean updateTongfeng(Tongfeng tongfeng);
}

