package com.tnsif.dayseven.overriding.Banking;

public class overridingDemo {
	
	public static void main(String[] args) {
		
		RBI rbi;
		
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICIC();
		System.out.println(rbi.getRateOfInterest());
		
		
	}

}
