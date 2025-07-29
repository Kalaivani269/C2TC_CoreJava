package com.tnsif.dayseven.overriding.shapes;

public class Triangle extends Shapes{
	
	public double base;
	public double height;
	
	public  Triangle( double base, double height) {
		this.base=base;
		this.height=height;	
	}

	@Override
	
	public void draw() {
		System.out.println("Draw a triangle with base"+base+"and Height"+height);
	}
	
@Override
	
	public void erase() {
		System.out.println("Erase a triangle with base"+base+"and Height"+height);
	}
	
	
}
