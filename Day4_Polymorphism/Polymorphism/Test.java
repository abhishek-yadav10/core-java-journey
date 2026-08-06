package Polymorphism;
// Can we overload main Method.......??????
public class Test {
    public static void main(String[] args) {
    	System.out.println("1");
		Test t1=new Test();
		t1.main(22);
		
	}
    public static void main(int a) {
		System.out.println("2");
	}
}
