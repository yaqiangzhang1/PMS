/**
 * Handlers.java
 * com.chinasofti.ssm.user.handlers
 *
 * Function�� TODO 
 *
 *   ver     date      		author
 * ��������������������������������������������������������������������
 *   		 2018��1��16�� 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.handlers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.chinasofti.pms.zyq.production.entity.MainPlan;
import com.chinasofti.pms.zyq.production.entity.Mine;
import com.chinasofti.pms.zyq.production.entity.MineOutPut;
import com.chinasofti.pms.zyq.production.entity.Order;
import com.chinasofti.pms.zyq.production.service.IProductionService;
import com.chinasofti.pms.zyq.production.service.impl.ProductionServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ClassName:Handlers
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��16��		����6:19:49
 *
 * @see 	 
 *  
 */
//���Ʋ�
@Controller
public class Handlers {
	//�Զ�����ʵ��������
	@Autowired
	IProductionService iproductionService;
	//���سɹ��ľ�̬����
	public static String SUCCESS = "success";
	//����ʧ�ܵľ�̬����
	public static String FAIL = "fail";
	//�����µ���������ʱ�ı���û����ϢĬ��Ϊ0;����ϢʱΪ1;
	int num = 0;
	//�����µ���������ʱ�ı���û����ϢĬ��Ϊ0;����ϢʱΪ1;�����ظ�ǰ̨ҳ��
	int m = 0;
	//�����µ�ú����Ϣ
	@RequestMapping("/addMine")
	public String addMine(HttpServletRequest req) throws UnsupportedEncodingException{
		//���յ�ǰ̨������ú����Ϣ���󲢵���Service�����ӷ�������ӳɹ�����true;���򷵻�false;
		Integer bh =Integer.parseInt(req.getParameter("bh")) ;
		String mineName1 = req.getParameter("name");
		String mineName = new String(mineName1.getBytes("iso-8859-1"),"utf-8");
		String output = Integer.parseInt(req.getParameter("gross"))/10+"";
		boolean addMine = iproductionService.addMine(new Mine(bh,mineName,output,0+""));
		//�����ӳɹ�
		if(addMine){
			//���ص��ɹ�ҳ��
			return "order";
		}else{
			//����ʧ��ҳ��
			return FAIL;
		}
		
	}
	//��ѯú����Ϣ
	@RequestMapping("/showMine")
	public String showMine(HttpServletRequest req){
		//����Service��Ĳ�ѯ�������������е�ú����Ϣ����
		List<Mine> showMine = iproductionService.showMine();
		//�ѷ��صĽ�����ŵ�request������
		req.setAttribute("showMine", showMine);
		//����order.jspҳ��
		return "order";
	}
	//�������ƻ�  ������������id
	@RequestMapping(value="/mainplan/{id}")
	public String mainplan(@PathVariable Integer id,HttpServletRequest req){
		//ͨ����������id����ö�������Ϣ
	
		Order showOrderByid = iproductionService.showOrderByid(id);
		
		if(showOrderByid.getOrderstate().equals("������")||showOrderByid.getOrderstate().equals("ȫ���´�")){
			return "forward:showorder";
		}
		double shengyunumber = showOrderByid.getCoalnumber() - showOrderByid.getXiadanumber();
		if(showOrderByid.getCoalnumber() - showOrderByid.getXiadanumber()<=0){
			shengyunumber = 0;
		}
		//�ѷ��صĽ�����ŵ�request������
		req.setAttribute("showOrderByid", showOrderByid);
		//����Service��Ĳ�ѯ�������������е�ú����Ϣ����
		List<Mine> showMine = iproductionService.showMine();
		//�ѷ��صĽ�����ŵ�request������
		req.setAttribute("showMine", showMine);
		req.setAttribute("shengyunumber", shengyunumber);
		//���ر����������ƻ�ҳ��mainplan.jsp
		return "mainplan";
	}
	//�����¶�����Ϣ
	@ResponseBody
	@RequestMapping(value="/addorder")
	public JSONPObject addorder(Order order,HttpServletRequest req,String callbackparam) throws UnsupportedEncodingException{
		//��ʽ��ʱ���ʽ
		order.setCompany(new String(order.getCompany().getBytes("iso-8859-1"),"utf-8"));
		order.setCoalspecies(new String(order.getCoalspecies().getBytes("iso-8859-1"),"utf-8"));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		//��¼���ܶ�����ʱ��
		String format = simpleDateFormat.format(new Date());
		//����ʱ����������������
		order.setOrderid("SCDD"+format);
		//����ö���������״̬
		order.setOrderstate("δ�´�ƻ�");
		//�Ѹö�����Ϣ���뵽���ݿ��У�����Service�����Ӷ����ķ�����������ӳɹ�����true�����򷵻�false
		boolean addOrder = iproductionService.addOrder(order);
		//������ӳɹ�
		if(addOrder){
			//���¶���ʱnumΪ1
			num = 1;
			return  new JSONPObject(callbackparam,1);
		}
		//����ʧ�ܣ�����ʧ��ҳ��
		return new JSONPObject(callbackparam,0);
	}
	//ʵʱ����Ƿ����¶���
	@ResponseBody
	@RequestMapping(value="/showaddorder")
	public int test1(HttpServletRequest req){
		//Ĭ��mΪ0��ʾû���¶���
		m=0;
		//���num=1��ʾ���¶��� ��num��ֵ����m
		if(num==1){
			m=num;
		}
		//��ʼ��num��
		num=0;
	
		return m;
	}
	//��ѯ���ж���
	@RequestMapping(value="/showorder")
	public String showorder(HttpServletRequest req){
		//����Service��Ĳ�ѯ�������������������ж���
		List<Order> showOrder = iproductionService.showOrder();
		//�ѷ��صĽ��������request������
		req.setAttribute("showOrder", showOrder);
		//����order.jspҳ��
		return "order";
	}
	//ͨ������ú����Ϣ�����������ƻ�
	@RequestMapping(value="/showMainByid/{id}/{oid}")
	public String showMainByid(@PathVariable Integer id,@PathVariable Integer oid,HttpServletRequest req){
		//ͨ��ú��id��ȡú����Ϣ
		Mine showMineByid = iproductionService.showMineByid(id);
		//ͨ��������Ż�ȡ������Ϣ
		Order showOrderByid = iproductionService.showOrderByid(oid);
		//�ѷ��صĽ�������뵽request������
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		int year = Integer.parseInt(showOrderByid.getEnddate().split("-")[0])-Integer.parseInt(format.split("-")[0]);
		int mount = Integer.parseInt(showOrderByid.getEnddate().split("-")[1])-Integer.parseInt(format.split("-")[1]);
		int day = Integer.parseInt(showOrderByid.getEnddate().split("-")[2])-Integer.parseInt(format.split("-")[2]);
		int countday = year*365+mount*30+day;
		Map<Integer,Object> map = new HashMap<Integer,Object>();
		DecimalFormat df = new DecimalFormat("#.00");
		if(Integer.parseInt(showMineByid.getOutput())>365){
			map.put(showMineByid.getId(),df.format((Integer.parseInt(showMineByid.getOutput())/365+Integer.parseInt(showMineByid.getOutput())%365 )* countday) );
		}else{
			map.put(showMineByid.getId(),df.format((Integer.parseInt(showMineByid.getOutput())*10%365) *0.001* countday));
		}
		req.setAttribute("format", format);
		req.setAttribute("map", map);
		req.setAttribute("showMineByid", showMineByid);
		req.setAttribute("showOrderByid", showOrderByid);
		//����mine.jsp
		return "minexx";
	}
	
