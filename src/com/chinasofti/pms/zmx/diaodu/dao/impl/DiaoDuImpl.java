/**
 * ProductionImpl.java
 * com.chinasofti.pms.zyq.production.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月23日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zmx.diaodu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmx.diaodu.dao.IDiaoDuDao;
import com.chinasofti.pms.zmx.diaodu.entity.Output;
import com.chinasofti.pms.zmx.diaodu.entity.RZhi;
import com.chinasofti.pms.zmx.diaodu.entity.Shigu;
import com.chinasofti.pms.zmx.diaodu.entity.YuAn;
import com.chinasofti.pms.zmx.diaodu.entity.ZhiHui;
import com.chinasofti.pms.zyq.production.entity.MainPlan;

/**
 * ClassName:ProductionImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月23日		下午3:06:10
 *
 * @see 	 
 *  
 */
@Repository
public class DiaoDuImpl implements IDiaoDuDao {
	@Autowired
	SqlSession sqlsession;
	boolean flag = false;
	
	@Override
	public List<RZhi> getAll() {
		// TODO Auto-generated method stub
		List<RZhi> list = sqlsession.selectList("zmx.getAll");
		return list;
	}

	@Override
	public List<YuAn> yuAnAll() {
		// TODO Auto-generated method stub
		List<YuAn> list = sqlsession.selectList("zmx.yuAnAll");
		return list;
	}

	@Override
	public boolean zhihuiadd(ZhiHui zhihui) {
		// TODO Auto-generated method stub
		int i=sqlsession.insert("zmx.zhihuiadd", zhihui);
		if (1==i) {
			flag=true;
		}
		return flag;
		
	}

	@Override
	public List<ZhiHui> zhihuiAll() {
		// TODO Auto-generated method stub
		List<ZhiHui> list=sqlsession.selectList("zmx.zhihuiAll");
		return list;
	}

	@Override
	public List<MainPlan> planAll() {
		// TODO Auto-generated method stub
		List<MainPlan> planlist= sqlsession.selectList("zmx.planAll");
		return planlist;
	}

	@Override
	public List<ZhiHui> zhihui() {
		// TODO Auto-generated method stub
		List<ZhiHui> list=sqlsession.selectList("zmx.zhihui");
		return list;
	}

	@Override
	public boolean update(ZhiHui zhihui) {
		// TODO Auto-generated method stub
		int i=sqlsession.update("zmx.update",zhihui);
		if (1==i) {
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean yuanadd(YuAn yuan) {
		// TODO Auto-generated method stub
		int i=sqlsession.insert("zmx.yuanadd", yuan);
		if (1==i) {
			flag=true;
		}
		return flag;
	}

	@Override
	public boolean addoutput(Output output) {
		// TODO Auto-generated method stub
		int i=sqlsession.insert("zmx.addoutput", output);
		if (1==i) {
			flag=true;
		}
		return flag;
	}

	@Override
	public List<Output> showoutput(String mine_name) {
		// TODO Auto-generated method stub
		List<Output> list=sqlsession.selectList("zmx.showoutput",mine_name);
		return list;
	}

	@Override
	public List<Yinhuan> yinhuanAll() {
		// TODO Auto-generated method stub
		List<Yinhuan> list=sqlsession.selectList("zmx.yinhuanAll");
		return list;
	}

	@Override
	public List<ZhiHui> zhihui(Integer id) {
		// TODO Auto-generated method stub
		ZhiHui zhihui = sqlsession.selectOne("zmx.zhihuibyid",id);
		List<ZhiHui> list=new ArrayList<ZhiHui>();
		list.add(zhihui);
		return list;
	}

	@Override
	public List<YuAn> yuAnbyid(Integer id) {
		// TODO Auto-generated method stub
		YuAn yuan=sqlsession.selectOne("zmx.yuAnbyid",id);
		List<YuAn> list=new ArrayList<YuAn>();
		list.add(yuan);
		return list;
	}

	@Override
	public List<Shigu> shigu() {
		// TODO Auto-generated method stub
		List<Shigu> list=sqlsession.selectList("zmx.shiguAll");
		return list;
	}

	@Override
	public boolean yuanupdate(YuAn yuAn) {
		// TODO Auto-generated method stub
		int i=sqlsession.update("zmx.yuanupdate",yuAn);
		if (1==i) {
			flag=true;
		}
		return flag;
	}

	@Override
	public List<YuAn> yuanbyname(String name) {
		// TODO Auto-generated method stub
		YuAn yuan=sqlsession.selectOne("zmx.yuanbyname",name);
		List<YuAn> list=new ArrayList<YuAn>();
		list.add(yuan);
		return list;
	}

}

