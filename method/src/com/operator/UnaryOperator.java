package com.operator;

public class UnaryOperator {

	public static void main(String[] args) {
     /*
		// TODO Auto-generated method stub
		UnaryOperator obj=new UnaryOperator();
		obj.positive(-4);
		obj.negative(5);
		obj.increment(15);
		obj.decrement(15);
		obj.Boolean(true);
	*/
		int var1=8;
		System.out.println(++var1);  //++in front is called prefix
		System.out.println(var1++);
	}
          private void positive (int a) {
        	  System.out.println("I am the operator to represent positive"+(+a));
        	  
          }
          private void negative (int b) {
        	  System.out.println("I am the operator to represent negative"+(-b));
        	  
          }
          //c=c+1  //it will increase by one
          private void increment (int c) {
        	  System.out.println("I am the operator to represent increment"+(++c));
        	  
          }
          private void decrement (int d) {
        	  System.out.println("I am the operator to represent decrement"+(--d));
        	  
          }
          private void Boolean(boolean d) {
        	  System.out.println("I am the operator to represent boolean"+(!d));
        	  
          }
          
}
