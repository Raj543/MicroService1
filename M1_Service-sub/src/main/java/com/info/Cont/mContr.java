package com.info.Cont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sub")

public class mContr {
	
	@RequestMapping("/say")
	public String sayHello() {
		return "Hello in Sub app";
	}
	
	@RequestMapping("/diff/{x}/{x1}")
	public String diff(@PathVariable("x") int n,@PathVariable("x1")int n2) {
		System.out.println("X:"+n+" X1:"+n2);
		return "X1 - X2 :"+(n-n2);
	}
}
