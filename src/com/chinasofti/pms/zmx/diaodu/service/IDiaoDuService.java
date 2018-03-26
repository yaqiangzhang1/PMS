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

package com.chinasofti.pms.zmx.diaodu.service;


import java.util.List;

import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmx.diaodu.entity.Output;
import com.chinasofti.pms.zmx.diaodu.entity.RZhi;
import com.chinasofti.pms.zmx.diaodu.entity.Shigu;
import com.chinasofti.pms.zmx.diaodu.entity.YuAn;
import com.chinasofti.pms.zmx.diaodu.entity.ZhiHui;
import com.chinasofti.pms.zyq.production.entity.MainPlan;

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
public interface IDiaoDuService {
	public List<RZhi> getAll();
	public List<YuAn> yuAnAll();
	public boolean zhihuiadd(ZhiHui zhihui);
	public List<ZhiHui> zhihuiAll();
	public List<MainPlan> planAll();
	public List<ZhiHui> zhihui();
	public boolean update(ZhiHui zhihui);
	public boolean yuanadd(YuAn yuan);
	public boolean addoutput(Output output);
	public List<Output> showoutput(String mine_name);
	public List<Yinhuan> yinhuanAll();
	public List<ZhiHui> zhihui(Integer id);
	public List<YuAn> yuAnbyid(Integer id);
	public List<Shigu> shigu();
	public boolean yuanupdate(YuAn yuAn);
	public List<YuAn> yuanbyname(String name);
}

