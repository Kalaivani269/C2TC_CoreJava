package com.tnsif.dayfive.singleInheritance;

public class Student extends Citizen{
	
        private String collegename;
        private int rollno;
        
       public Student(){
        	super();
        }
	public Student(String name,String aadharNo,String address,long phno,String collegename,int rollno){
		super(name,aadharNo,address,phno);
		this.collegename=collegename;
		this.rollno=rollno;	
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", rollno=" + rollno + "]";
	}
	

}
