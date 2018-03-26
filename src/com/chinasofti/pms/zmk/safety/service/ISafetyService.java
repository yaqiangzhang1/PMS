/**
 * IProductionService.java
 * com.chinasofti.pms.zyq.production.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zmk.safety.service;


import java.util.List;

import com.chinasofti.pms.zmk.safety.entity.Dengji;
import com.chinasofti.pms.zmk.safety.entity.Jganquan;
import com.chinasofti.pms.zmk.safety.entity.Ltanquan;
import com.chinasofti.pms.zmk.safety.entity.Weixian;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmk.safety.entity.Zhengshu;


/**
 * ClassName:IProductionService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:06:43
 *
 * @see 	 
 *  
 */
public interface ISafetyService {
	public boolean addYinhuan(Yinhuan yinhuan);
	public List<Yinhuan> showYinhuan();
	public boolean deleteYinhuan(int id);
	
	public boolean addDengji(Dengji dengji);
	public List<Dengji> showDengji();
	
	public boolean addJganquan(Jganquan jganquan);
	public List<Jganquan> showJganquan();
	public boolean deleteJganquan(int jgid);
	
	public boolean addLtanquan(Ltanquan ltanquan);
	public List<Ltanquan> showLtanquan();
	public boolean deleteLtanquan(int ltid);
	
	public boolean addWeixian(Weixian weixian);
	public List<Weixian> showWeixian();
	public boolean deleteWeixian(int wxid);
	
	public boolean addZhengshu(Zhengshu zhengshu);
	public List<Zhengshu> showZhengshu();
	public boolean deleteZhengshu(int zsid);
}

