package com.tnsif.daysix.StatiVariable;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		
		Employee e= new Employee("kalai",768);
		System.out.println(e);
		
		e=new Employee("anu",655);
		System.out.println(e);
		
	}

}
