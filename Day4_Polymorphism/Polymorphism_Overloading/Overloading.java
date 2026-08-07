package Polymorphism_Overloading;

public class Overloading {
     void show() {
    	 System.out.println("1");
     }
     
     void show(int a) {
    	 System.out.println("2");
     }
     
     public static void main(String[] args) {
		Overloading test1= new Overloading();
		test1.show();
		test1.show(5);
		
	}
}
