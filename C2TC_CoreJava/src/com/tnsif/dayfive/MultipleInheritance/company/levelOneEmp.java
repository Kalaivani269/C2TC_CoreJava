package com.tnsif.dayfive.MultipleInheritance.company;

import java.util.Date;

public class levelOneEmp extends Employee{
	
	private int noOfShares;
	private String authority;
	
	//public  levelOneEmp() {}
	
	public levelOneEmp(String name,long contactno,Date DOB,String dept,long basesalary,int noOfShares, String authority)
	{
		super(name,contactno,DOB,dept,basesalary);
		this.noOfShares=noOfShares;
		this.authority=authority;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "levelOneEmp [noOfShares=" + noOfShares + ", authority=" + authority + "]";
	}
	
}
