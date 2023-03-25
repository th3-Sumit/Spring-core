package com.spring.exp_lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("#{2+3}")
	public int sum;
	
	@Value("#{10-4}")
	public int sub;
	
	@Value("#{3*5}")
	public int mul;
	
	@Value("#{15/3}")
	public int div;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equlavalid=" + equlavalid
				+ "]";
	}

	@Value("#{1==1}")
	public boolean equlavalid;
}
