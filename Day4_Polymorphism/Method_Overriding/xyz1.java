package Method_Overriding;

public class xyz1 extends Test1{
       String show() { // Method overload
    	   System.out.println("2");
    	   return null;
       }
       
       public static void main(String[] args) {
		Test1 t=new Test1();
		t.show();
		
		
		xyz1 x=new xyz1();
		x.show();
	}
}
