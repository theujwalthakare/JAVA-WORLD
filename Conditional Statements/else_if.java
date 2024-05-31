import java.util.*;
public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if(age <= 10){
              System.out.println("Child");
        }
        else if(age >= 11 && age <=20){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Old age");
        }
    }
}
