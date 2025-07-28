package com.tnsif.dayfive.MultipleInheritance.company;
import java.util.Date;

public class Person {
	
	private String name;
	private long contactno;
	private Date DOB;
	
	public Person(String name,long contactno,Date DOB) {
		super();
		this.name=name;
		this.contactno=contactno;
		this.DOB=DOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contactno=" + contactno + ", DOB=" + DOB + "]";
	}
	

}
