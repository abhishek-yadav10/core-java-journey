package Day2_27_07;
import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Age");
        int Age=sc.nextInt();

        if(Age==18 || Age>18){
            System.out.println("Old enough to vote!");
        }else{
            System.out.println("Not, old enough to vote!");
        }
        
   sc.close(); }
    
}
