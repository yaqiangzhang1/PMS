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

package com.chinasofti.pms.zmx.diaodu.handler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmx.diaodu.entity.Output;
import com.chinasofti.pms.zmx.diaodu.entity.RZhi;
import com.chinasofti.pms.zmx.diaodu.entity.Shigu;
import com.chinasofti.pms.zmx.diaodu.entity.YuAn;
import com.chinasofti.pms.zmx.diaodu.entity.ZhiHui;
import com.chinasofti.pms.zmx.diaodu.service.IDiaoDuService;
import com.chinasofti.pms.zyq.production.entity.MainPlan;

import net.sf.json.JSONArray;

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
@Controller
public class zmxHandler {
	@Autowired
	IDiaoDuService idiaoduService;
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpServletResponse response;
	public static String SUCCESS = "success";
	public static String FAIL = "fail";
	
	//��ѯ���е�����־
	@RequestMapping(value="/getAll")
	public String getAll(){
		System.out.println("getAll");
		List<RZhi> list=idiaoduService.getAll();
		request.setAttribute("list", list);
		if (null!=list) {
			return "forward:jsp/diaodu2.jsp";
		}
		return FAIL;
	}
	//��ѯ����Ԥ��
	@RequestMapping(value="/yuAnAll")
	public String yuAnAll(){
		System.out.println("yuAnAll");
		List<YuAn> list=idiaoduService.yuAnAll();
		request.setAttribute("list", list);
		return "forward:jsp/diaodu3.jsp";
	}
	//Ԥ������
	@RequestMapping(value="/yuanadd")
	public String yuanadd(YuAn yuan,@RequestParam("file") MultipartFile file){
		System.out.println("yuanadd"+yuan.toString());
		String filepath="";
		try {
			filepath = "d:/pmsfile/"+file.getOriginalFilename();
			System.out.println(filepath);
			file.transferTo(new File(filepath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yuan.setYuan(file.getOriginalFilename());
		List<YuAn> list=idiaoduService.yuAnAll();
		if (null!=list) {
			for (int i = 0; i <list.size(); i++) {
				System.out.println(!yuan.getName().equals(list.get(i).getName()));
				if (yuan.getName().equals(list.get(i).getName())) {
					if(yuan.getDengji().equals(list.get(i).getDengji())){
						return "forward:yuAnAll";
					}
				}else{
					idiaoduService.yuanadd(yuan);
					return "forward:yuAnAll";
				}
			}
		}
		idiaoduService.yuanadd(yuan);
		return "forward:yuAnAll";
	}
	//Ԥ���޸�
	@RequestMapping(value="/yuantoupdate/{id}")
	public String yuantoupdate(@PathVariable("id") Integer id){
		System.out.println("yuantoupdate"+id);
		List<YuAn> list=idiaoduService.yuAnbyid(id);
		request.setAttribute("list",list);
		return "yuanupdate";
	
	}
	//Ԥ���޸�
		@RequestMapping(value="/yuanupdate")
		public String yuanupdate(YuAn yuAn,@RequestParam("file") MultipartFile file){			
			System.out.println("yuanupdate");
			String filepath="";
			try {
				filepath = "d:/pmsfile/"+file.getOriginalFilename();
				System.out.println(filepath);
				file.transferTo(new File(filepath));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			yuAn.setYuan(file.getOriginalFilename());
			idiaoduService.yuanupdate(yuAn);
			return "forward:yuAnAll";
		
		}
	//����ָ�ӻ���Ӧ��ָ����Ա
	@RequestMapping("/zhihuiadd")
	public String zhihuiadd(ZhiHui zhihui){
		System.out.println("zhihuiadd");
		idiaoduService.zhihuiadd(zhihui);
		JSONArray jsonArray = JSONArray.fromObject(SUCCESS);
		try {
			response.getWriter().write(jsonArray.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "forward:zhihui";
	}
	//��ѯָ�ӻ���Ӧ��ָ����Ա
	@RequestMapping(value="/zhihuiAll")
	public String zhihuiAll(){
		System.out.println("123456");
		String gangwei= request.getParameter("gangwei");
		System.out.println(gangwei+"zhihuiAll");
		List<ZhiHui> list=idiaoduService.zhihuiAll();
		System.out.println(list.size()+"\t"+list);
		if (list!=null) {
			for (int i = 0; i <list.size();i++){
				System.out.println(list.get(i).getGangwei());
				System.out.println(gangwei.equals(list.get(i).getGangwei()));
				if (gangwei.equals(list.get(i).getGangwei())){
					System.out.println("============");
					return "forward:zhihui";
				}else{
					System.out.println("++++++++++");
					return "forward:zhihuiadd";
				}
			}
		}
		//return "forward:zhihuiadd";
		return "forward:zhihui";
	}
	//��ѯ���е���ָ��
	@RequestMapping("/planAll")
	public String planAll(){
		System.out.println("diaodu1");
		List<MainPlan> list=idiaoduService.planAll();
		List<Output> outputlist=null;
		for (int i = 0; i <list.size(); i++) {
			//List<Output> outputlist=new ArrayList<Output>();
			String mine_name = list.get(i).getMine_name();
			double xyplan = Double.parseDouble(list.get(i).getNumber());
			System.out.println(xyplan+"\t"+mine_name);
			outputlist=idiaoduService.showoutput(mine_name);
			if (outputlist.size()==0) {
				this.addjihua(mine_name, xyplan);
				request.setAttribute("list", outputlist);
				return "forward:jsp/diaodu1.jsp";
			}else{				
				for (int j = 0; j <outputlist.size(); j++) {
					if (!outputlist.get(j).getMine_name().equals(mine_name)&&!outputlist.get(j).getName().equals("ϴѡ")&&!outputlist.get(j).getYplan().equals(xyplan)) {
						this.addjihua(mine_name, xyplan);
						outputlist=idiaoduService.showoutput(mine_name);
						System.out.println("==="+outputlist);
						request.setAttribute("list", outputlist);
						return "forward:jsp/diaodu1.jsp";
					}else{
						System.out.println("=====");
						request.setAttribute("list", outputlist);
						System.out.println(outputlist);
						return "forward:jsp/diaodu1.jsp";
					}
				}
			}
		}
		request.setAttribute("list", outputlist);
		return "forward:jsp/diaodu1.jsp";
		
	}
	//���Ӽƻ�����
	public void addjihua(String mine_name,double xyplan){
		System.out.println("addjihua");
		NumberFormat nbf=NumberFormat.getInstance();   
		nbf.setMinimumFractionDigits(5);   
		double xmplan=Double.parseDouble(nbf.format(xyplan/12.0));
		double xrplan=Double.parseDouble(nbf.format(xyplan/365.0));
		double cyplan=Double.parseDouble(nbf.format(xyplan/0.9));
		double cmplan=Double.parseDouble(nbf.format(xyplan/0.9/12.0));
		double crplan=Double.parseDouble(nbf.format(xyplan/0.9/365.0));
		Output output1 = new Output(null,"ϴѡ",mine_name,xrplan,xmplan,xyplan);
		Output output2 = new Output(null,"�ɾ�",mine_name,crplan,cmplan,cyplan);
		idiaoduService.addoutput(output1);
		idiaoduService.addoutput(output2);
	}
	
	//����ʵ�ʲ���
	@RequestMapping(value="/addshiji")
	public String addshiji(Output output){
		Double crshiji = Double.parseDouble(request.getParameter("crshiji"));
		Double xrshiji = Double.parseDouble(request.getParameter("xrshiji"));
		String day =request.getParameter("day");
		String mine_name =request.getParameter("mine_name");
		List<Output> outputlist=idiaoduService.showoutput(mine_name);
		String month=day.split("-")[1];
		String year=day.split("-")[2];
		for (int i = 0; i < outputlist.size(); i++) {
			if (outputlist.get(i).getName().equals("ϴѡ")) {
				Double xrplan = outputlist.get(i).getRplan();//�ռƻ�ϴѡ
				Double xmplan = outputlist.get(i).getMplan();//�¼ƻ�ϴѡ
				Double xyplan = outputlist.get(i).getYplan();//��ƻ�ϴѡ
				
				Double mshiji = outputlist.get(i).getMshiji();//��ʵ��ϴѡ
				Double yshiji = outputlist.get(i).getYshiji();//��ʵ��ϴѡ
				Double xmshiji=mshiji+xrshiji; //���ۼ�ʵ��ϴѡ
				Double xyshiji=yshiji+xrshiji; //���ۼ�ʵ��ϴѡ
				Double xrchaokui=xrshiji-xrplan; //�ճ���
				Double xmchaokui=xmshiji-xmplan; //���ۼƳ���
				Double xychaokui=xyshiji-xyplan; //���ۼƳ���
			}else{
				Double mshiji = outputlist.get(i).getRshiji();
				Double yshiji = outputlist.get(i).getRshiji();
				Double xmshiji=mshiji+crshiji;
				Double xyshiji=yshiji+crshiji;
			}
		}
		return "forward:jsp/diaodu1.jsp";
	}
	
	//��ѯӦ��ָ����Ա
	@RequestMapping("/zhihui")
	public String zhihui(){
		System.out.println("zhihui123");
		List<ZhiHui> list1=idiaoduService.zhihui();
		List<Shigu> list=idiaoduService.shigu();
		List<Shigu> list2=new ArrayList<Shigu>();
		if (list!=null) {
			for (int i = 0; i <list.size(); i++) {
				if (list.get(i).getJieguo().equals("δ���")) {
					list2.add(list.get(i));
				}
			}
		}
		request.setAttribute("list2", list2);
		request.setAttribute("list1", list1);
		return "../../jsp/diaodu4";
	}
	//�޸�Ӧ��ָ����Ա��Ϣ
	@RequestMapping(value="/toupdate/{id}")
	public String toupdate(@PathVariable("id") Integer id){
		System.out.println("toupdate"+id);
		List<ZhiHui> list=idiaoduService.zhihui(id);
		request.setAttribute("list", list);
		return "update";
	}
	//�޸�Ӧ��ָ����Ա��Ϣ
	@RequestMapping(value="/update")
	public String update(ZhiHui zhihui){
		System.out.println("update");
		Integer id = Integer.parseInt(request.getParameter("id"));
		String gangwei="";
		String name="";
		String zhiwu="";
		String dianhua="";
		try {
			gangwei = new String(request.getParameter("gangwei").getBytes("iso-8859-1"),"utf-8");
			name = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
			zhiwu = new String(request.getParameter("zhiwu").getBytes("iso-8859-1"),"utf-8");
			dianhua = new String(request.getParameter("dianhua").getBytes("iso-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		zhihui.setId(id);
		zhihui.setGangwei(gangwei);
		zhihui.setName(name);
		zhihui.setZhiwu(zhiwu);
		zhihui.setDianhua(dianhua);
		idiaoduService.update(zhihui);
		return "forward:zhihui";
	}
	//Ԥ��������
	@RequestMapping(value="/qiyong/{name}/{dengji}")
	public String qiyong(@PathVariable("name") String name,@PathVariable("dengji") String dengji) throws Exception{
		List<YuAn> list=idiaoduService.yuanbyname(name);
		String yuan="";
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i).getDengji().equals(dengji)) {
				yuan=list.get(i).getYuan();
			}
		}
		String f = new String(yuan.getBytes("iso-8859-1"),"utf-8");
		System.out.println("filepath:"+f);
        response.setContentType("application/x-msdownload");      
        response.setHeader("Content-Disposition", "attachment;fileName="+new String(f.getBytes("utf-8"),"ISO8859-1"));
        InputStream inputStream=null;
        OutputStream outputStream=null;
        String path ="d:"+ File.separator+"pmsfile"+File.separator;
        byte[] bytes = new byte[2048];
        try {
            File file=new File(path,f);
            inputStream = new FileInputStream(file);
            outputStream = response.getOutputStream();
            int length;
            while ((length = inputStream.read(bytes)) > 0) {
                outputStream.write(bytes, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream!=null) {
                outputStream.close();
            }
            if(inputStream!=null) {
                inputStream.close();
            }
        }
        return null;
	}
	//���������ѯ
	@RequestMapping(value="/yinhuanAll")
	public String yinhuanAll() throws IOException{
		System.out.println("yinhuanAll");
		List<Yinhuan> list=idiaoduService.yinhuanAll();
		System.out.println(list);
		request.setAttribute("list", list);
		//JSONArray jsonArray = JSONArray.fromObject(list);
		//response.getWriter().write(jsonArray.toString());
		return "yuanadd";
	}
	//�������Ʋ�ѯԤ��
	@RequestMapping(value="yuanbyname/{name}")
	public String yuanbyname(@PathVariable("name") String name){
		List<YuAn> list=idiaoduService.yuanbyname(name);
		System.out.println(list);
		request.setAttribute("list", list);
		return "forward:jsp/diaodu4.jsp";
	}
}
