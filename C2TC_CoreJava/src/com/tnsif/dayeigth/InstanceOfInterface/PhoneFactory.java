package com.tnsif.dayeigth.InstanceOfInterface;

public class PhoneFactory {
	
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new jio();
		return null;
	}

}
