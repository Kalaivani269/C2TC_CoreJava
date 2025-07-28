package com.tnsif.dayfive.MultipleInheritance.company;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Executer {

	public static void main(String[] args) {
		Person p1 = new Person("kesi", 784646464l, new Date(2004, 26, 9));
		System.out.println(p1);

		p1 = new Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new levelOneEmp("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
				"Signing Authority");
		System.out.println(p1);

	}

}
