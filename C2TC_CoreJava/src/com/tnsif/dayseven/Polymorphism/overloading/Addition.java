package com.tnsif.dayseven.Polymorphism.overloading;

public class Addition{
	
	public void add() {
		System.out.println("Addition");
	}
	
	public int add(int a) {
		return a;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a) {
		return a;
	}
	
	public void show(int n, String name)
	{
		System.out.println(n+name);
	}
	public void show(String name, int n)
	{
		System.out.println(name+n);
	}
	

}
