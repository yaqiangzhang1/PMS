package com.chinasofti.pms.xdd.train.handler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.pms.xdd.train.entity.Gwplan;
import com.chinasofti.pms.xdd.train.entity.Pxjl;
import com.chinasofti.pms.xdd.train.entity.Tplan;
import com.chinasofti.pms.xdd.train.entity.Zhengshu;
import com.chinasofti.pms.xdd.train.service.TrainService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
public class TrainHandler {
	@Autowired
	TrainService trainService;
	public static String SUCCESS = "success";
	public static String FAIL = "fail";
	@RequestMapping("/addplan")
	public String AddTrainPlanEntity(Tplan tplan){
		boolean tss =trainService.AddTrainPlanEntity(tplan);
		if(tss){
			return "forward:getAllPlan";
		}else{
			return FAIL;
		}
	} 
	//日常培培训计划
	@RequestMapping("/getAllPlan")
	public String GetALLTpan(HttpServletRequest request){
		List<Tplan> list = trainService.GetALLTpan();
		request.setAttribute("list", list);
		return "forward:getAllgw";
	}
	@RequestMapping("/deleteplan")
	public String deletePlan(Integer id){
		trainService.deletePlan(id);
		return "redriect:getAllPlan";
		
	}
	//证书人员管理
	@RequestMapping("/addzhengshu")
	public String addZhengShu(Zhengshu zhengshu){
		boolean azs = trainService.addZhengShu(zhengshu);
		if(azs){
			return "forward:getAllzs";
		}else{
			return FAIL;
		}
		
	}
	@RequestMapping("/getAllzs")
	public String getAllZS(HttpServletRequest request){
		List<Zhengshu> zlist = trainService.getAllZS();
		request.setAttribute("zlist", zlist);
		return "zsgl";
		
	}
	@RequestMapping("/deleteZs")
	public String deleteZs(Integer id){
		trainService.deleteZs(id);
		return "#";
		
	}
	//岗位考核培训计划
	@RequestMapping("/addgw")
	public String addGw(Gwplan gwplan){
		boolean gw =  trainService.addGw(gwplan);
		if(gw){
			return "forward:getAllgw";
		}else{
			return FAIL;
		}
	}
	@RequestMapping("/getAllgw")
	public String getAllGW(HttpServletRequest request){
		List<Gwplan> glist = trainService.getAllGW();
		request.setAttribute("glist", glist);
		return "TrainingPlan";
		
	}
	@ResponseBody
	@RequestMapping("/qisini")
	public JSONPObject coalView(String callbackparam){
		return new JSONPObject(callbackparam,trainService.getAllGW());
	}
	@RequestMapping("getallplan")
	public String getAllgwplan(HttpServletRequest request){
		List<Gwplan> ulist = trainService.getAllGW();
		request.setAttribute("ulist", ulist);
		return "updategwplan";
	}
	@RequestMapping("/updategwplan")
	public String updateGwplan(Gwplan gwplan){
		boolean up = trainService.updateGwplan(gwplan);
		if(up){
			return "TrainingPlan";
		}else{
			return FAIL;
		}
	}
	@RequestMapping("/deletegw")
	public String deleteGW(Integer id){
		trainService.deleteGW(id);
		return "#";
		
	}
	//培训记录
	@RequestMapping("/addpxjl")
	public String addPxjl(Pxjl pxjl){
		boolean px = trainService.addPxjl(pxjl);
		if(px){
			return "#";
		}else{
			return FAIL;
		}
	}
	@RequestMapping("/getallpxjd")
	public String getAllpxjl(HttpServletRequest request){
		List<Gwplan> plist = trainService.getAllpxjl();
		request.setAttribute("plist", plist);
		return "#";
		
	}
	//进度查询
	@RequestMapping("/getpxjd")
		public String getAllGWJd(HttpServletRequest request) throws ParseException{
			List<Gwplan> jdlist = trainService.getAllGWJd();
			Date date=new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String tctime = sdf.format(date); 
			long timeStart=sdf.parse(tctime).getTime();
			for (int i = 0; i < jdlist.size(); i++) {
				String tctime2 =jdlist.get(i).getGbegintime();
				String tctime3 =jdlist.get(i).getGendtime();;
				long timeStart2=sdf.parse(tctime2).getTime();
				long timeStart3=sdf.parse(tctime3).getTime();
				if(timeStart2<=timeStart&&timeStart<=timeStart3){
					jdlist.get(i).setKhjd("进行中");
					trainService.updateGw(jdlist.get(i));
				}else if(timeStart>timeStart3){
					jdlist.get(i).setKhjd("培训结束");
					trainService.updateGw(jdlist.get(i));
				}else{
					jdlist.get(i).getKhjd();
				}
			}
			request.setAttribute("jdlist", jdlist);
			return "forward:gettpjd";
		}
	@RequestMapping("/gettpjd")
	public String getAllTpJd(HttpServletRequest request) throws ParseException{
		List<Tplan> tplist = trainService.getAllTpJd();
//		Date date=new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		String tctime = sdf.format(date); 
//		long timeStart=sdf.parse(tctime).getTime();
//		for (int i = 0; i < tplist.size(); i++) {
//			String tctime2 =tplist.get(i).getReleasetime();
//			long timeStart2=sdf.parse(tctime2).getTime();
//			if(timeStart2<timeStart){
//				 tplist.get(i).setPkhjd("已开始");
//			}
//		}
		request.setAttribute("tplist", tplist);
		return "TrainingPlanJd";
	}
}

