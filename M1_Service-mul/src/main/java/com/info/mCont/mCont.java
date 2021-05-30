package com.info.mCont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mul")
public class mCont {
	
	@RequestMapping("/")
	public String msg() {
		return "In mul app";
	}
	
	@RequestMapping("/fmul/{x}/{x1}")
	public String div(@PathVariable("x") int n,
			@PathVariable("x1") int n1) {
		System.out.println("X1 :"+n+"X2 :"+n1);
		return "Mul : "+(n*n1);
	}
}
