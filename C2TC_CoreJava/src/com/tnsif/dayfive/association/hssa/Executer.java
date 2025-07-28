package com.tnsif.dayfive.association.hssa;

public class Executer {
	
	public static void main(String[] args) {
		Address address = new Address("kalaivani",269,23);
		Person person = new Person("Aniket Pawar", address);
		person.displayInfo();
	}

}
