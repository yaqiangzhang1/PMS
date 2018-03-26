/**
 * IUserLogin.java
 * com.chinasofti.pms.zyq.production.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月6日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.dao;

import java.util.List;

import com.chinasofti.pms.zyq.production.entity.Bumen;
import com.chinasofti.pms.zyq.production.entity.User;

/**
 * ClassName:IUserLogin
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		下午6:30:31
 *
 * @see 	 
 *  
 */
public interface IUserLogin {
	public boolean UserLogin(User user);
	public List<Bumen> showBumenAll();
	public boolean addyhjs(Bumen bumen);
	public List<User> showUserAll();
	public boolean addyhxx(User user);
	public User showUserBygonghao(String gonghao);
	public String showqxByjs(String u_bmid);
	public boolean deleteyh(Integer id);
}

