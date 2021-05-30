package com.info.pojo;

import org.springframework.stereotype.Component;

@Component
public class Result {
	private String res;

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public Result(String res) {
		super();
		this.res = res;
	}

	public Result() {}

	@Override
	public String toString() {
		return res;
	}
}
