package com.spring.Autowiring.xml;

public class Student {
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
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
