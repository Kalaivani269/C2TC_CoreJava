package day1;

public class PrimitiveDatatypes {
	public static void main(String[] args) {
		//byte (1 byte)
		byte bytemax = 127;
		byte bytemin = -128;
		
		System.out.println("Min range of byte is" +bytemin);
		System.out.println("Max range of byte is "+bytemax);
		
		//short(2 bytes)
		short shortmax = 32767;
		short shortmin = -32768;
		System.out.println("Minshort range of byte is" +shortmin);
        System.out.println("Maxshort range of byte is "+shortmax);
		
		//int (4bytes)
		int intmax = 2147483647;
		int intmin = -2147483648;
		System.out.println("intmin range of byte is" +intmin);
		System.out.println("intmax range of byte is "+intmin);
		
		//long (8bytes)
		long Longmax = 9223372036854775807L;
		long Longmin = -9223372036854775808L;
		
		System.out.println("Minlong range of byte is" +Longmin);
		System.out.println("Maxlong range of byte is "+Longmax);
		
		float f=3234.141243278345f;
		System.out.println("float value is "+f);
		double d=3456.14124512345678902345678914f;
		System.out.println("double value is "+d);
		
	
		boolean b=false;
		System.out.println("boolean value is "+b);
	}

}
