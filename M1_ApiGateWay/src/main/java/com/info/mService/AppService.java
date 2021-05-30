package com.info.mService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.info.ApiGateWayApp;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AppService {
	
	@Autowired
	public RestTemplate temp;
		
	@HystrixCommand(fallbackMethod ="error_add")
	public String ser_add( int n, int n1)
	{
		ApiGateWayApp.log.debug("Going to call add service");
		String res = temp.getForObject("http://AddService:8091/add/"
				+ "sum/"+n+"/"+n1,String.class);
		System.out.println("Result:"+res);
		return res;
	}
	
	public String error_add(int n, int n1) {
		return "Addition service may be down";
	}
		
	@HystrixCommand(fallbackMethod = "error_mul")
	public String ser_mul(int n,int n1)
	{
		ApiGateWayApp.log.debug("Going to call mul service");
		String res = temp.getForObject("http://Mul-Service:8032/mul/"
				+ "fmul/"+n+"/"+n1,String.class);
		System.out.println("Result:"+res);
		return res;
	}
	
	public String error_mul(int n,int n1) {
		return "Multiplication service may be down";
	}
		
	@HystrixCommand(fallbackMethod =("error_div"))
	public String ser_div(int n, int n1) {
		ApiGateWayApp.log.debug("Going to call Div service");
		String res = temp.getForObject("http://Div-Service:8022/div/"
				+ "fdiv/"+n+"/"+n1,String.class);
		System.out.println("Result:"+res);
		return res;
	}
	
	public String error_div(int n, int n1) {
		return "Division service may be down";
	}

	@HystrixCommand(fallbackMethod = ("error_sub"))
	public String ser_sub(int n, int n1) {
		ApiGateWayApp.log.debug("Going to call Sub");
		String res = temp.getForObject("http://Sub-Service:8093/"
				+ "sub/diff/"+n+"/"+n1,String.class);
		System.out.println("Ret:"+res);
		return res;
	}
	
	public String error_sub(int n, int n1) {
		return "Substraction service may be down";
	}
}