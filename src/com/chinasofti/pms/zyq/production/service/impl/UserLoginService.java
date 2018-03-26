/**
 * UserLoginService.java
 * com.chinasofti.pms.zyq.production.service.impl
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月6日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.pms.zyq.production.dao.IProductionDao;
import com.chinasofti.pms.zyq.production.dao.IUserLogin;
import com.chinasofti.pms.zyq.production.entity.Bumen;
import com.chinasofti.pms.zyq.production.entity.User;
import com.chinasofti.pms.zyq.production.service.IUserLoginService;

/**
 * ClassName:UserLoginService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		下午6:44:57
 *
 * @see 	 
 *  
 */
@Service
public class UserLoginService implements IUserLoginService {
	@Autowired
	IUserLogin iuserlogin;
	@Override
	public boolean UserLogin(User user) {

		// TODO Auto-generated method stub
		return iuserlogin.UserLogin(user);

	}
	@Override
	public List<Bumen> showBumenAll() {
		
		// TODO Auto-generated method stub
		return iuserlogin.showBumenAll();
		
	}
	@Override
	public boolean addyhjs(Bumen bumen) {
		
		// TODO Auto-generated method stub
		return iuserlogin.addyhjs(bumen);
		
	}
	@Override
	public List<User> showUserAll() {
		
		// TODO Auto-generated method stub
		return iuserlogin.showUserAll();
		
	}
	@Override
	public boolean addyhxx(User user) {
		
		// TODO Auto-generated method stub
		return iuserlogin.addyhxx(user);
		
	}
	@Override
	public User showUserBygonghao(String gonghao) {
		
		// TODO Auto-generated method stub
		return iuserlogin.showUserBygonghao(gonghao);
		
	}
	@Override
	public String showqxByjs(String u_bmid) {
		
		// TODO Auto-generated method stub
		return iuserlogin.showqxByjs(u_bmid);
		
	}
	@Override
	public boolean deleteyh(Integer id) {
		
		// TODO Auto-generated method stub
		return iuserlogin.deleteyh(id);
		
	}

}

