package com.chinasofti.pms.zmx.diaodu.entity;

public class Output {
	private Integer id;
	private String name;
	private String mine_name;
	private String day;
	private Double rshiji;
	private Double rplan;
	private Double rchaokui;
	private String beizhu;
	private String month;
	private Double mshiji;
	private Double mplan;
	private Double mchaokui;
	private String year;
	private Double yshiji;
	private Double yplan;
	private Double ychaokui;
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
	public String getMine_name() {
		return mine_name;
	}
	public void setMine_name(String mine_name) {
		this.mine_name = mine_name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Double getRshiji() {
		return rshiji;
	}
	public void setRshiji(Double rshiji) {
		this.rshiji = rshiji;
	}
	public Double getRplan() {
		return rplan;
	}
	public void setRplan(Double rplan) {
		this.rplan = rplan;
	}
	public Double getRchaokui() {
		return rchaokui;
	}
	public void setRchaokui(Double rchaokui) {
		this.rchaokui = rchaokui;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Double getMshiji() {
		return mshiji;
	}
	public void setMshiji(Double mshiji) {
		this.mshiji = mshiji;
	}
	public Double getMplan() {
		return mplan;
	}
	public void setMplan(Double mplan) {
		this.mplan = mplan;
	}
	public Double getMchaokui() {
		return mchaokui;
	}
	public void setMchaokui(Double mchaokui) {
		this.mchaokui = mchaokui;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Double getYshiji() {
		return yshiji;
	}
	public void setYshiji(Double yshiji) {
		this.yshiji = yshiji;
	}
	public Double getYplan() {
		return yplan;
	}
	public void setYplan(Double yplan) {
		this.yplan = yplan;
	}
	public Double getYchaokui() {
		return ychaokui;
	}
	public void setYchaokui(Double ychaokui) {
		this.ychaokui = ychaokui;
	}
	public Output() {
		super();
	}
	public Output(String name, String mine_name, String day, Double rshiji, Double rplan, Double rchaokui,
			String beizhu, String month, Double mshiji, Double mplan, Double mchaokui, String year, Double yshiji,
			Double yplan, Double ychaokui) {
		super();
		this.name = name;
		this.mine_name = mine_name;
		this.day = day;
		this.rshiji = rshiji;
		this.rplan = rplan;
		this.rchaokui = rchaokui;
		this.beizhu = beizhu;
		this.month = month;
		this.mshiji = mshiji;
		this.mplan = mplan;
		this.mchaokui = mchaokui;
		this.year = year;
		this.yshiji = yshiji;
		this.yplan = yplan;
		this.ychaokui = ychaokui;
	}
	public Output(Integer id, String name, String mine_name, String day, Double rshiji, Double rplan, Double rchaokui,
			String beizhu, String month, Double mshiji, Double mplan, Double mchaokui, String year, Double yshiji,
			Double yplan, Double ychaokui) {
		super();
		this.id = id;
		this.name = name;
		this.mine_name = mine_name;
		this.day = day;
		this.rshiji = rshiji;
		this.rplan = rplan;
		this.rchaokui = rchaokui;
		this.beizhu = beizhu;
		this.month = month;
		this.mshiji = mshiji;
		this.mplan = mplan;
		this.mchaokui = mchaokui;
		this.year = year;
		this.yshiji = yshiji;
		this.yplan = yplan;
		this.ychaokui = ychaokui;
	}
	
	public Output(Integer id, String name, String mine_name, Double rplan, Double mplan, Double yplan) {
		super();
		this.id = id;
		this.name = name;
		this.mine_name = mine_name;
		this.rplan = rplan;
		this.mplan = mplan;
		this.yplan = yplan;
	}
	@Override
	public String toString() {
		return "Output [id=" + id + ", name=" + name + ", mine_name=" + mine_name + ", day=" + day + ", rshiji="
				+ rshiji + ", rplan=" + rplan + ", rchaokui=" + rchaokui + ", beizhu=" + beizhu + ", month=" + month
				+ ", mshiji=" + mshiji + ", mplan=" + mplan + ", mchaokui=" + mchaokui + ", year=" + year + ", yshiji="
				+ yshiji + ", yplan=" + yplan + ", ychaokui=" + ychaokui + "]";
	}
	
}
