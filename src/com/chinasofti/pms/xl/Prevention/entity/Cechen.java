/**
 * Cechen.java
 * com.chinasofti.pms.xl.Prevention.entity
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��28�� 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.entity;
/**
 * ClassName:Cechen
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��28��		����5:34:48
 *
 * @see 	 
 *  
 */
public class Cechen {
	private Integer id;			//���
	private String didian;		//�ص�
	private String duiming;		//����
	private String meiyanbie;	//ú�ұ�
	private String yuczy;		//�⳾ʱ�������
	private String fangccs;		//������ʩ
	private String caiyang;		//����
	private String cyll;		//�������
	private String hxxfcnd;		//�����Է۳�Ũ��
	private String zfcnd;		//�ܷ۳�Ũ��
	private String zhuangtai;	//���״̬	
	public Cechen() {
		super();
	}
	
	public Cechen(String didian, String duiming, String meiyanbie, String yuczy, String fangccs, String caiyang,
			String cyll, String hxxfcnd, String zfcnd, String zhuangtai) {
		super();
		this.didian = didian;
		this.duiming = duiming;
		this.meiyanbie = meiyanbie;
		this.yuczy = yuczy;
		this.fangccs = fangccs;
		this.caiyang = caiyang;
		this.cyll = cyll;
		this.hxxfcnd = hxxfcnd;
		this.zfcnd = zfcnd;
		this.zhuangtai = zhuangtai;
	}
	

	public Cechen(Integer id, String didian, String duiming, String meiyanbie, String yuczy, String fangccs,
			String caiyang, String cyll, String hxxfcnd, String zfcnd, String zhuangtai) {
		super();
		this.id = id;
		this.didian = didian;
		this.duiming = duiming;
		this.meiyanbie = meiyanbie;
		this.yuczy = yuczy;
		this.fangccs = fangccs;
		this.caiyang = caiyang;
		this.cyll = cyll;
		this.hxxfcnd = hxxfcnd;
		this.zfcnd = zfcnd;
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
	public String getDuiming() {
		return duiming;
	}
	public void setDuiming(String duiming) {
		this.duiming = duiming;
	}
	public String getMeiyanbie() {
		return meiyanbie;
	}
	public void setMeiyanbie(String meiyanbie) {
		this.meiyanbie = meiyanbie;
	}
	public String getYuczy() {
		return yuczy;
	}
	public void setYuczy(String yuczy) {
		this.yuczy = yuczy;
	}
	public String getFangccs() {
		return fangccs;
	}
	public void setFangccs(String fangccs) {
		this.fangccs = fangccs;
	}
	public String getCaiyang() {
		return caiyang;
	}
	public void setCaiyang(String caiyang) {
		this.caiyang = caiyang;
	}
	public String getCyll() {
		return cyll;
	}
	public void setCyll(String cyll) {
		this.cyll = cyll;
	}
	public String getHxxfcnd() {
		return hxxfcnd;
	}
	public void setHxxfcnd(String hxxfcnd) {
		this.hxxfcnd = hxxfcnd;
	}
	public String getZfcnd() {
		return zfcnd;
	}
	public void setZfcnd(String zfcnd) {
		this.zfcnd = zfcnd;
	}
	
	public String getZhuangtai() {
		return zhuangtai;
	}

	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	@Override
	public String toString() {
		return "Cechen [id=" + id + ", didian=" + didian + ", duiming=" + duiming + ", meiyanbie=" + meiyanbie
				+ ", yuczy=" + yuczy + ", fangccs=" + fangccs + ", caiyang=" + caiyang + ", cyll=" + cyll + ", hxxfcnd="
				+ hxxfcnd + ", zfcnd=" + zfcnd + ", zhuangtai=" + zhuangtai + "]";
	}

	
	
}

