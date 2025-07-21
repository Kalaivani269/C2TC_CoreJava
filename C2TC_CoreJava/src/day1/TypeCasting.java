package day1;

public class TypeCasting {
	public static void main(String[] args) {
		// widening (implicit type casting)
		
		byte a = 11; 
		int ark = a; //4 bytes
		System.out.println(ark);
		
		float tree = 12.09f;	// 4 bytes
		double b = tree;		// 8 byteas
		System.out.println(b);
		
		char ch1 = 'A';	// 2 bytes
		int car = ch1;	// 4 bytes
		System.out.println(car);
		
		char var = '\u00A7';
		int c = var;
		System.out.println(c);
		
		// narrowing (explicit type casting)

		double flow = 10.52f;	
		long lon = (long) flow;
		System.out.println(lon);

		long lan = 923372036854775806l;
		int kit = (int)45;
		System.out.println(kit);

		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 90;
		char u = (char) b1;
		System.out.println(u);
	}
}
