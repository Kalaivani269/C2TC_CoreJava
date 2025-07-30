package com.tnsif.dayeight.InterfaceBasics;

public class Executer {
	
	public static void main(String[] args) {
		
		coder c1;// reference
		
		//Trainer object
		c1=new Trainer();
		c1.rules();
		
		System.out.println("-----------------------");
		
		//Student object
		c1=new Student();
		c1.rules();
		
	}

}
