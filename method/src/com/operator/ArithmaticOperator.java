package com.operator;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArithmaticOperator obj=new ArithmaticOperator();
	     obj.add(2, 4);
	     obj.sub(5, 3);
	     obj.multiplication(2, 4);
	     ArithmaticOperator.division(5, 2);
	     ArithmaticOperator.modulus(9);	    

}
              // this is for add(+)
           public void add(int a,int b) {
	       System.out.println(" this is + operator test"+(a+b));
}
           //this is for (-)
           public void sub(int a,int b) {
	       System.out.println("this is - operator test "+(a-b));
}
           //this is for multip(*)
          public void multiplication(int a,int b) {
	      System.out.println(" this is * operator test "+(a*b));

}
          //this is(/) arithematic 
          public static void division( int a,int b) {
     	  System.out.println("this is /operator test "+ (a/b));  
}
          //this is for modulus (%)
          public static void modulus (int a) {
	      System.out.println("this is modulus  % operator test"+(a));
}
        

}