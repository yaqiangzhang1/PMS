package com.chinasofti.pms.zmx.diaodu.entity;

public class YuAn {
	private Integer id;
	private String name;
	private String dengji;
	private String yuan;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDengji() {
		return dengji;
	}
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	public String getYuan() {
		return yuan;
	}
	public void setYuan(String yuan) {
		this.yuan = yuan;
	}
	public YuAn() {
		super();
	}
	public YuAn(String name, String dengji, String yuan) {
		super();
		this.name = name;
		this.dengji = dengji;
		this.yuan = yuan;
	}
	public YuAn(Integer id, String name, String dengji, String yuan) {
		super();
		this.id = id;
		this.name = name;
		this.dengji = dengji;
		this.yuan = yuan;
	}
	@Override
	public String toString() {
		return "YuAn [id=" + id + ", name=" + name + ", dengji=" + dengji + ", yuan=" + yuan + "]";
	}
	
}
