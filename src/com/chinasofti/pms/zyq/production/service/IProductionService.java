/**
 * IProductionService.java
 * com.chinasofti.pms.zyq.production.service
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��23�� 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.service;


import java.util.List;

import com.chinasofti.pms.zyq.production.entity.MainPlan;
import com.chinasofti.pms.zyq.production.entity.Mine;
import com.chinasofti.pms.zyq.production.entity.MineOutPut;
import com.chinasofti.pms.zyq.production.entity.Order;

/**
 * ClassName:IProductionService
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��23��		����3:06:43
 *
 * @see 	 
 *  
 */
public interface IProductionService {
	public boolean addMine(Mine mine); //��ӿ�����Ϣ
	public List<Mine> showMine();//��ѯ���п�����Ϣ
	public List<Order> showOrder();//��ѯ���ж�����Ϣ
	public boolean addOrder(Order order);//��Ӷ�����Ϣ
	public Order showOrderByid(Integer id);//ͨ��id��ѯ������Ϣ
	public Mine showMineByid(Integer id);//ͨ��id��ѯ������Ϣ
	public boolean addMainPlan(MainPlan mainplan);//����������ƻ�
	public List<MainPlan> showMainPlanById(Integer id);//ͨ��id��ѯ�������ƻ�
	public List<MainPlan> showMainPlanAll();//��ѯ���е��������ƻ�
	public boolean updateAuditstatus(Integer id);//ͨ��id�޸������ƻ����״̬
	public boolean updateOrderstate(Integer id);//ͨ��id�޸Ķ�������״̬
	public List<Order> showOrderBycompany(String company);//���ݹ�˾���鵽�ÿͻ��Ķ�����Ϣ
	public String showContratcoterByid(Integer id);//����id��ѯ��ͬ��
	public boolean updateOrderOrderstate(String contratcoter);//ͨ����ͬ���޸Ķ���״̬
	public boolean updateOrderXiadanumber(Order order);//�޸��´�ƻ�������
	public Order showOrderByContratcoter(String contratcoter);//���ݺ�ͬ�Ų鵽������Ϣ
	public boolean updateOrderOrderstate(Order order);//�޸Ķ���״̬
	public boolean updateOrderOrderstateByXiadanumber(Order order);//�������´�ƻ������޸Ķ���״̬
	public int showMineCount();//��ѯú������
	public Double showMineOutputCount();//����ú����������
	public Order showOrderEnddate();//��ѯ��ֹ����
	public boolean updateOrderOrderstatesetxiada(Order order);//�޸Ķ���״̬���´�
	public boolean updateOrderstateByNot(Integer id);//�����������޸�״̬
	public boolean updateOrderOrderstateByXiadanumberByNot(Order order);
	public boolean updateOrderOrderstateByNot(String contratcoter);
	public Double showMineOutputCountByMineId(Integer id);
	public String showOrderEnddateByMineId(Integer id);//��ѯ����ֹ����
	public String showOrderBegindateByMineId(Integer id);//��ѯ����ʼ����
	public boolean updateOrderstateByid(Integer id);
}