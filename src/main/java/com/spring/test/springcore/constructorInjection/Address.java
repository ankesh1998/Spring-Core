package com.spring.test.springcore.constructorInjection;

public class Address {
	
	private int houseNo;
	private String street, district;
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", district=" + district + "]";
	}

	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}


}
