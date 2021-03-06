/**
 * TongfengHandler.java
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

import com.chinasofti.pms.xl.Prevention.entity.Cefeng;
import com.chinasofti.pms.xl.Prevention.entity.Tongfeng;
import com.chinasofti.pms.xl.Prevention.service.ITongfengService;

/**
 * ClassName:TongfengHandler
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月26日		上午11:39:40
 *
 * @see 	 
 *  
 */
@Controller
@RequestMapping("tongfeng")
public class TongfengHandler {
	private static String SUCCESS = "success";
	private static String FAIL = "fail";
	private static boolean Flag = false;
	
	@Autowired
	ITongfengService iTongfengService;
	
	@RequestMapping("showTongfengDaily")
	public String showTongfengDaily(HttpServletRequest res){
		List<Tongfeng> showTongfengDaily = iTongfengService.showTongfengDaily();
		res.setAttribute("list", showTongfengDaily);
		return "forward:jsp/tongfeng_rb.jsp";
	}
	
	@RequestMapping("showTongfengWeekly")
	public String showTongfengWeekly(HttpServletRequest res){
		List<Tongfeng> showTongfengWeekly = iTongfengService.showTongfengWeekly();
		res.setAttribute("list", showTongfengWeekly);
		return "forward:jsp/tongfeng_zb.jsp";
	}
	
	@RequestMapping("showTongfengMonthly")
	public String showTongfengMonthly(HttpServletRequest res){
		List<Tongfeng> showTongfengMonthly = iTongfengService.showTongfengMonthly();
		res.setAttribute("list", showTongfengMonthly);
		return "forward:jsp/tongfeng_yb.jsp";
	}
	
	@RequestMapping("insertTongfeng")
	public String insertTongfeng(Tongfeng tongfeng){
		boolean insertTongfeng = iTongfengService.insertTongfeng(tongfeng);
		return "forward:jsp/tongfeng_rb.jsp";
	}
	
	@RequestMapping("showTongfeng")
	public String showTongfeng(HttpServletRequest res){
		List<Tongfeng> showTongfeng = iTongfengService.showTongfeng();
		res.setAttribute("list", showTongfeng);
		return "forward:jsp/tongfeng_yb.jsp";
	}
	
	@RequestMapping("showTongfengToOne")
	public String showTongfengToOne(HttpServletRequest res){
		List<Tongfeng> showTongfengToOne = iTongfengService.showTongfengToOne();
		res.setAttribute("list", showTongfengToOne);
		return "forward:jsp/tongfeng_yb.jsp";
	}
	
	@RequestMapping("updateTongfeng")
	public String updateTongfeng(Tongfeng tongfeng){
		boolean updateTongfeng = iTongfengService.updateTongfeng(tongfeng);
		return "forward:jsp/tongfeng_rb.jsp";
	}
}

