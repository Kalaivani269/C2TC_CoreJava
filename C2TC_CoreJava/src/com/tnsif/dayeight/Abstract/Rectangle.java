package com.tnsif.dayeight.Abstract;

public class Rectangle extends Shapes {
	
	private float width, height;

	public Rectangle() {
		width = 5.0f;
	    height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}
	

}


