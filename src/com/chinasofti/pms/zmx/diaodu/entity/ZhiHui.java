package com.chinasofti.pms.zmx.diaodu.entity;

public class ZhiHui {
	private Integer id;
	private String gangwei;
	private String name;
	private String zhiwu;
	private String dianhua;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGangwei() {
		return gangwei;
	}
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZhiwu() {
		return zhiwu;
	}
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	public String getDianhua() {
		return dianhua;
	}
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	public ZhiHui() {
		super();
	}
	public ZhiHui(String gangwei, String name, String zhiwu, String dianhua) {
		super();
		this.gangwei = gangwei;
		this.name = name;
		this.zhiwu = zhiwu;
		this.dianhua = dianhua;
	}
	public ZhiHui(Integer id, String gangwei, String name, String zhiwu, String dianhua) {
		super();
		this.id = id;
		this.gangwei = gangwei;
		this.name = name;
		this.zhiwu = zhiwu;
		this.dianhua = dianhua;
	}
	@Override
	public String toString() {
		return "ZhiHui [id=" + id + ", gangwei=" + gangwei + ", name=" + name + ", zhiwu=" + zhiwu + ", dianhua="
				+ dianhua + "]";
	}
	
	
}
