/**
 * CechenHandler.java
 * com.chinasofti.pms.xl.Prevention.handler
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月29日 		xl
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.chinasofti.pms.xl.Prevention.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasofti.pms.xl.Prevention.entity.Cechen;
import com.chinasofti.pms.xl.Prevention.entity.Cefeng;
import com.chinasofti.pms.xl.Prevention.service.ICechenService;

/**
 * ClassName:CechenHandler
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月29日		上午8:37:01
 *
 * @see 	 
 *  
 */

@Controller
@RequestMapping("cechen")
public class CechenHandler {
	private static String SUCESS = "success";
	private static String FAIL = "fail";
	
	@Autowired
	ICechenService iCechenService;
	
	@RequestMapping("showCechenDaily")
	public String showCechenDaily(HttpServletRequest res){
		List<Cechen> showCechenDaily = iCechenService.showCechenDaily();
		res.setAttribute("list", showCechenDaily);
		return "froward:jsp/cechen_rb.jsp";
	}
	
	@RequestMapping("showCechenWeekly")
	public String showCechenWeekly(HttpServletRequest res){
		List<Cechen> showCechenWeekly = iCechenService.showCechenWeekly();
		res.setAttribute("list", showCechenWeekly);
		return "froward:jsp/cechen_zb.jsp";
	}
	
	@RequestMapping("showCechenMonthly")
	public String showCechenMonthly(HttpServletRequest res){
		List<Cechen> showCechenMonthly = iCechenService.showCechenMonthly();
		res.setAttribute("list", showCechenMonthly);
		return "froward:jsp/cechen_yb.jsp";
	}
	
	@RequestMapping("insertCechen")
	public String insertCechen(Cechen cechen){
		boolean insertCechen = iCechenService.insertCechen(cechen);
		return "forward:jsp/cechen_rb.jsp";
	}
	
	@RequestMapping("showCechen")
	public String showCechen(HttpServletRequest res){
		List<Cechen> showCechen = iCechenService.showCechen();
		res.setAttribute("list", showCechen);
		return "forward:jsp/cechen_rb.jsp";
	}
	@RequestMapping("showCechenToOne")
	public String showCechenToOne(HttpServletRequest res){
		List<Cechen> showCechenToOne = iCechenService.showCechenToOne();
		res.setAttribute("list", showCechenToOne);
		return "forward:jsp/cechen_rb.jsp";
	}
	
	@RequestMapping("updateCechen")
	public String updateCechen(Cechen cechen){
		iCechenService.updateCechen(cechen);
		return "forward:jsp/cechen_rb.jsp";
	}
}

