package com.info.pojo;

import org.springframework.stereotype.Component;

@Component
public class mInput {
	
	private Integer num1;
	private Integer num2;
	private String op;
	
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	public Integer getNum2() {
		return num2;
	}
	public void setNum2(Integer num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
	public mInput() {}

}
