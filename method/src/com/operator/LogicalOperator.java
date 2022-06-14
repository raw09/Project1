package com.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 //true  &  true final result
     System.out.println("both the condition is true so final result" +(5<6   &&   6>3));
	
	//false & true final result
	 System.out.println("both the condition is false so final result" +(3<6  && 1>3));
	 //true &false final result
	 System.out.println("both the condition is false so final result" +(5<6   &&   6>3));
	 //false &false final result
	 System.out.println("both the condition is false  so final result" +(7<6 && 1>3));

	
	 
	 
	 
	 System.out.println("----------------------Or condition ");
		
		
		
		//true ||  true----- final result true
		 System.out.println("both the condition is true so final result" +(7<9 ||  8>4));
		 //false  ||  true
		 System.out.println("both the condition is false so final result" +(1<3 ||1>3));
		 //true || false
		 System.out.println("both the condition is false so final result" +(5<6 ||   6>3));
		 //false  || false
		 System.out.println("both the condition is false  so final result" +(7<6   ||   1>3));

		}  
	 
	 
}
