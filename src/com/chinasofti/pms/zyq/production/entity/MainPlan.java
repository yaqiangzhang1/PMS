/**
 * MainPlan.java
 * com.chinasofti.pms.zyq.production.entity
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��29�� 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.entity;
/**
 * ClassName:MainPlan
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��29��		����2:39:51
 *
 * @see 	 
 *  
 */
public class MainPlan {
	private Integer id;//id
	private Integer mine_id;//�������
	private String mine_name;//��������
	private String order_id;//��������
	private String begindate;//��ʼʱ��
	private String enddate;//����ʱ��
	private String xiadadate;//�´�ʱ��
	private String coalspecies;//ú����
	private String number;//��������
	private String auditstatus;//���״̬
	private String orderstate;//����״̬
	private String singleperson;//�Ƶ���
	private String approver;//������
	private String contratcoter;//��ͬ���
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
	public String getXiadadate() {
		return xiadadate;
	}
	public void setXiadadate(String xiadadate) {
		this.xiadadate = xiadadate;
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
	public String getSingleperson() {
		return singleperson;
	}
	public void setSingleperson(String singleperson) {
		this.singleperson = singleperson;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getContratcoter() {
		return contratcoter;
	}
	public void setContratcoter(String contratcoter) {
		this.contratcoter = contratcoter;
	}
	public MainPlan(Integer id, Integer mine_id, String mine_name, String order_id, String begindate, String enddate,
			String xiadadate, String coalspecies, String number, String auditstatus, String orderstate,
			String singleperson, String approver, String contratcoter) {
		super();
		this.id = id;
		this.mine_id = mine_id;
		this.mine_name = mine_name;
		this.order_id = order_id;
		this.begindate = begindate;
		this.enddate = enddate;
		this.xiadadate = xiadadate;
		this.coalspecies = coalspecies;
		this.number = number;
		this.auditstatus = auditstatus;
		this.orderstate = orderstate;
		this.singleperson = singleperson;
		this.approver = approver;
		this.contratcoter = contratcoter;
	}
	public MainPlan(Integer mine_id, String mine_name, String order_id, String begindate, String enddate,
			String xiadadate, String coalspecies, String number, String auditstatus, String orderstate,
			String singleperson, String approver, String contratcoter) {
		super();
		this.mine_id = mine_id;
		this.mine_name = mine_name;
		this.order_id = order_id;
		this.begindate = begindate;
		this.enddate = enddate;
		this.xiadadate = xiadadate;
		this.coalspecies = coalspecies;
		this.number = number;
		this.auditstatus = auditstatus;
		this.orderstate = orderstate;
		this.singleperson = singleperson;
		this.approver = approver;
		this.contratcoter = contratcoter;
	}
	public MainPlan() {
		super();
	}
	@Override
	public String toString() {
		return "MainPlan [id=" + id + ", mine_id=" + mine_id + ", mine_name=" + mine_name + ", order_id=" + order_id
				+ ", begindate=" + begindate + ", enddate=" + enddate + ", xiadadate=" + xiadadate + ", coalspecies="
				+ coalspecies + ", number=" + number + ", auditstatus=" + auditstatus + ", orderstate=" + orderstate
				+ ", singleperson=" + singleperson + ", approver=" + approver + ", contratcoter=" + contratcoter + "]";
	}
	
}

