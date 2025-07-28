package com.tnsif.daysix.StatiBlockMethod;

public class Class {
	
	private int section;
	private static int srno;
	
	static {
		
		System.out.println("------inside a static block--------");
		srno=199;
	}
	
	Class(){
		System.out.println("-----Inside default cons----");
		section++;
		srno++;
	}
	
	
	
	@Override
	public String toString() {
		return "Class [section=" + section + "]";
	}



	static void display() {
		System.out.println(srno);
		//System.out.println(section);//because static method can only access static variable;
	}

}
