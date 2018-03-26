/**
 * ProductionServiceImpl.java
 * com.chinasofti.pms.zyq.production.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zmk.safety.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.pms.zmk.safety.dao.ISafetyDao;
import com.chinasofti.pms.zmk.safety.entity.Dengji;
import com.chinasofti.pms.zmk.safety.entity.Jganquan;
import com.chinasofti.pms.zmk.safety.entity.Ltanquan;
import com.chinasofti.pms.zmk.safety.entity.Weixian;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmk.safety.entity.Zhengshu;
import com.chinasofti.pms.zmk.safety.service.ISafetyService;


/**
 * ClassName:ProductionServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:07:20
 *
 * @see 	 
 *  
 */
@Service
public class SafetyServiceImpl implements ISafetyService {
	@Autowired
	ISafetyDao isafetyDao;
//增加隐患
	@Override
	public boolean addYinhuan(Yinhuan yinhuan) {
		
		// TODO Auto-generated method stub
		return isafetyDao.addYinhuan(yinhuan);
		
	}
//展示隐患
	@Override
	public List<Yinhuan> showYinhuan() {
		
		// TODO Auto-generated method stub
		return isafetyDao.showYinhuan();
		
	}
//删除隐患
		@Override
		public boolean deleteYinhuan(int id) {
			// TODO Auto-generated method stub
			return isafetyDao.deleteYinhuan(id);
		}
//增加等级
	@Override
	public boolean addDengji(Dengji dengji) {
		// TODO Auto-generated method stub
		return isafetyDao.addDengji(dengji);
	}
//展示等级
	@Override
	public List<Dengji> showDengji() {
		// TODO Auto-generated method stub
		return isafetyDao.showDengji();
	}
//增加井工
	@Override
	public boolean addJganquan(Jganquan jganquan) {
		// TODO Auto-generated method stub
		return isafetyDao.addJganquan(jganquan);
	}
//展示井工
	@Override
	public List<Jganquan> showJganquan() {
		// TODO Auto-generated method stub
		return isafetyDao.showJganquan();
	}
//删除井工
	@Override
	public boolean deleteJganquan(int jgid) {
		// TODO Auto-generated method stub
		return isafetyDao.deleteJganquan(jgid);
	}
//增加露天
	@Override
	public boolean addLtanquan(Ltanquan ltanquan) {
		// TODO Auto-generated method stub
		return isafetyDao.addLtanquan(ltanquan);
	}
//展示露天
	@Override
	public List<Ltanquan> showLtanquan() {
		// TODO Auto-generated method stub
		return isafetyDao.showLtanquan();
	}
//删除露天
	@Override
	public boolean deleteLtanquan(int ltid) {
		// TODO Auto-generated method stub
		return isafetyDao.deleteLtanquan(ltid);
	}
//增加危险
	@Override
	public boolean addWeixian(Weixian weixian) {
		// TODO Auto-generated method stub
		return isafetyDao.addWeixian(weixian);
	}
//展示危险
	@Override
	public List<Weixian> showWeixian() {
		// TODO Auto-generated method stub
		return isafetyDao.showWeixian();
	}
//删除危险
	@Override
	public boolean deleteWeixian(int wxid) {
		// TODO Auto-generated method stub
		return isafetyDao.deleteWeixian(wxid);
	}
	
//增加证书
	@Override
	public boolean addZhengshu(Zhengshu zhengshu) {
		// TODO Auto-generated method stub
		return isafetyDao.addZhengshu(zhengshu);
	}
//展示证书
	@Override
	public List<Zhengshu> showZhengshu() {
		// TODO Auto-generated method stub
		return isafetyDao.showZhengshu();
	}
//删除证书
	@Override
	public boolean deleteZhengshu(int zsid) {
		// TODO Auto-generated method stub
		return isafetyDao.deleteZhengshu(zsid);
	}

	
}

