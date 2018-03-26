package com.chinasofti.pms.xdd.train.entity;

public class Zhengshu {
	private Integer zid;
	private String name;
	private Integer age;
	private String sex;
	private String zhiwei;
	private String zhenshu;
	private String cztime;
	public int getZid() {
		return zid;
	}
	public void setZid(int zid) {
		this.zid = zid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getZhiwei() {
		return zhiwei;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	public String getZhenshu() {
		return zhenshu;
	}
	public void setZhenshu(String zhenshu) {
		this.zhenshu = zhenshu;
	}
	public String getCztime() {
		return cztime;
	}
	public void setCztime(String cztime) {
		this.cztime = cztime;
	}
	public Zhengshu(String name, int age, String sex, String zhiwei, String zhenshu, String cztime) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.zhiwei = zhiwei;
		this.zhenshu = zhenshu;
		this.cztime = cztime;
	}
	public Zhengshu(int zid, String name, int age, String sex, String zhiwei, String zhenshu, String cztime) {
		super();
		this.zid = zid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.zhiwei = zhiwei;
		this.zhenshu = zhenshu;
		this.cztime = cztime;
	}
	@Override
	public String toString() {
		return "Zhengsu [zid=" + zid + ", name=" + name + ", age=" + age + ", sex=" + sex + ", zhiwei=" + zhiwei
				+ ", zhenshu=" + zhenshu + ", cztime=" + cztime + "]";
	}
	public Zhengshu() {
		super();
	}
	
}
