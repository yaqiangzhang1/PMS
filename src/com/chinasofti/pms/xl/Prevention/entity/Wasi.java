/**
 * Wasi.java
 * com.chinasofti.pms.xl.Prevention.entity
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��30�� 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.entity;
/**
 * ClassName:Wasi
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��30��		����3:13:45
 *
 * @see 	 
 *  
 */
public class Wasi {
	private Integer id;				//���
	private String didian;			//�ص�
	private String chuangan;		//������
	private String banxie;			//��Я��
	private String guangan;			//�������
	private String eryanghuatan;	//������̼Ũ��
	private String wendu;			//�¶�
	private String shijian;			//ʱ��
	private String zhuangtai;		//���״̬
	
	public Wasi() {
		super();
	}
	

	public Wasi(Integer id, String didian, String chuangan, String banxie, String guangan, String eryanghuatan,
			String wendu, String shijian, String zhuangtai) {
		super();
		this.id = id;
		this.didian = didian;
		this.chuangan = chuangan;
		this.banxie = banxie;
		this.guangan = guangan;
		this.eryanghuatan = eryanghuatan;
		this.wendu = wendu;
		this.shijian = shijian;
		this.zhuangtai = zhuangtai;
	}



	public Wasi(String didian, String chuangan, String banxie, String guangan, String eryanghuatan, String wendu,
			String shijian, String zhuangtai) {
		super();
		this.didian = didian;
		this.chuangan = chuangan;
		this.banxie = banxie;
		this.guangan = guangan;
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
	public String getChuangan() {
		return chuangan;
	}
	public void setChuangan(String chuangan) {
		this.chuangan = chuangan;
	}
	public String getBanxie() {
		return banxie;
	}
	public void setBanxie(String banxie) {
		this.banxie = banxie;
	}
	public String getGuangan() {
		return guangan;
	}
	public void setGuangan(String guangan) {
		this.guangan = guangan;
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
		return "Wasi [id=" + id + ", didian=" + didian + ", chuangan=" + chuangan + ", banxie=" + banxie + ", guangan="
				+ guangan + ", eryanghuatan=" + eryanghuatan + ", wendu=" + wendu + ", shijian=" + shijian
				+ ", zhuangtai=" + zhuangtai + "]";
	}

	
}

