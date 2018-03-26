/**
 * Tongfeng.java
 * com.chinasofti.pms.xl.Prevention.entity
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��26�� 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.entity;
/**
 * ClassName:Tongfeng
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��26��		����10:23:03
 *
 * @see 	 
 *  
 */
public class Tongfeng {
	private Integer id;    			//���
	private String didian;			//�ص�
	private String biansu;			//����
	private String fengsu;			//����
	private String fengliang;		//����
	private String jiawan;			//����Ũ��
	private String eryanghuatan;	//������̼Ũ��
	private String wendu;			//�¶�
	private String shijian;			//���ʱ��
	private String zhuangtai;		//���״̬
	public Tongfeng() {
		super();
	}
	
	
	public Tongfeng(Integer id, String didian, String biansu, String fengsu, String fengliang, String jiawan,
			String eryanghuatan, String wendu, String shijian, String zhuangtai) {
		super();
		this.id = id;
		this.didian = didian;
		this.biansu = biansu;
		this.fengsu = fengsu;
		this.fengliang = fengliang;
		this.jiawan = jiawan;
		this.eryanghuatan = eryanghuatan;
		this.wendu = wendu;
		this.shijian = shijian;
		this.zhuangtai = zhuangtai;
	}


	public Tongfeng(String didian, String biansu, String fengsu, String fengliang, String jiawan, String eryanghuatan,
			String wendu, String shijian, String zhuangtai) {
		super();
		this.didian = didian;
		this.biansu = biansu;
		this.fengsu = fengsu;
		this.fengliang = fengliang;
		this.jiawan = jiawan;
		this.eryanghuatan = eryanghuatan;
		this.wendu = wendu;
		this.shijian = shijian;
		this.zhuangtai = zhuangtai;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDidian() {
		return didian;
	}
	public void setDidian(String didian) {
		this.didian = didian;
	}
	public String getBiansu() {
		return biansu;
	}
	public void setBiansu(String biansu) {
		this.biansu = biansu;
	}
	public String getFengsu() {
		return fengsu;
	}
	public void setFengsu(String fengsu) {
		this.fengsu = fengsu;
	}
	public String getFengliang() {
		return fengliang;
	}
	public void setFengliang(String fengliang) {
		this.fengliang = fengliang;
	}
	public String getJiawan() {
		return jiawan;
	}
	public void setJiawan(String jiawan) {
		this.jiawan = jiawan;
	}
	public String getEryanghuatan() {
		return eryanghuatan;
	}
	public void setEryanghuatan(String eryanghuatan) {
		this.eryanghuatan = eryanghuatan;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}


	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}


	@Override
	public String toString() {
		return "Cefeng [id=" + id + ", didian=" + didian + ", biansu=" + biansu + ", fengsu=" + fengsu + ", fengliang="
				+ fengliang + ", jiawan=" + jiawan + ", eryanghuatan=" + eryanghuatan + ", wendu=" + wendu
				+ ", shijian=" + shijian + ", zhuangtai=" + zhuangtai + "]";
	}
	
}
