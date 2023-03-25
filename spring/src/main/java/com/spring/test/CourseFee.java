package com.spring.test;

import java.util.Map;

public class CourseFee {
	private Map<String , Integer> feeMap;

	public CourseFee(Map<String, Integer> feeMap) {
		super();
		this.feeMap = feeMap;
	}

	@Override
	public String toString() {
		return "CourseFee [feeMap=" + feeMap + "]";
	}
	
}
