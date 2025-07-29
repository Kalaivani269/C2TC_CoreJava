package com.tnsif.dayseven.overriding.shapes;

public class Circle extends Shapes{
	
	public double radius;
	
	public Circle(double radius) {
		
		this.radius=radius;
	}
	
	@Override
	
	public void draw() {
		System.out.println("Draw a cicle with this radius"+radius);
	}
	
	@Override
	public void erase() {
		System.out.println("erase a cicle with this radius"+radius);
	}
	
	

}
