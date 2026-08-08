package Method_Overriding;

public class xyz extends Test{
       void show() { // Method overload
    	   System.out.println("2");
       }
       
       public static void main(String[] args) {
		Test t=new Test();
		t.show();
		
		xyz x=new xyz();
		x.show();
	}
}
