package Abstraction_class;

public class Scooter extends Vehicle {
     void start() {
    	 System.out.println("Scooter Start with a kick");
     }
     
     public static void main(String[] args) {
		//Vehicle v=new Vehicle();  # we can not create Vehicle class object because it is abstract class //
    	 Car c=new Car();
    	 c.start();
    	 
    	 Scooter s= new Scooter();
    	 s.start();
	}
}
