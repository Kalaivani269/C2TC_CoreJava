package com.tnsif.dayseven.overriding.shapes;

public class ShapeDemo {

	public static void main(String[] args) {
	  
		Shapes[] shapes=new Shapes[3];
		
		shapes[0]=new Circle(5.0);
		shapes[1]=new Triangle(6.3,3.2);
		shapes[2]=new Square(3.2);
		
		for (Shapes shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}
		

	}

}
