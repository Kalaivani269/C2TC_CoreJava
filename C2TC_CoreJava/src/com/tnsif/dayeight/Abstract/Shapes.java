package com.tnsif.dayeight.Abstract;

public abstract class Shapes {
	
	     protected float area;     
	     //abstract method 
		 abstract void calArea();
		 
		 //concrete method
		 void show()
		 {
			 System.out.println("Area of shape is "+area);
		 }
	}