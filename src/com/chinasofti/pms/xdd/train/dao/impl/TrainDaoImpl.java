package com.chinasofti.pms.xdd.train.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.xdd.train.dao.TrainDao;
import com.chinasofti.pms.xdd.train.entity.Gwplan;
import com.chinasofti.pms.xdd.train.entity.Pxjl;
import com.chinasofti.pms.xdd.train.entity.Tplan;
import com.chinasofti.pms.xdd.train.entity.Zhengshu;
@Repository
public class TrainDaoImpl implements TrainDao {
	boolean flag = false;
	@Autowired
	private SqlSession sqlsession;
	@Override
	public boolean AddTrainPlanEntity(Tplan tplan) {
		int i = sqlsession.insert("com.pms.xdd.train.entity.mapping.TrainEntityMapping.addPlan", tplan);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public List<Tplan> GetALLTpan() {
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllTplan");
	}
	@Override
	public boolean deletePlan(Integer id) {
		int i = sqlsession.delete("com.pms.xdd.train.entity.mapping.TrainEntityMapping.deletePlan", id);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public boolean addZhengShu(Zhengshu zhengshu) {
		int i = sqlsession.insert("com.pms.xdd.train.entity.mapping.TrainEntityMapping.addZhengshu", zhengshu);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public List<Zhengshu> getAllZS() {
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllZhengshu");
	}
	@Override
	public boolean deleteZs(Integer id) {
		// TODO Auto-generated method stub
		int i =  sqlsession.delete("com.pms.xdd.train.entity.mapping.TrainEntityMapping.deleteZs", id);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public boolean addGw(Gwplan gwplan) {
		int i = sqlsession.insert("com.pms.xdd.train.entity.mapping.TrainEntityMapping.addGw", gwplan);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public List<Gwplan> getAllGW() {
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllGw");
	}
	@Override
	public boolean deleteGW(Integer id) {
		int i = sqlsession.delete("com.pms.xdd.train.entity.mapping.TrainEntityMapping.deleteGw", id);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public boolean addPxjl(Pxjl pxjl) {
		int i = sqlsession.insert("com.pms.xdd.train.entity.mapping.TrainEntityMapping.addpxjl", pxjl);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public List<Gwplan> getAllpxjl() {
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllpxjl");
	}
	@Override
	public List<Gwplan> getAllGWJd() {
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllGwjd");
	}
	@Override
	public List<Tplan> getAllTpJd() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("com.pms.xdd.train.entity.mapping.TrainEntityMapping.getAllTpjd");
	}
	@Override
	public boolean updateGw(Gwplan gwplan) {
		int i = sqlsession.update("com.pms.xdd.train.entity.mapping.TrainEntityMapping.updategw", gwplan);
		if(i==1){
			flag = true;
		}
			return flag;
	}
	@Override
	public boolean updateGwplan(Gwplan gwplan) {
		int i = sqlsession.update("com.pms.xdd.train.entity.mapping.TrainEntityMapping.updategwplan", gwplan);
		if(i==1){
			flag = true;
		}
			return flag;
	}

}
