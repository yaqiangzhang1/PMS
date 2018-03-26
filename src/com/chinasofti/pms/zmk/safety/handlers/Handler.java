/**
 * Handlers.java
 * com.chinasofti.ssm.user.handlers
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月16日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zmk.safety.handlers;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect;
import java.util.Date;
import java.util.List;

import javax.mail.Multipart;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.pms.zmk.safety.entity.Dengji;
import com.chinasofti.pms.zmk.safety.entity.Jganquan;
import com.chinasofti.pms.zmk.safety.entity.Ltanquan;
import com.chinasofti.pms.zmk.safety.entity.Weixian;
import com.chinasofti.pms.zmk.safety.entity.Yinhuan;
import com.chinasofti.pms.zmk.safety.entity.Zhengshu;
import com.chinasofti.pms.zmk.safety.service.ISafetyService;





/**
 * ClassName:Handlers
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月16日		下午6:19:49
 *
 * @see 	 
 *  
 */
@Controller
public class Handler {
	@Autowired
	ISafetyService isafetyService;
	public static String SUCCESS = "success";
	public static String FAIL = "fail";
//增加隐患
	@RequestMapping("/addYinhuan")
	public String addYinhuan(HttpServletRequest req) throws UnsupportedEncodingException{
		String yinhuantype1 = req.getParameter("yinhuantype");
		String[] yinhuandengji1 = req.getParameterValues("yinhuandengji[]");
		String yinhuandengji = "";
		for(int i=0;i<yinhuandengji1.length;i++){
			yinhuandengji += yinhuandengji1[i];
		}
		String yinhuantype = new String(yinhuantype1.getBytes("iso-8859-1"),"utf-8");
		System.out.println(yinhuantype);
		System.out.println(yinhuandengji);
		System.out.println("{=-=====");
		boolean addYinhuan = isafetyService.addYinhuan(new Yinhuan(yinhuantype,yinhuandengji));
		System.out.println(addYinhuan);
		if(addYinhuan){
			return "redirect:showYinhuan";
		}else{
			return FAIL;
		}
		
	}
//展示隐患
	@Autowired
	private HttpServletRequest HttpServletRequest;
	@RequestMapping("/showYinhuan")
	public String showYinhuan(){
		System.out.println("showyinhuan");
		List<Yinhuan> showYinhuan = isafetyService.showYinhuan();
		System.out.println(showYinhuan.size());
		HttpServletRequest.setAttribute("list", showYinhuan);
		System.out.println("list------");
		return "forward:jsp/index1.jsp";
	}
//删除隐患
	@RequestMapping("/deleteYinhuan/{id}")
	public String deleteYinhuan(@PathVariable("id") Integer id){
		System.out.println("deleteYinhuan");
		isafetyService.deleteYinhuan(id);
		return "redirect:../showYinhuan";
}
	
////增加等级
//	@RequestMapping("/addDengji")
//	public String addDengji(Dengji dengji){
//		System.out.println("{=-=====");
//		boolean addDengji = isafetyService.addDengji(dengji);
//		System.out.println(addDengji);
//		if(addDengji){
//			return "redirect:showDengji";
//		}else{
//			return FAIL;
//		}
//		
//	}
//	
//	
////展示等级
//	@RequestMapping("/showDengji")
//	public String showDengji( HttpServletRequest HttpServletRequest){
//		System.out.println("showDengji");
//		List<Dengji> showDengji = isafetyService.showDengji();
//		System.out.println(showDengji.size());
//		HttpServletRequest.setAttribute("listd", showDengji);
//		System.out.println(showDengji);
//		return "forward:jsp/index1.jsp";
//	}
	//增加井工
	
