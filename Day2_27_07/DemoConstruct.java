package Day2_27_07;

public class DemoConstruct {
    String name;
    public DemoConstruct(){
       System.out.println("My name is Abhishek");  // constructor run automatically when object is made
    }

    public static void main(String[] args) {
        DemoConstruct demo =new DemoConstruct();
       demo.name="Abhi";
        
    }
}
