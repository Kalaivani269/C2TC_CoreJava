package com.tnsif.dayfour.firstpackage;

public class Person {
	
	private String personName;
	private int personAge;
	private String personCity;
	                 
	                    
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		personCity = personCity;
	}
	
	public Person() {
		System.out.println("Default constructor");
	}
	
	public Person(String PersonName,int PersonAge,String PersonCity)
	{
		System.out.println("parametrised constructor");
		this.personName=PersonName;
		this.personAge=PersonAge;
		this.personCity=PersonCity;
		
	}

}
