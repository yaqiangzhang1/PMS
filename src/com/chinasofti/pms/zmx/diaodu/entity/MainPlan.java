package com.chinasofti.pms.zmx.diaodu.entity;

public class MainPlan {
	private Integer id;//id
	private Integer mine_id;//矿区编号
	private String mine_name;//矿区名称
	private String order_id;//生产单号
	private String begindate;//开始时间
	private String enddate;//结束时间
	private String coalspecies;//煤种类
	private String number;//生产数量
	private String auditstatus;//审核状态
	private String orderstate;//生产状态
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMine_id() {
		return mine_id;
	}
	public void setMine_id(Integer mine_id) {
		this.mine_id = mine_id;
	}
	public String getMine_name() {
		return mine_name;
	}
	public void setMine_name(String mine_name) {
		this.mine_name = mine_name;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getBegindate() {
		return begindate;
	}
	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getCoalspecies() {
		return coalspecies;
	}
	public void setCoalspecies(String coalspecies) {
		this.coalspecies = coalspecies;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAuditstatus() {
		return auditstatus;
	}
	public void setAuditstatus(String auditstatus) {
		this.auditstatus = auditstatus;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public MainPlan(Integer id, Integer mine_id, String mine_name, String order_id, String begindate, String enddate,
			String coalspecies, String number, String auditstatus, String orderstate) {
		super();
		this.id = id;
		this.mine_id = mine_id;
		this.mine_name = mine_name;
		this.order_id = order_id;
		this.begindate = begindate;
		this.enddate = enddate;
		this.coalspecies = coalspecies;
		this.number = number;
		this.auditstatus = auditstatus;
		this.orderstate = orderstate;
	}
	public MainPlan(Integer mine_id, String mine_name, String order_id, String begindate, String enddate,
			String coalspecies, String number, String auditstatus, String orderstate) {
		super();
		this.mine_id = mine_id;
		this.mine_name = mine_name;
		this.order_id = order_id;
		this.begindate = begindate;
		this.enddate = enddate;
		this.coalspecies = coalspecies;
		this.number = number;
		this.auditstatus = auditstatus;
		this.orderstate = orderstate;
	}
	public MainPlan() {
		super();
	}
	@Override
	public String toString() {
		return "MainPlan [id=" + id + ", mine_id=" + mine_id + ", mine_name=" + mine_name + ", order_id=" + order_id
				+ ", begindate=" + begindate + ", enddate=" + enddate + ", coalspecies=" + coalspecies + ", number="
				+ number + ", auditstatus=" + auditstatus + ", orderstate=" + orderstate + "]";
	}
	
}
