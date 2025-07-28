package com.tnsif.dayfive.MultipleInheritance.vehicle;

public class vehicle {
	
	public static void main(String[] args) {
		
		car c= new car();
		c.vehicleType();
		
		maruthi m=new maruthi();
		m.brand();
		m.speed();
		
		maruthi800 mar=new maruthi800();
		mar.brand();
		mar.speed();
	}

}
