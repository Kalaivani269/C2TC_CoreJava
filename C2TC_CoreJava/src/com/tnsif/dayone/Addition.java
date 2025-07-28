package com.tnsif.dayone;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the values:");
		a = sc.nextInt();
		b = sc.nextInt();
		c=a+b;
		System.out.println("Addition of"+" a="+ a+" b="+ b+" is "+ c);
		
	}

}
