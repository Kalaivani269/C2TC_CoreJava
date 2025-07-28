package com.tnsif.dayfive.association.hssa;

public class Person {

	private String cityname;
	private Address address;// doubt
	
	Person(String cityname, Address address){
		
	    this.cityname=cityname;
	    this.address=address;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println("City name:"+cityname);
		System.out.println("Address:"+address);
		System.out.println("Name:"+address.getName());
		System.out.println("Age:"+address.getAge());
		System.out.println("Id:"+address.getId());
		
	}
}
