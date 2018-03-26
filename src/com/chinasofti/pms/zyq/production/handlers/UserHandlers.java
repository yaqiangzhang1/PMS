/**
 * UserHandlers.java
 * com.chinasofti.pms.zyq.production.handlers
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年2月6日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.zyq.production.handlers;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.pms.zyq.production.entity.Bumen;
import com.chinasofti.pms.zyq.production.entity.User;
import com.chinasofti.pms.zyq.production.service.IProductionService;
import com.chinasofti.pms.zyq.production.service.IUserLoginService;

/**
 * ClassName:UserHandlers
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   Administrator
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年2月6日		下午6:19:16
 *
 * @see 	 
 *  
 */
@Controller
public class UserHandlers {
	//自动加载实例化对象
		@Autowired
		IUserLoginService iuserLoginService;
		//返回成功的静态常量
		public static String SUCCESS = "success";
		//返回失败的静态常量
		public static String FAIL = "fail";
		@RequestMapping(value="/login")
	public String login(HttpServletRequest req){
			User user = new User();
			String username = req.getParameter("user");
			String password = req.getParameter("password");
			user.setU_name(username);
			user.setU_password(password);
			System.out.println(user.toString());
			boolean userLogin = iuserLoginService.UserLogin(user);
			System.out.println(userLogin+"-------------");
			if(userLogin==true){
				System.out.println("+++++++++++++++");
				User showUserBygonghao = iuserLoginService.showUserBygonghao(username);
				req.getSession().setAttribute("userqx", showUserBygonghao.getU_bmid());
				req.getSession().setAttribute("username", showUserBygonghao.getU_name());
				req.getSession().setAttribute("user", showUserBygonghao);
				return "../../index";
			}else {
				
			
				System.out.println("_________________");
				req.setAttribute("cwxx", "用户名密码错误");
				return "../../login";
			}
			
			
		}
		
		@RequestMapping(value="/showyhjs")
		public String showyhjs(HttpServletRequest req){
			List<Bumen> showBumenAll = iuserLoginService.showBumenAll();
			req.setAttribute("showBumenAll", showBumenAll);
			return "yhjs";
		}
		
		@RequestMapping(value="addyhjs")
		public String addyhjs(HttpServletRequest req) throws UnsupportedEncodingException{
			String juesename = req.getParameter("juesename");
			String[] qxname = req.getParameterValues("qxname[]");
			String bm_qx = "";
			for(int i=0;i<qxname.length;i++){
				bm_qx += qxname[i]+",";
			}
			String bm_name = new String(juesename.getBytes("iso-8859-1"),"utf-8");
			boolean addyhjs = iuserLoginService.addyhjs(new Bumen(bm_name,bm_qx));
			return "forward:showyhjs";
		}
		
		
		@RequestMapping(value="/showyhgl")
		public String showyhgl(HttpServletRequest req){
			List<User> showUserAll = iuserLoginService.showUserAll();
			List<Bumen> showBumenAll = iuserLoginService.showBumenAll();
			for(int i =0;i<showUserAll.size();i++){
				if(showUserAll.get(i).getU_name().equals("admin")){
					showUserAll.remove(i);
				}
			}
			req.setAttribute("showUserAll", showUserAll);
			req.setAttribute("showBumenAll", showBumenAll);
			return "yhgl";
		}
		
		@RequestMapping(value="/addyhxx")
		public String addyhxx(HttpServletRequest req) throws UnsupportedEncodingException{
			String u_gonghao = req.getParameter("gonghao");
			String u_name = new String(req.getParameter("u_name").getBytes("iso-8859-1"),"utf-8");
			String u_password = req.getParameter("password");
			String u_bmid = new String(req.getParameter("qx").getBytes("iso-8859-1"),"utf-8");
			iuserLoginService.addyhxx(new User(u_gonghao,u_bmid,u_name,u_password));
			return "forward:showyhgl";
		}
		
		
		@ResponseBody
		@RequestMapping(value="/showqxByjs")
		public String showqxByjs(HttpServletRequest req) throws UnsupportedEncodingException{
			String u_bmid = new String(req.getParameter("qx").getBytes("iso-8859-1"),"utf-8");
			System.out.println("----------------");
			return iuserLoginService.showqxByjs(u_bmid);
	
		}
		
		@RequestMapping(value="/userout")
		public String userout(HttpServletRequest req){
			req.getSession().removeAttribute("userqx");
			req.getSession().removeAttribute("username");
			req.getSession().removeAttribute("user");
			req.setAttribute("userout", "空");
			return "../../index";
		}
		
		@RequestMapping(value="/useroutout")
		public String useroutout(){
			return "../../login";
		}
		
		@RequestMapping(value="/outRefresh")
		public String outRefresh(HttpServletRequest req){
			if(req.getSession().getAttribute("user")!=null){
				req.setAttribute("haha", "dsads");
				return "../../index";
			}
			return "../../login";
		}
		
		
		@RequestMapping(value="/deleteyh")
		public String deleteyh(HttpServletRequest req){
			int parseInt = Integer.parseInt(req.getParameter("id"));
			iuserLoginService.deleteyh(parseInt);
				return "forward:showyhgl";
		}
}

