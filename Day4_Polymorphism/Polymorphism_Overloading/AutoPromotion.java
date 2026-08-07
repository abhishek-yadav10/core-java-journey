package Polymorphism_Overloading;

public class AutoPromotion {
    void show(int a) {
    	System.out.println("int method");
    }
    
    void show(String a) {
    	System.out.println("String method");
    }
    
    public static void main(String[] args) {
		AutoPromotion T=new AutoPromotion();
		T.show('a');
	}
}
 
//  This is program to show Automatic promotion
// while calling a method when we give some different  data type, then it Auto-Converts converts to the data type present in the code 