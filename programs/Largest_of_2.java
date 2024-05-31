import java.util.*;
public class Largest_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("Largest Number is :"+num1);
        }
        else{
            System.out.println("Largest Number is :"+num2);
        }
    }
}
