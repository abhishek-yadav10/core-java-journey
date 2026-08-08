package Day2_27_07;

public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Abhishek",101);
  

        System.out.println(e1.name+"\n"+ e1.id);
    }
}

// 3 Types of Constructor
// 1.Default constructor - Created by compiler;
// 2.user define but no parameter;
// 3.parametarise constructor;
