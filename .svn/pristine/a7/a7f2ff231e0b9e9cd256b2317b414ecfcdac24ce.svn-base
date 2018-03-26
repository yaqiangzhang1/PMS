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

package com.chinasofti.pms.zmk.safety.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.zmk.safety.dao.ISafetyDao;
import com.chinasofti.pms.zmk.safety.entity.Dengji;
import com.chinasofti.pms.zmk.safety.entity.Jganquan;
import com.chinasofti.pms.zmk.safety.entity.Ltanquan;
import com.chinasofti.pms.zmk.safety.entity.Weixian;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmk.safety.entity.Zhengshu;


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
public class SafetyImpl implements ISafetyDao {
	@Autowired
	SqlSession sqlsession;
	boolean flag = false;
//增加隐患
	@Override
	public boolean addYinhuan(Yinhuan yinhuan) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addYinhuan", yinhuan);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
		
	}
//展示隐患
	@Override
	public List<Yinhuan> showYinhuan() {
		List<Yinhuan> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showYinhuan");
		// TODO Auto-generated method stub
		return list;
		
	}
//删除隐患
		@Override
		public boolean deleteYinhuan(int id) {
			// TODO Auto-generated method stub
			int i = sqlsession.delete("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.deleteYinhuan",id);
            if(i==1){
    			flag = true;
    		}
    		return flag;
    	}
//增加等级（未用）
	@Override
	public boolean addDengji(Dengji dengji) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addDengji", dengji);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
	}
//展示等级（未用）
	@Override
	public List<Dengji> showDengji() {
		List<Dengji> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showDengji");
		// TODO Auto-generated method stub
		return list;
	}
//增加井工
	@Override
	public boolean addJganquan(Jganquan jganquan) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addJganquan", jganquan);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
	}
//展示井工
	@Override
	public List<Jganquan> showJganquan() {
		List<Jganquan> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showJganquan");
		// TODO Auto-generated method stub
		return list;
	}public SafetyImpl() {
		// TODO Auto-generated constructor stub
	}
//删除井工
	@Override
	public boolean deleteJganquan(int jgid) {
		// TODO Auto-generated method stub
            int i = sqlsession.delete("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.deleteJganquan",jgid);
            if(i==1){
    			flag = true;
    		}
    		return flag;
    	}
//增加露天
	@Override
	public boolean addLtanquan(Ltanquan ltanquan) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addLtanquan", ltanquan);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
	}
//展示露天
	@Override
	public List<Ltanquan> showLtanquan() {
		List<Ltanquan> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showLtanquan");
		// TODO Auto-generated method stub
		return list;
	
	}
//删除露天
	@Override
	public boolean deleteLtanquan(int ltid) {
		// TODO Auto-generated method stub
		int i = sqlsession.delete("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.deleteLtanquan",ltid);
        if(i==1){
			flag = true;
		}
		return flag;
	}
//增加危险
	@Override
	public boolean addWeixian(Weixian weixian) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addWeixian", weixian);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
	}
//展示危险
	@Override
	public List<Weixian> showWeixian() {
		List<Weixian> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showWeixian");
		// TODO Auto-generated method stub
		return list;
	
	}
//删除危险
	@Override
	public boolean deleteWeixian(int wxid) {
		// TODO Auto-generated method stub
		int i = sqlsession.delete("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.deleteWeixian",wxid);
        if(i==1){
			flag = true;
		}
		return flag;
	}
//增加证书
	@Override
	public boolean addZhengshu(Zhengshu zhengshu) {
		int i = sqlsession.insert("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.addZhengshu", zhengshu);
		// TODO Auto-generated method stub
		if(i==1){
			flag = true;
		}
		return flag;
	}
//展示证书
	@Override
	public List<Zhengshu> showZhengshu() {
		List<Zhengshu> list = sqlsession.selectList("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.showZhengshu");
		// TODO Auto-generated method stub
		return list;
	
	}
//删除证书
	@Override
	public boolean deleteZhengshu(int zsid) {
		// TODO Auto-generated method stub
		int i = sqlsession.delete("com.chinasofti.pms.zmk.safety.entity.mapping.safetymapping.deleteZhengshu",zsid);
        if(i==1){
			flag = true;
		}
		return flag;
	}
	}
	
