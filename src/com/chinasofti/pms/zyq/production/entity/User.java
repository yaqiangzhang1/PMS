/**
 * User.java
 * com.chinasofti.pms.zyq.production.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月6日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.entity;
/**
 * ClassName:User
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		下午6:30:59
 *
 * @see 	 
 *  
 */
public class User {
	private Integer u_id;
	private String u_gonghao;
	private String u_bmid;
	private String u_name;
	private String u_password;
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_gonghao() {
		return u_gonghao;
	}
	public void setU_gonghao(String u_gonghao) {
		this.u_gonghao = u_gonghao;
	}
	public String getU_bmid() {
		return u_bmid;
	}
	public void setU_bmid(String u_bmid) {
		this.u_bmid = u_bmid;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public User(Integer u_id, String u_gonghao, String u_bmid, String u_name, String u_password) {
		super();
		this.u_id = u_id;
		this.u_gonghao = u_gonghao;
		this.u_bmid = u_bmid;
		this.u_name = u_name;
		this.u_password = u_password;
	}
	public User(String u_gonghao, String u_bmid, String u_name, String u_password) {
		super();
		this.u_gonghao = u_gonghao;
		this.u_bmid = u_bmid;
		this.u_name = u_name;
		this.u_password = u_password;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_gonghao=" + u_gonghao + ", u_bmid=" + u_bmid + ", u_name=" + u_name
				+ ", u_password=" + u_password + "]";
	}
	
}

