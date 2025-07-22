package day2;

public class ForEachLoop {
	public static void main(String[] args) {
        // int type
        int arr[]={10,20,30,40,50,60};
        for(int array:arr){
            System.out.print(array+" ");
        }
        System.out.println(" ");
        // character type
        char ch[] = {'a','b','c','d'};
        for(char alph:ch){
            System.out.print(alph);
        }
        
        System.out.println(" ");
        
        // String type
        String str[]={"java","programming"};
        for(String s:str){
            System.out.print(s);
        }
        }
}