	//�����������ƻ�
	@RequestMapping(value="/plxd/{id}")
	public String plxd(@PathVariable Integer id,HttpServletRequest req){
		//ͨ��������Ż�ȡ������Ϣ
		Order showOrderByid = iproductionService.showOrderByid(id);
		//��ȡ����ú����Ϣ
		List<Mine> showMine = iproductionService.showMine();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		int year = Integer.parseInt(showOrderByid.getEnddate().split("-")[0])-Integer.parseInt(format.split("-")[0]);
		int mount = Integer.parseInt(showOrderByid.getEnddate().split("-")[1])-Integer.parseInt(format.split("-")[1]);
		int day = Integer.parseInt(showOrderByid.getEnddate().split("-")[2])-Integer.parseInt(format.split("-")[2]);
		int countday = year*365+mount*30+day;
		Map<Integer,Object> map = new HashMap<Integer,Object>();
		DecimalFormat df = new DecimalFormat("#.00");
		for(int j=0;j<showMine.size();j++){
			if(Integer.parseInt(showMine.get(j).getOutput())>365){
				map.put(showMine.get(j).getId(),df.format((Integer.parseInt(showMine.get(j).getOutput())/365+Integer.parseInt(showMine.get(j).getOutput())%365 )* countday) );
			}
			if(Integer.parseInt(showMine.get(j).getOutput())<365){
	
				map.put(showMine.get(j).getId(), df.format((Integer.parseInt(showMine.get(j).getOutput())*10%365)*0.001 * countday));
			}
			
			
		}
		//�ѷ��صĽ�������뵽request������
		req.setAttribute("showMine", showMine);
		req.setAttribute("showOrderByid", showOrderByid);
		req.setAttribute("map", map);
		req.setAttribute("format", format);
		//����plxd.jsp
		return "plxd";
	}
	//�����´����ƻ� ����Json�ַ�������
	@RequestMapping(value="/plxdzjh")
	public String plxdzjh(String mine,HttpServletRequest req){
		int count = 0;
	
		//�ѽ��յ�json�ַ�������ת����json����
		JSONArray json = JSONArray.fromObject(mine);
		
		float countnumber = 0; 
		String contratcoter = "";
		//����List����
		List<MainPlan> list = new ArrayList<MainPlan>();
		for(int j=0;j<json.size();j++){
			//��ȡ��J��json����
			Object object = json.get(j);
			//��json����ת��JSONObject
			JSONObject fromObject = JSONObject.fromObject(object);
			//��JSONObjectת����ʵ�������
			MainPlan mainplan = (MainPlan)JSONObject.toBean(fromObject,MainPlan.class);
			
			//�������״̬
			mainplan.setAuditstatus("δ���");
			//��������״̬
			mainplan.setOrderstate("δ����");
			mainplan.setSingleperson("����");
			mainplan.setApprover("����");
			//���������ƻ�����List����
			list.add(mainplan);
			countnumber += Double.parseDouble(mainplan.getNumber());
			contratcoter = mainplan.getContratcoter();
		}
		//����List
		for(int k=0;k<list.size();k++){
			//��list���MainPlan�����������ӵ����ݿ��У�������ӳɹ� count++;
			if(iproductionService.addMainPlan(list.get(k))){
				count++;
			}
		}
		Order showOrderByContratcoter = iproductionService.showOrderByContratcoter(contratcoter);
		countnumber+=showOrderByContratcoter.getXiadanumber();
		if(countnumber<showOrderByContratcoter.getCoalnumber()){
			iproductionService.updateOrderOrderstate(showOrderByContratcoter);
		}
		else{
			iproductionService.updateOrderOrderstatesetxiada(showOrderByContratcoter);
		}
		showOrderByContratcoter.setXiadanumber(countnumber);
		iproductionService.updateOrderXiadanumber(showOrderByContratcoter);
		//count>0
		if(count>0){
			//����zjhxd.jsp
			return "forward:showMainPlanAll";
		}
		return FAIL;
	}
	//����json����
	@ResponseBody
	@RequestMapping(value="/showMainPlanById/{id}")
	//�ͻ���ͨ���Լ��Ŀ���id����ȡ��ú������ƻ�����
	public JSONPObject showMainPlanById(@PathVariable Integer id ,String callbackparam) throws IOException {
		return new JSONPObject(callbackparam, iproductionService.showMainPlanById(id));
	}
	
