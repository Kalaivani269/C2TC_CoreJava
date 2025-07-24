package daythree.Scanner;
import java.util.Scanner;
public class PersonDemo {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		System.out.println("Enter the gender:");
		String gender=sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter the income:");
		int income=sc.nextInt();
		
		System.out.println("Enter the Tax:");
		int tax=sc.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setTax(tax);
		
		System.out.println(person);
		
		System.out.println(" ");
		
		
		TaxCalculation cal = new TaxCalculation();
		 cal.TaxCalculation(person);
		 System.out.println("after the personal interest");
		 System.out.println(person);	
	}

}
