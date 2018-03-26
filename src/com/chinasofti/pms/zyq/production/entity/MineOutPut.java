/**
 * MineOutPut.java
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
 * ClassName:MineOutPut
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		上午9:38:55
 *
 * @see 	 
 *  
 */
public class MineOutPut {
	private Integer id;
	private String output;
	private int countmine;
	private String jiezhidate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public int getCountmine() {
		return countmine;
	}
	public void setCountmine(int countmine) {
		this.countmine = countmine;
	}
	public String getJiezhidate() {
		return jiezhidate;
	}
	public void setJiezhidate(String jiezhidate) {
		this.jiezhidate = jiezhidate;
	}
	public MineOutPut(String output, int countmine, String jiezhidate) {
		super();
		this.output = output;
		this.countmine = countmine;
		this.jiezhidate = jiezhidate;
	}
	public MineOutPut() {
		super();
	}
	public MineOutPut(Integer id, String output, int countmine, String jiezhidate) {
		super();
		this.id = id;
		this.output = output;
		this.countmine = countmine;
		this.jiezhidate = jiezhidate;
	}
	@Override
	public String toString() {
		return "MineOutPut [id=" + id + ", output=" + output + ", countmine=" + countmine + ", jiezhidate=" + jiezhidate
				+ "]";
	}
	
}

