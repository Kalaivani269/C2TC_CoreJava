package com.tnsif.dayfour.firstpackage;

public class Base {
	
	int varDefault=10;
	private int varPrivate=20;
	protected int varProtected=30;
	public int varPublic=40;
	
 void methodDefault(){
		System.out.println("default can access base");
		System.out.println("Default variabe-"+varDefault);
	}
 
 private void methodPrivate() {
	 
	 System.out.println("private can access base");
		System.out.println("private variabe-"+varPrivate);
 }
 
 protected void methodProtected() {
	 System.out.println("Protected can access base");
		System.out.println("Protected variabe-"+varProtected);
 }
 public void methodPublic() {
	 System.out.println("Public can access base");
		System.out.println("Public variabe-"+varPublic);
		
		
 }
}

