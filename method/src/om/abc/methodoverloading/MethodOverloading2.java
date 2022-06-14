package om.abc.methodoverloading;

public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      MethodOverloading2 obj=new MethodOverloading2();
      obj.square(3.5f);
      obj.square();
      obj.square(6);
	}
	/*
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
	public static void main(String[] args) {
		MethodOverloading2 obj = new MethodOverloading2();		
		obj.square(2.5f);
		obj.square();
		obj.square(5);
		*/
	
      public void square() {
    	  System.out.println("no  parameter method call");
      }
      public void square(int number){
    	  int square = number*number;
      System.out.println("method with integer argument called:"+square);
      }
      public void square(float number) {
    	  float square= number*number;
    	  System.out.println("method float argument called:"+square);
      }
      
      }
      


