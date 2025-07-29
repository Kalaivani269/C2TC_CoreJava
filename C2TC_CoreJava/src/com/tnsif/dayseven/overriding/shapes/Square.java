package com.tnsif.dayseven.overriding.shapes;

public class Square extends Shapes{
	
	public double side;
	
	public Square(double side) {
		
		this.side=side;
	}
@Override
	
	public void draw() {
		System.out.println("Draw a cicle with this radius"+side);
	}
	
	@Override
	public void erase() {
		System.out.println("erase a cicle with this radius"+side);
	}
	

}
