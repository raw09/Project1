package om.abc.methodoverloading;

public class methodoverloadingpractice {

	public static void main(String[] args) {
		System.out.println("i am firl java main");
		methodoverloadingpractice.main(3);
		methodoverloadingpractice obj=new methodoverloadingpractice();
		methodoverloadingpractice te =new methodoverloadingpractice();
		 obj.square(23f, 35); //both parameter are flote
		 te.square(88,1.2);
		 
	}
	
	// byte--short--int--flote--double
    
	//wheather we can overload the main method, 
	 	  
	public static void main(int a) {
		System.out.println("i am form programmeer main");

	}
	//instance method /nonstatic method
	//2 parameter
    //method type --square
	//data type - both having is double  
	      
	        public void square(double b, int c) {
		
		    double a=b*c;
				System.out.println("i am tryinh to do multiplication"+ a);
}
	       //non-static--no parameter 2
	       //return type- void
	       //data type -int or double
	       //method name- square
	       public void square(int b, double c) {
	    	   
	   		
			    double a=b*c;
					System.out.println("i am tryinh to do int multiplication  "  + a);
	}
}