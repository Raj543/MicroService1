package com.info.cont;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.ApiGateWayApp;
import com.info.mService.AppService;
import com.info.pojo.Result;

@Controller
@RequestMapping("/gateway")
public class mCont {
	
	@Autowired
    private AppService app_ser;
	
	@Autowired
	public Result res;
	
	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}
	
	@RequestMapping("/exit")
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.html");
		return mv;
	}
	
	@RequestMapping("/action")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.html");
		return mv;	
	}
	
	@RequestMapping("/output")
	public ModelAndView getOutput() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("output.html");
		return mv;
	}
	
	@RequestMapping("/option")
	public ModelAndView takeInput(
			@RequestParam("num1") int n1,
			@RequestParam("num2") int n2,
			@RequestParam("opt") String op){
		ModelAndView mv = new ModelAndView();
		System.out.println("n1: "+n1+" n2: "+n2+" Opt "+op);
		if(op.equalsIgnoreCase("add")) {
			ApiGateWayApp.log.debug(" In add operation");
			res.setRes(app_ser.ser_add(n1, n2));
		}else if(op.equalsIgnoreCase("sub")) {
			ApiGateWayApp.log.debug(" In sub operation");
			res.setRes(app_ser.ser_sub(n1, n2));
		}else if(op.equalsIgnoreCase("mul")) {
			ApiGateWayApp.log.debug(" In mul operation");
			res.setRes(app_ser.ser_mul(n1, n2));
		}else if(op.equalsIgnoreCase("div")) {
			ApiGateWayApp.log.debug(" In div operation");
			res.setRes(app_ser.ser_div(n1, n2));
		}
		if(!op.isEmpty()){
			mv.addObject("msg",res.getRes());
			mv.setViewName("output");	
		}
		return mv;
	}
}