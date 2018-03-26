package com.chinasofti.pms.xdd.train.dao;

import java.util.List;

import com.chinasofti.pms.xdd.train.entity.Gwplan;
import com.chinasofti.pms.xdd.train.entity.Pxjl;
import com.chinasofti.pms.xdd.train.entity.Tplan;
import com.chinasofti.pms.xdd.train.entity.Zhengshu;

public interface TrainDao {
	//�ճ���ѵ�ƻ�
	public boolean AddTrainPlanEntity(Tplan tplan);
	public List<Tplan> GetALLTpan();
	public boolean deletePlan(Integer id);
	//֤����Ա����
	public boolean addZhengShu(Zhengshu zhengshu);
	public List<Zhengshu> getAllZS();
	public boolean deleteZs(Integer id);
	//��λ���˼ƻ�
	public boolean addGw(Gwplan gwplan);
	public List<Gwplan> getAllGW();
	public boolean deleteGW(Integer id);
	public boolean updateGwplan(Gwplan gwplan);
	//���Ȳ�ѯ
	public List<Gwplan> getAllGWJd();
	public List<Tplan> getAllTpJd();
	public boolean updateGw(Gwplan gwplan);
	//��ѵ��¼
	public boolean addPxjl(Pxjl pxjl);
	public List<Gwplan> getAllpxjl();
}
