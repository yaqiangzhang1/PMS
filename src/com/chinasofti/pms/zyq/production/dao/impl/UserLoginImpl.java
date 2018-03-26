/**
 * UserLoginImpl.java
 * com.chinasofti.pms.zyq.production.dao.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月6日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chinasofti.pms.zyq.production.dao.IUserLogin;
import com.chinasofti.pms.zyq.production.entity.Bumen;
import com.chinasofti.pms.zyq.production.entity.User;

/**
 * ClassName:UserLoginImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		下午6:33:53
 *
 * @see 	 
 *  
 */
@Repository
public class UserLoginImpl implements IUserLogin {
	@Autowired
	SqlSession sqlsession;
	boolean flag = false;
	@Override
	public boolean UserLogin(User user) {
		User user1 = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.userLogin", user);
		if("null1".equals(user1+"1")){
			return false;
		}
		System.out.println(user1.getU_name());
		System.out.println(user1.getU_password());
		System.out.println(user1.toString());
		System.out.println(user.getU_password());
		System.out.println(user1.getU_password().equals(user.getU_password()));
		if(user1.getU_password().equals(user.getU_password())){
			return true;
		}
		else{
			return false;
		}
		
	}
	@Override
	public List<Bumen> showBumenAll() {
		List<Bumen> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.showBumenAll");
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public boolean addyhjs(Bumen bumen) {
		int insert = sqlsession.insert("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.addyhjs", bumen);
		// TODO Auto-generated method stub
		if(insert==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public List<User> showUserAll() {
		
		List<User> selectList = sqlsession.selectList("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.showUserAll");
		// TODO Auto-generated method stub
		return selectList;
		
	}
	@Override
	public boolean addyhxx(User user) {
		
		int insert = sqlsession.insert("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.addyhxx", user);
		// TODO Auto-generated method stub
		if(insert==1){
			flag = true;
		}
		return flag;
		
	}
	@Override
	public User showUserBygonghao(String gonghao) {
		User selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.showUserBygonghao", gonghao);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public String showqxByjs(String u_bmid) {
		
		String selectOne = sqlsession.selectOne("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.showqxByjs", u_bmid);
		// TODO Auto-generated method stub
		return selectOne;
		
	}
	@Override
	public boolean deleteyh(Integer id) {
		int delete = sqlsession.delete("com.chinasofti.pms.zyq.production.entity.mapping.userLoginmapping.deleteyh", id);
		// TODO Auto-generated method stub
		if(delete==1){
			flag = true;
		}
		return flag;
		
	}
	

}

