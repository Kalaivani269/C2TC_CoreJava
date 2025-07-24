package com.tnsif.dayfour.firstpackage;

public class Executer {

	public static void main(String[] args) {
		
          Base base= new Base();
          
          base.methodDefault();
          base.methodProtected();
          base.methodPublic();
          
          base.varDefault=21;
          base.methodDefault();
          
          base.varProtected=90;
          base.methodProtected();
          
        //  base.varPrivate=88;
        //  base.methodPrivate();
          
          base.varPublic=67;
          base.methodPublic();
          
          System.out.println(base instanceof  Base);
          
		
	}

}
