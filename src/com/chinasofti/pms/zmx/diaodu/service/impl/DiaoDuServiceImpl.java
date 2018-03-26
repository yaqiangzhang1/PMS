
package com.chinasofti.pms.zmx.diaodu.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmx.diaodu.dao.IDiaoDuDao;
import com.chinasofti.pms.zmx.diaodu.entity.Output;
import com.chinasofti.pms.zmx.diaodu.entity.RZhi;
import com.chinasofti.pms.zmx.diaodu.entity.Shigu;
import com.chinasofti.pms.zmx.diaodu.entity.YuAn;
import com.chinasofti.pms.zmx.diaodu.entity.ZhiHui;
import com.chinasofti.pms.zmx.diaodu.service.IDiaoDuService;
import com.chinasofti.pms.zyq.production.entity.MainPlan;

@Service
public class DiaoDuServiceImpl implements IDiaoDuService {
	@Autowired
	IDiaoDuDao idiaoduDao;
	
	@Override
	public List<RZhi> getAll() {
		// TODO Auto-generated method stub
		return idiaoduDao.getAll();
	}

	@Override
	public List<YuAn> yuAnAll() {
		// TODO Auto-generated method stub
		return idiaoduDao.yuAnAll();
	}

	@Override
	public boolean zhihuiadd(ZhiHui zhihui) {
		// TODO Auto-generated method stub
		return idiaoduDao.zhihuiadd(zhihui);
	}

	@Override
	public List<ZhiHui> zhihuiAll() {
		// TODO Auto-generated method stub
		return idiaoduDao.zhihuiAll();
	}

	@Override
	public List<MainPlan> planAll() {
		// TODO Auto-generated method stub
		return idiaoduDao.planAll();
	}

	@Override
	public List<ZhiHui> zhihui() {
		// TODO Auto-generated method stub
		return idiaoduDao.zhihui();
	}

	@Override
	public boolean update(ZhiHui zhihui) {
		// TODO Auto-generated method stub
		return idiaoduDao.update(zhihui);
	}

	@Override
	public boolean yuanadd(YuAn yuan) {
		// TODO Auto-generated method stub
		return idiaoduDao.yuanadd(yuan);
	}

	@Override
	public boolean addoutput(Output output) {
		// TODO Auto-generated method stub
		return idiaoduDao.addoutput(output);
	}

	@Override
	public List<Output> showoutput(String mine_name) {
		// TODO Auto-generated method stub
		return idiaoduDao.showoutput(mine_name);
	}

	@Override
	public List<Yinhuan> yinhuanAll() {
		// TODO Auto-generated method stub
		return idiaoduDao.yinhuanAll();
	}

	@Override
	public List<ZhiHui> zhihui(Integer id) {
		// TODO Auto-generated method stub
		return idiaoduDao.zhihui(id);
	}

	@Override
	public List<YuAn> yuAnbyid(Integer id) {
		// TODO Auto-generated method stub
		return idiaoduDao.yuAnbyid(id);
	}

	@Override
	public List<Shigu> shigu() {
		// TODO Auto-generated method stub
		return idiaoduDao.shigu();
	}

	@Override
	public boolean yuanupdate(YuAn yuAn) {
		// TODO Auto-generated method stub
		return idiaoduDao.yuanupdate(yuAn);
	}

	@Override
	public List<YuAn> yuanbyname(String name) {
		// TODO Auto-generated method stub
		return idiaoduDao.yuanbyname(name);
	}



}

