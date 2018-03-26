package com.chinasofti.pms.xdd.train.dao;

import java.util.List;

import com.chinasofti.pms.xdd.train.entity.Gwplan;
import com.chinasofti.pms.xdd.train.entity.Pxjl;
import com.chinasofti.pms.xdd.train.entity.Tplan;
import com.chinasofti.pms.xdd.train.entity.Zhengshu;

public interface TrainDao {
	//日常培训计划
	public boolean AddTrainPlanEntity(Tplan tplan);
	public List<Tplan> GetALLTpan();
	public boolean deletePlan(Integer id);
	//证书人员管理
	public boolean addZhengShu(Zhengshu zhengshu);
	public List<Zhengshu> getAllZS();
	public boolean deleteZs(Integer id);
	//岗位考核计划
	public boolean addGw(Gwplan gwplan);
	public List<Gwplan> getAllGW();
	public boolean deleteGW(Integer id);
	public boolean updateGwplan(Gwplan gwplan);
	//进度查询
	public List<Gwplan> getAllGWJd();
	public List<Tplan> getAllTpJd();
	public boolean updateGw(Gwplan gwplan);
	//培训记录
	public boolean addPxjl(Pxjl pxjl);
	public List<Gwplan> getAllpxjl();
}
