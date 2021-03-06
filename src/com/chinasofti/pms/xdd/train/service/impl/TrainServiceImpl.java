package com.chinasofti.pms.xdd.train.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.pms.xdd.train.dao.impl.TrainDaoImpl;
import com.chinasofti.pms.xdd.train.entity.Gwplan;
import com.chinasofti.pms.xdd.train.entity.Pxjl;
import com.chinasofti.pms.xdd.train.entity.Tplan;
import com.chinasofti.pms.xdd.train.entity.Zhengshu;
import com.chinasofti.pms.xdd.train.service.TrainService;
@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	TrainDaoImpl trainDaoImpl;
	@Override
	public boolean AddTrainPlanEntity(Tplan tplan) {
		return trainDaoImpl.AddTrainPlanEntity(tplan);
	}

	@Override
	public List<Tplan> GetALLTpan() {
		// TODO Auto-generated method stub
		return trainDaoImpl.GetALLTpan();
	}

	@Override
	public boolean deletePlan(Integer id) {
		// TODO Auto-generated method stub
		return trainDaoImpl.deletePlan(id);
	}

	@Override
	public boolean addZhengShu(Zhengshu zhengshu) {
		// TODO Auto-generated method stub
		return trainDaoImpl.addZhengShu(zhengshu);
	}

	@Override
	public List<Zhengshu> getAllZS() {
		// TODO Auto-generated method stub
		return trainDaoImpl.getAllZS();
	}

	@Override
	public boolean deleteZs(Integer id) {
		// TODO Auto-generated method stub
		return trainDaoImpl.deleteZs(id);
	}

	@Override
	public boolean addGw(Gwplan gwplan) {
		// TODO Auto-generated method stub
		return trainDaoImpl.addGw(gwplan);
	}

	@Override
	public List<Gwplan> getAllGW() {
		// TODO Auto-generated method stub
		return trainDaoImpl.getAllGW();
	}

	@Override
	public boolean deleteGW(Integer id) {
		// TODO Auto-generated method stub
		return trainDaoImpl.deleteGW(id);
	}

	@Override
	public boolean addPxjl(Pxjl pxjl) {
		return trainDaoImpl.addPxjl(pxjl);
	}

	@Override
	public List<Gwplan> getAllpxjl() {
		return trainDaoImpl.getAllpxjl();
	}

	@Override
	public List<Gwplan> getAllGWJd() {
		// TODO Auto-generated method stub
		return trainDaoImpl.getAllGWJd();
	}

	@Override
	public List<Tplan> getAllTpJd() {
		// TODO Auto-generated method stub
		return trainDaoImpl.getAllTpJd();
	}

	@Override
	public boolean updateGw(Gwplan gwplan) {
		// TODO Auto-generated method stub
		return trainDaoImpl.updateGw(gwplan);
	}

	@Override
	public boolean updateGwplan(Gwplan gwplan) {
		// TODO Auto-generated method stub
		return trainDaoImpl.updateGwplan(gwplan);
	}

}