	//��ѯ�����������ƻ�
	@RequestMapping(value="/showMainPlanAll")
	public String showMainPlanAll(HttpServletRequest req){
		
		//���������´�����ƻ�
		List<MainPlan> showMainPlanAll = iproductionService.showMainPlanAll();
		//�ѷ��صĽ�������뵽request������
		req.setAttribute("showMainPlanAll", showMainPlanAll);
		
		return "zjhxd";
	}
	
	//�������
	@RequestMapping(value="/plsh")
	public String plsh(HttpServletRequest req){
		int count=0;
		String[] id = req.getParameterValues("mainplan_id");
		
		for(int i=0;i<id.length;i++){
			if(iproductionService.updateAuditstatus(Integer.parseInt(id[i]))){
				count++;
			}
		}
		if(count>0){
			return "forward:showMainPlanAll";
		}
		return FAIL;
	}
	@RequestMapping(value="/shbyid")
	public String shbyid(HttpServletRequest req){
		String id = req.getParameter("id");
		if(iproductionService.updateAuditstatus(Integer.parseInt(id))){
			return "forward:showMainPlanAll";
		}
		return  FAIL;
	}
	
	@ResponseBody
	@RequestMapping(value="updateorderstate/{id}")
	public JSONPObject updateorderstate(@PathVariable Integer id,String callbackparam){
		boolean updateOrderstate = iproductionService.updateOrderstate(id);
		String contratcoter = iproductionService.showContratcoterByid(id);
		Order showOrderByContratcoter = iproductionService.showOrderByContratcoter(contratcoter);
		if(showOrderByContratcoter.getCoalnumber()>showOrderByContratcoter.getXiadanumber()){
			iproductionService.updateOrderOrderstateByXiadanumber(showOrderByContratcoter);
		}else{
			boolean updateOrderOrderstate = iproductionService.updateOrderOrderstate(contratcoter);
		}
		return new JSONPObject(callbackparam, 1);
	}
	@ResponseBody
	@RequestMapping(value="updateorderstateByNot/{id}")
	public JSONPObject updateorderstateByNot(@PathVariable Integer id,String callbackparam){
		boolean updateOrderstate = iproductionService.updateOrderstateByNot(id);
		String contratcoter = iproductionService.showContratcoterByid(id);
		Order showOrderByContratcoter = iproductionService.showOrderByContratcoter(contratcoter);
		if(showOrderByContratcoter.getCoalnumber()>showOrderByContratcoter.getXiadanumber()){
			iproductionService.updateOrderOrderstateByXiadanumberByNot(showOrderByContratcoter);
		}else{
			boolean updateOrderOrderstate = iproductionService.updateOrderOrderstateByNot(contratcoter);
		}
		return new JSONPObject(callbackparam, 1);
	}
	
