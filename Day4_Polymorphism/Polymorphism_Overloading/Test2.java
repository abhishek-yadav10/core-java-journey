package Polymorphism_Overloading;

public class Test2 {
        void show(Object a){
        	System.out.println(" Object Method");
        }
        
        void show(String a) {
        	System.out.println("String Method");
        }
        
        public static void main(String[] args) {
			Test2 t1=new Test2();
			t1.show('a');
		}
}
