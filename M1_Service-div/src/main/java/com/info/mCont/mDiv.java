package com.info.mCont;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/div")
public class mDiv {
	
	@RequestMapping("/fdiv/{x}/{x1}")
	public String div(@PathVariable("x") int n,
			@PathVariable("x1") int n1) {
		System.out.println("X1:"+n+" X2: "+n1);
		String res = null;
		if(n1==0) {		
			res= "Division by zero result infinity";
		}else {
			res=this.opt(n, n1);
		}
		return res;		
	}

	public String opt(int n,int n1) {
		String res = null;
		try {
		      res= n+" / "+n1+" : "+(n/n1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return " "+res;
	}
}
