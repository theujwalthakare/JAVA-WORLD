import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an number to check it is even or odd :");
        int num =sc.nextInt();
        if (num % 2==0) {
            System.out.println("Given number "+num +" is Even");
        }
        else{
            System.out.println("Given number "+num +" is Odd");
        }
    }
}
