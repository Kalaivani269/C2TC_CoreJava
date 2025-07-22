package day2;

public class NestedIfloop {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c=12;
		
	 if(a>b) {
		 if(a>c) {
			 System.out.println("a is greter"+ a);
		 }
		 else {
			 System.out.println("c is greater"+c);
		 }
		}
	 else {
		 if(b>a) {
			 System.out.println("b is greater"+ b);
		 }
		 else {
			 System.out.println("a is greater"+a);
		 }
	 }
}
}