package com.spring.Autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}


	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor call ....");
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter injection.... ");
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
