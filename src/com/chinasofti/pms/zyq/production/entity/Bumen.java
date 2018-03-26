/**
 * Bumen.java
 * com.chinasofti.pms.zyq.production.entity
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月7日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.entity;
/**
 * ClassName:Bumen
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月7日		上午10:23:33
 *
 * @see 	 
 *  
 */
public class Bumen {
	private Integer bm_id;
	private String  bm_name;
	private String bm_qx;
	public Integer getBm_id() {
		return bm_id;
	}
	public void setBm_id(Integer bm_id) {
		this.bm_id = bm_id;
	}
	public String getBm_name() {
		return bm_name;
	}
	public void setBm_name(String bm_name) {
		this.bm_name = bm_name;
	}
	public String getBm_qx() {
		return bm_qx;
	}
	public void setBm_qx(String bm_qx) {
		this.bm_qx = bm_qx;
	}
	public Bumen(Integer bm_id, String bm_name, String bm_qx) {
		super();
		this.bm_id = bm_id;
		this.bm_name = bm_name;
		this.bm_qx = bm_qx;
	}
	public Bumen(String bm_name, String bm_qx) {
		super();
		this.bm_name = bm_name;
		this.bm_qx = bm_qx;
	}
	public Bumen() {
		super();
	}
	@Override
	public String toString() {
		return "Bumen [bm_id=" + bm_id + ", bm_name=" + bm_name + ", bm_qx=" + bm_qx + "]";
	}
	
}

