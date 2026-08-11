package Static;

public class Employee2 {
    int empId;
    String name;
   static String company="Wipro";
    
    void diplay() {
    	System.out.println(empId+" "+name+" "+company);
    	
    }
    
	public Employee2(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		
	}

	public static void main(String[] args) {
		Employee2 E1=new Employee2(101,"Abhi");
		E1.diplay();
		
		Employee2 E2=new Employee2(102,"Ram");
		E2.diplay();
		
	}
}
