package com.chinasofti.pms.zmx.diaodu.entity;

public class Shigu {
	private Integer id;
	private String sgname;		//�¹�����
	private String kstime;		//��ʼʱ��
	private String cxtime;		//����ʱ��
	private String address;		//�¹ʵص�
	private String qdtime;		//Ԥ������ʱ��
	private String jytime;		//��Ԯʱ��
	private Integer death;		//����
	private Integer injured;	//����
	private Integer shilian;	//ʧ��
	private String jieguo;		//���
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSgname() {
		return sgname;
	}
	public void setSgname(String sgname) {
		this.sgname = sgname;
	}
	public String getKstime() {
		return kstime;
	}
	public void setKstime(String kstime) {
		this.kstime = kstime;
	}
	public String getCxtime() {
		return cxtime;
	}
	public void setCxtime(String cxtime) {
		this.cxtime = cxtime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQdtime() {
		return qdtime;
	}
	public void setQdtime(String qdtime) {
		this.qdtime = qdtime;
	}
	public String getJytime() {
		return jytime;
	}
	public void setJytime(String jytime) {
		this.jytime = jytime;
	}
	public Integer getDeath() {
		return death;
	}
	public void setDeath(Integer death) {
		this.death = death;
	}
	public Integer getInjured() {
		return injured;
	}
	public void setInjured(Integer injured) {
		this.injured = injured;
	}
	public Integer getShilian() {
		return shilian;
	}
	public void setShilian(Integer shilian) {
		this.shilian = shilian;
	}
	public String getJieguo() {
		return jieguo;
	}
	public void setJieguo(String jieguo) {
		this.jieguo = jieguo;
	}
	public Shigu() {
		super();
	}
	public Shigu(String sgname, String kstime, String cxtime, String address, String qdtime, String jytime,
			Integer death, Integer injured, Integer shilian, String jieguo) {
		super();
		this.sgname = sgname;
		this.kstime = kstime;
		this.cxtime = cxtime;
		this.address = address;
		this.qdtime = qdtime;
		this.jytime = jytime;
		this.death = death;
		this.injured = injured;
		this.shilian = shilian;
		this.jieguo = jieguo;
	}
	public Shigu(Integer id, String sgname, String kstime, String cxtime, String address, String qdtime, String jytime,
			Integer death, Integer injured, Integer shilian, String jieguo) {
		super();
		this.id = id;
		this.sgname = sgname;
		this.kstime = kstime;
		this.cxtime = cxtime;
		this.address = address;
		this.qdtime = qdtime;
		this.jytime = jytime;
		this.death = death;
		this.injured = injured;
		this.shilian = shilian;
		this.jieguo = jieguo;
	}
	@Override
	public String toString() {
		return "Shigu [id=" + id + ", sgname=" + sgname + ", kstime=" + kstime + ", cxtime=" + cxtime + ", address="
				+ address + ", qdtime=" + qdtime + ", jytime=" + jytime + ", death=" + death + ", injured=" + injured
				+ ", shilian=" + shilian + ", jieguo=" + jieguo + "]";
	}

	
}