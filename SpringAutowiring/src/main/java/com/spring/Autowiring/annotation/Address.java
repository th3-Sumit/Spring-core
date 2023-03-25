package com.spring.Autowiring.annotation;

public class Address {
	private String nameString ;
	@Override
	public String toString() {
		return "Address [nameString=" + nameString + ", cityString=" + cityString + "]";
	}
	private String cityString;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	

}
