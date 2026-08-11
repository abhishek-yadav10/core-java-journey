package Static;

public class StaticBlockDemo {
   static
   {
	   System.out.println("I am in Static Block");
	   System.exit(0);
   }
   
   public static void main(String[] args) {
	System.out.println("i am in main block");
}
   
}
