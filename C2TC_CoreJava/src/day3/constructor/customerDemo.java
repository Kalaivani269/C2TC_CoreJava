package day3.constructor;
import java.util.Scanner;
public class customerDemo {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the Id");
	int id=sc.nextInt();
	
	sc.nextLine();
	System.out.println("Enter the name");
	String name=sc.nextLine();
	
	System.out.println("Enter the City");
	String city=sc.nextLine();
	
	customer c1= new customer();
	c1.setCustomerId(id);
	c1.setCustomerName(name);
	c1.setCustomerCity(city);
	System.out.println(c1);
	
	
	customer c2 = new customer();
	
	System.out.println("Enter the Id");
	 id=sc.nextInt();
	 
	 sc.nextLine();
	System.out.println("Enter the name");
	 name=sc.nextLine();
	
	System.out.println("Enter the City");
	 city=sc.nextLine();
	
	System.out.println(c2);	
	}
	
	

}
