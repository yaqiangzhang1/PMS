package com.chinasofti.pms.xdd.train.entity;

public class Tplan {
	private Integer id;
	private String trainabstract;
	private String content;
	private String personincharge;
	private String releasetime;
	private String pkhjd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTrainabstract() {
		return trainabstract;
	}
	public void setTrainabstract(String trainabstract) {
		this.trainabstract = trainabstract;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPersonincharge() {
		return personincharge;
	}
	public void setPersonincharge(String personincharge) {
		this.personincharge = personincharge;
	}
	public String getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(String releasetime) {
		this.releasetime = releasetime;
	}
	public String getPkhjd() {
		return pkhjd;
	}
	public void setPkhjd(String pkhjd) {
		this.pkhjd = pkhjd;
	}
	@Override
	public String toString() {
		return "Tplan [id=" + id + ", trainabstract=" + trainabstract + ", content=" + content + ", personincharge="
				+ personincharge + ", releasetime=" + releasetime + ", pkhjd=" + pkhjd + "]";
	}
	public Tplan(String trainabstract, String content, String personincharge, String releasetime, String pkhjd) {
		super();
		this.trainabstract = trainabstract;
		this.content = content;
		this.personincharge = personincharge;
		this.releasetime = releasetime;
		this.pkhjd = pkhjd;
	}
	public Tplan(Integer id, String trainabstract, String content, String personincharge, String releasetime,
			String pkhjd) {
		super();
		this.id = id;
		this.trainabstract = trainabstract;
		this.content = content;
		this.personincharge = personincharge;
		this.releasetime = releasetime;
		this.pkhjd = pkhjd;
	}
	public Tplan() {
		super();
	}
	
}
