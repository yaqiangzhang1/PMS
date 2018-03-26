package com.chinasofti.pms.zmk.safety.entity;

public class Yinhuan {

	private Integer id;
	private String yinhuantype;
	private String yinhuandengji;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getYinhuantype() {
		return yinhuantype;
	}
	public void setYinhuantype(String yinhuantype) {
		this.yinhuantype = yinhuantype;
	}
	public String getYinhuandengji() {
		return yinhuandengji;
	}
	public void setYinhuandengji(String yinhuandengji) {
		this.yinhuandengji = yinhuandengji;
	}
	public Yinhuan(Integer id, String yinhuantype, String yinhuandengji) {
		super();
		this.id = id;
		this.yinhuantype = yinhuantype;
		this.yinhuandengji = yinhuandengji;
	}
	public Yinhuan(String yinhuantype, String yinhuandengji) {
		super();
		this.yinhuantype = yinhuantype;
		this.yinhuandengji = yinhuandengji;
	}
	public Yinhuan() {
		super();
	}
	@Override
	public String toString() {
		return "yinhuangl [id=" + id + ", yinhuantype=" + yinhuantype + ", yinhuandengji=" + yinhuandengji + "]";
	}
	
	

}
