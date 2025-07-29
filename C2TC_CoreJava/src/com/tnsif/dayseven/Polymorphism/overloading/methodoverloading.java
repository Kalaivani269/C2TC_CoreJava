package com.tnsif.dayseven.Polymorphism.overloading;

public class methodoverloading {
	
	public void main(String[]args) {
		
		Addition a=new Addition();
		a.add();
		System.out.println(a.add(3));
		System.out.println(a.add(3,7));
		System.out.println(a.add(3.5));
		
	
		a.show(66, "kalai");
	    a.show("kalai",66);
		
	}

}