			@RequestMapping("/addJganquan")
			public String addJganquan(HttpServletRequest req) throws UnsupportedEncodingException{
				String jgname1 = req.getParameter("jgname");
				Integer  jgmanfen = Integer.parseInt(req.getParameter("jgmanfen"));
				Float jgquanzhong = Float.parseFloat(req.getParameter("jgquanzhong"));
				String jgname = new String(jgname1.getBytes("iso-8859-1"),"utf-8");
				System.out.println(jgname+""+jgmanfen+""+jgquanzhong);
				boolean addJganquan = isafetyService.addJganquan(new Jganquan(jgname, jgmanfen, jgquanzhong));
				System.out.println(addJganquan);
				if(addJganquan){
					return "redirect:showJganquan";
				}else{
					return FAIL;
				}
				
			}

//展示井工
		
		
		@RequestMapping("/showJganquan")
		public String showJganquan(){
			System.out.println("showJganquan");
			List<Jganquan> showJganquan = isafetyService.showJganquan();
			System.out.println(showJganquan.size()+"\t"+showJganquan);
			HttpServletRequest.setAttribute("list1", showJganquan);
			List<Ltanquan> showLtanquan = isafetyService.showLtanquan();
			System.out.println(showLtanquan.size()+"\t"+showLtanquan);
			HttpServletRequest.setAttribute("list2", showLtanquan);
			return "forward:jsp/index2.jsp";
		}
//删除井工
		@RequestMapping("/deleteJganquan/{jgid}")
		public String deleteJganquan(@PathVariable("jgid") Integer jgid){
			System.out.println("deleteJganquan");
			isafetyService.deleteJganquan(jgid);
			return "redirect:../showJganquan";
	}
		
		//增加露天
		@RequestMapping("/addLtanquan")
		public String addLtanquan(HttpServletRequest req) throws UnsupportedEncodingException{
			String ltname1 = req.getParameter("ltname");
			Integer  ltmanfen1 = Integer.parseInt(req.getParameter("ltmanfen"));
			Float ltquanzhong1 = Float.parseFloat(req.getParameter("ltquanzhong"));
			String ltname = new String(ltname1.getBytes("iso-8859-1"),"utf-8");
			boolean addLtanquan = isafetyService.addLtanquan(new Ltanquan(ltname, ltmanfen1, ltquanzhong1));
			System.out.println(addLtanquan);
			System.out.println("{=-====="+ltname1+""+ltmanfen1+""+ltquanzhong1);
			if(addLtanquan){
				return "redirect:showLtanquan";
			}else{
				return FAIL;
			}
			
		}

//展示露天
				
				
				@RequestMapping("/showLtanquan")
				public String showLtanquan(){
					System.out.println("showLtanquan");
					List<Ltanquan> showLtanquan = isafetyService.showLtanquan();
					System.out.println(showLtanquan.size()+"\t"+showLtanquan);
					HttpServletRequest.setAttribute("list", showLtanquan);
					return "forward:jsp/index2.jsp";
				}
//删除露天
				@RequestMapping("/deleteLtanquan/{ltid}")
				public String deleteLtanquan(@PathVariable("ltid") Integer ltid){
					System.out.println("deleteLtanquan");
					isafetyService.deleteLtanquan(ltid);
					return "redirect:../showLtanquan";
			}
				
				
				//增加危险
				@RequestMapping("/addWeixian")
				public String addWeixian(HttpServletRequest req) throws UnsupportedEncodingException{
					String yinsu = req.getParameter("yinsu");
					String houguo = req.getParameter("houguo");
					String cuoshi = req.getParameter("cuoshi");
					boolean addWeixian = isafetyService.addWeixian(new Weixian(yinsu, houguo, cuoshi));
					System.out.println(addWeixian);
					if(addWeixian){
						return "redirect:showWeixian";
					}else{
						return FAIL;
					}
					
				}

//展示危险
				
				
				@RequestMapping("/showWeixian")
				public String showWeixian(){
					System.out.println("showWeixian");
					List<Weixian> showWeixian = isafetyService.showWeixian();
					System.out.println(showWeixian.size()+"\t"+showWeixian);
					HttpServletRequest.setAttribute("list3", showWeixian);
					return "forward:jsp/index3.jsp";
				}
//删除危险
				@RequestMapping("/deleteWeixian/{wxid}")
				public String deleteWeixian(@PathVariable("wxid") Integer wxid){
					System.out.println("deleteWeixian");
					isafetyService.deleteWeixian(wxid);
					return "redirect:../showWeixian";
			}
//增加证书
				@RequestMapping("/addZhengshu")
				public String addZhengshu(Zhengshu zhengshu){
					System.out.println("{=-=====");
					boolean addZhengshu = isafetyService.addZhengshu(zhengshu);
					System.out.println(addZhengshu);
					if(addZhengshu){
						return "redirect:showZhengshu";
					}else{
						return FAIL;
					}
					
				}
//展示证书
				
				
				@RequestMapping("/showZhengshu")
				public String showZhengshu(){
					System.out.println("showZhengshu");
					List<Zhengshu> showZhengshu = isafetyService.showZhengshu();
					System.out.println(showZhengshu.size()+"\t"+showZhengshu);
					HttpServletRequest.setAttribute("list4", showZhengshu);
					return "forward:jsp/index4.jsp";
				}
	
	}


