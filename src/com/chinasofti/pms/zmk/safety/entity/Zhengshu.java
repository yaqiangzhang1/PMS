package com.chinasofti.pms.zmk.safety.entity;

public class Zhengshu {

	private Integer zsid;
	private String neirong;
	public Integer getZsid() {
		return zsid;
	}
	public void setZsid(Integer zsid) {
		this.zsid = zsid;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public Zhengshu(Integer zsid, String neirong) {
		super();
		this.zsid = zsid;
		this.neirong = neirong;
	}
	public Zhengshu(String neirong) {
		super();
		this.neirong = neirong;
	}
	public Zhengshu() {
		super();
	}
	@Override
	public String toString() {
		return "Zhengshu [zsid=" + zsid + ", neirong=" + neirong + "]";
	}
	
	
	

}
