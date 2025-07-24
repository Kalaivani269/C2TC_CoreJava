package com.tnsif.dayfour.firstpackage;
import java.util.Scanner;
public class PersonDemo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Name , Age and Cityname:");
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String city=sc.nextLine();
		
		Person person = new Person();
		person.setPersonName(name);
		person.setPersonAge(age);
		person.setPersonCity(city);
		
		System.out.println("Name:"+person.getPersonName()+
				"Age:"+person.getPersonAge()+"City:"+ person.getPersonCity());
		
		System.out.println("------------------------------");
		
		System.out.println("Name,Age and Cityname:");
	     age=sc.nextInt();
		sc.nextLine();
		 city=sc.nextLine();
		 
		 person=new Person( name,age, city); {
			 
			 System.out.println("Name:"+person.getPersonName()+
						"Age:"+person.getPersonAge()+"City:"+ person.getPersonCity()); 
		 
		 }

		
	}

}
