/**
 * WasiHandler.java
 * com.chinasofti.pms.xl.Prevention.handler
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月30日 		xl
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
import com.chinasofti.pms.xl.Prevention.entity.Wasi;
import com.chinasofti.pms.xl.Prevention.service.IWasiService;

/**
 * ClassName:WasiHandler
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月30日		下午4:08:23
 *
 * @see 	 
 *  
 */

@Controller
@RequestMapping("wasi")
public class WasiHandler {
	private static String SUCCESS = "success";
	private static String FAIL = "fail";
	
	@Autowired
	IWasiService iWasiService;
	
	@RequestMapping("showWasiDaily")
	public String showWasiDaily(HttpServletRequest res){
		List<Wasi> showWasiDaily = iWasiService.showWasiDaily();
		res.setAttribute("list", showWasiDaily);
		return "forward:jsp/wasi_rb.jsp";
	}
	
	@RequestMapping("showWasiWeekly")
	public String showWasiWeekly(HttpServletRequest res){
		List<Wasi> showWasiWeekly = iWasiService.showWasiWeekly();
		res.setAttribute("list", showWasiWeekly);
		return "forward:jsp/wasi_zb.jsp";
	}
	
	@RequestMapping("showWasiMonthly")
	public String showWasiMonthly(HttpServletRequest res){
		List<Wasi> showWasiMonthly = iWasiService.showWasiMonthly();
		res.setAttribute("list", showWasiMonthly);
		return "forward:jsp/wasi_yb.jsp";
	}
	
	@RequestMapping("insertWasi")
	public String insertWasi(Wasi wasi){
		 boolean insertWasi = iWasiService.insertWasi(wasi);
		return "forward:jsp/wasi_rb.jsp";
	}
	
	@RequestMapping("showWasi")
	public String showWasi(HttpServletRequest res){
		List<Wasi> showWasi = iWasiService.showWasi();
		res.setAttribute("list", showWasi);
		return "forward:jsp/wasi_rb.jsp";
	}
	@RequestMapping("showWasiToOne")
	public String showWasiToOne(HttpServletRequest res){
		List<Wasi> showWasiToOne = iWasiService.showWasiToOne();
		res.setAttribute("list", showWasiToOne);
		return "forward:jsp/wasi_rb.jsp";
	}
	
	@RequestMapping("updateWasi")
	public String updateWasi(Wasi wasi){
		iWasiService.updateWasi(wasi);
		return "forward:jsp/wasi_rb.jsp";
	}
}

