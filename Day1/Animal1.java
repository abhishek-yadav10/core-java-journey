
//  Initalizing Obj using
//  Methods;
public class Animal1 {
    String color;
    int age;

    public void initAnimal(String a, int b){
        color=a;
        age=b;
    }

   void Display(){
    System.out.println(color+" "+age);
   }

   public static void main(String[] args) {
    Animal1 Buzo= new Animal1();
    Buzo.initAnimal("Black", 5);
    Buzo.Display();







    
    
   }
}
