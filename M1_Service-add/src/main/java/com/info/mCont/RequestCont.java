package com.info.mCont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class RequestCont {
		
	@RequestMapping("/say")
	public String sayHello() {
		System.out.println("In add class say method");
		return "In Add app";
	}
	
	@RequestMapping("/sum/{x}/{x1}")
	public String sum(@PathVariable("x")int n1,
			@PathVariable("x1")int n2) {
		System.out.println("X1:"+n1+" X2:"+n2);
		return "Sum : "+(n1+n2);
	}
}
