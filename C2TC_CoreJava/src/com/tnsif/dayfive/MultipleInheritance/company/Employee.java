package com.tnsif.dayfive.MultipleInheritance.company;
import java.util.Date;
public class Employee extends Person {

	private String dept;
	private long basesalary;
	
	//public Employee() {}
	
	 public Employee(String name,long contactno,Date DOB,String dept,long basesalary) {
		 super(name,contactno,DOB);
	 }

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(long basesalary) {
		this.basesalary = basesalary;
	}

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", basesalary=" + basesalary + "]";
	}
  

}
