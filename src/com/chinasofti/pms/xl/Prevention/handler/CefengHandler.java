/**
 * CefengHandler.java
 * com.chinasofti.pms.xl.Prevention.handler
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月26日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.pms.xl.Prevention.entity.Cefeng;
import com.chinasofti.pms.xl.Prevention.service.ICefengService;
import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * ClassName:CefengHandler
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		下午3:48:17
 *
 * @see 	 
 *  
 */

@Controller
@RequestMapping("cefeng")
public class CefengHandler {
	private static String SUCCESS = "success";
	private static String FAIL = "fail";
	private static boolean Flag = false;
	
	@Autowired
	ICefengService iCefengService;
	
	@RequestMapping("showCefengDaily")
	public String showCefengDaily(HttpServletRequest res){
		List<Cefeng> showCefengDaily = iCefengService.showCefengDaily();
		res.setAttribute("list", showCefengDaily);
		return "forward:jsp/cefeng_rb.jsp";
	}
	
	@RequestMapping("showCefengWeekly")
	public String showCefengWeekly(HttpServletRequest res){
		List<Cefeng> showCefengWeekly = iCefengService.showCefengWeekly();
		res.setAttribute("list", showCefengWeekly);
		return "forward:jsp/cefeng_zb.jsp";
	}
	
	@RequestMapping("showCefengMonthly")
	public String showCefengMonthly(HttpServletRequest res){
		List<Cefeng> showCefengMonthly = iCefengService.showCefengMonthly();
		res.setAttribute("list", showCefengMonthly);
		return "forward:jsp/cefeng_yb.jsp";
		
	}
	
	@ResponseBody
	@RequestMapping("insertCefeng")
	public void insertCefeng(Cefeng cefeng ){
		System.out.println("kkkkkkkkkk****");
		System.out.println(cefeng.toString());
//		boolean insertCefeng = iCefengService.insertCefeng(cefeng);
//		return new JSONPObject(callbackparam,0);
	}
	
	@RequestMapping("showCefeng")
	public String showCefeng(HttpServletRequest res){
		System.out.println("=========");
		List<Cefeng> showCefeng = iCefengService.showCefeng();
		System.out.println(showCefeng.size());
		res.setAttribute("list", showCefeng);
		return "../jsp/cefeng_rb";
	}
	@RequestMapping("showCefengToOne")
	public String showCefengToOne(HttpServletRequest res){
		List<Cefeng> showCefengToOne = iCefengService.showCefengToOne();
		res.setAttribute("list", showCefengToOne);
		return "forward:jsp/cefeng_rb.jsp";
	}
	
	@RequestMapping("updateCefeng")
	public String updateCefeng(Cefeng cefeng){
		iCefengService.updateCefeng(cefeng);
		return "forward:jsp/cefeng_rb.jsp";
	}
	
}