	@ResponseBody
	@RequestMapping(value="showOrderBycompany/{company}")
	public JSONPObject showOrderBycompany(@PathVariable String company,String callbackparam) throws UnsupportedEncodingException{
		String company1 = new String(company.getBytes("iso-8859-1"),"utf-8");
		
		return new JSONPObject(callbackparam, iproductionService.showOrderBycompany(company1));
	}
	
	
	@ResponseBody
	@RequestMapping(value="showMineOutput")
	public JSONPObject showMineOutput(String callbackparam) throws UnsupportedEncodingException{
		int showMineCount = iproductionService.showMineCount();
		Double showMineOutputCount = iproductionService.showMineOutputCount();
		Order showOrderEnddate = iproductionService.showOrderEnddate();
		
		if("null1".equals(showOrderEnddate+"1") ){
			return new JSONPObject(callbackparam, new MineOutPut(showMineOutputCount+"",showMineCount,0+""));
		}else{
			return new JSONPObject(callbackparam, new MineOutPut(showMineOutputCount+"",showMineCount,showOrderEnddate.getEnddate()));
		}
		
	}
	
	//���������ƻ�
	@RequestMapping(value="showJxPlanAll")
	public String showJxPlanAll(HttpServletRequest req) throws ParseException{
		List<Mine> showMine = iproductionService.showMine();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		DecimalFormat df = new DecimalFormat("#.00");
		for(int i=0;i<showMine.size();i++){
			int days = 0;
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("minename", showMine.get(i).getMineName());
			map.put("zongliang", iproductionService.showMineOutputCountByMineId(showMine.get(i).getId()));
		            //ʱ��ת����
		            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		            Date date1 = sdf.parse(iproductionService.showOrderEnddateByMineId(showMine.get(i).getId()));
		            Date date2 = sdf.parse(iproductionService.showOrderBegindateByMineId(showMine.get(i).getId()));
		            //��ת��������ʱ�����ת����Calendard����
		            Calendar can1 = Calendar.getInstance();
		            can1.setTime(date1);
		            Calendar can2 = Calendar.getInstance();
		            can2.setTime(date2);
		            //�ó��������
		            int year1 = can1.get(Calendar.YEAR);
		            int year2 = can2.get(Calendar.YEAR);
		            //����
		            Calendar can = null;
		            //���can1 < can2
		            //��ȥС��ʱ������һ���Ѿ����˵�����
		            //���ϴ��ʱ���ѹ�������
		            if(can1.before(can2)){
		                days -= can1.get(Calendar.DAY_OF_YEAR);
		                days += can2.get(Calendar.DAY_OF_YEAR);
		                can = can1;
		            }else{
		                days -= can2.get(Calendar.DAY_OF_YEAR);
		                days += can1.get(Calendar.DAY_OF_YEAR);
		                can = can2;
		            }
		            for (int j = 0; j < Math.abs(year2-year1); j++) {
		                //��ȡС��ʱ�䵱ǰ���������
		                days += can.getActualMaximum(Calendar.DAY_OF_YEAR);
		                //�ټ�����һ�ꡣ
		                can.add(Calendar.YEAR, 1);
		            }
		            System.out.println("�����"+days);
		      map.put("days", days);
		      map.put("enddate", iproductionService.showOrderEnddateByMineId(showMine.get(i).getId()));
		      map.put("yueshengchan",df.format( iproductionService.showMineOutputCountByMineId(showMine.get(i).getId()) / days*30));
			list.add(map);
		}
		req.setAttribute("list", list);
		return "scjxjh";
	}
	
	@ResponseBody
	@RequestMapping(value="updateOrderstateByid/{id}")
	public JSONPObject updateOrderstateByid(@PathVariable Integer id,String callbackparam) throws UnsupportedEncodingException{
		boolean updateOrderstateByid = iproductionService.updateOrderstateByid(id);
		return new JSONPObject(callbackparam, 1);
	}
}

