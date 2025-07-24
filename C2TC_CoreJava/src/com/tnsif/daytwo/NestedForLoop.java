package day2;

public class NestedForLoop {
	public static void main(String[] args) {
		int s=10;
		for(int i=0; i<10;i++) {
			for(int j=0; j<10;j++) {
				if(s%2==0)
				s++;
			}
			
		}
		System.out.println(s);
	}

}
