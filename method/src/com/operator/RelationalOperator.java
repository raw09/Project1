package com.operator;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperator obj=new RelationalOperator();
		obj.greatherthan(5, 2);
		obj.lessthan(2, 5);
		obj.equalto(5, 5);
		obj.greatherthanequalto(9, 6);
		obj.lessthanequalto(6, 9);
		obj.notequalto(9, 6);

	}
     public void greatherthan(int a, int b) {
    	 System.out.println("a is greather than b ? "+(a>b));     //9>4
     }
     public void lessthan(int a, int b) {
    	 System.out.println("a is  lessthan b ? "+(a<b));     //9<4
     }
     public void equalto(int a, int b) {
    	 System.out.println("a is equalto b ? "+(a==b));     //9==4
     }
     //now greatherthan equal to & lessthan equal to & not equal to
     //>= ,<=, !=
     
      public void greatherthanequalto(int a, int b) {
    	  System.out.println("a is gteather than equal to b");  //9>=6
      }
      public void lessthanequalto(int a, int b) {
    	  System.out.println("a is less than equal to b");    //6<=9
      }
      public void notequalto(int a, int b) {
    	  System.out.println("a is not equal to b");         //9!=6
      }
      
   
      
}
