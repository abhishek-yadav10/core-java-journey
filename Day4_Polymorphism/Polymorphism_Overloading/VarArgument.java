package Polymorphism_Overloading;

public class VarArgument {
	void show(int a){
    	System.out.println("INT Method");
    }
    
    void show(int... a) {
    	System.out.println("VariableArgument Method");
    }
    
    public static void main(String[] args) {
    	VarArgument t1=new VarArgument();
		t1.show(4,5,67,'a');
	}
}
