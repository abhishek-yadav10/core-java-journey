package Static;

public class Employee {
    int empId;
    String name;
    String company;
    
    void diplay() {
    	System.out.println(empId+" "+name+" "+company);
    	
    }
    
	public Employee(int empId, String name, String company) {
		super();
		this.empId = empId;
		this.name = name;
		this.company = company;
	}

	public static void main(String[] args) {
		Employee E1=new Employee(101,"Abhi","Tcs");
		E1.diplay();
		
		Employee E2=new Employee(102,"Ram","Tcs");
		E2.diplay();
		
	}
}
