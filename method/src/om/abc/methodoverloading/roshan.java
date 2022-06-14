package om.abc.methodoverloading;

public class roshan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         roshan obj=new roshan();
         obj.multiplicatin(5, 3);
		obj.multiplicatin(2, 3);
		obj.multiplicatin(4, 6);
		obj.multiplicatin(7, 8, 9);
	
	}
	   public static void main(int a) {
		System.out.println("i am prog");
	
}
         public void multiplicatin (double b,int c) {
   
    	
    	 System.out.println("i am trying to b,c multiplication");
}
         public void multiplicatin (int b,int c) {
    	
    	 System.out.println("i am trying to c multiplication");
}
         public void multiplicatin (int b,double c ,long d) {
        	 
        	 System.out.println("i am trying to cb multiplication");
    }
         public void multiplicatin (int b,double c) {
        	   
         	
        	 System.out.println("i am trying to multiplication");
    }
}