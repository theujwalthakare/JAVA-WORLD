import java.util.*;
public class User_input {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your string :");
        // for single string input:->
        String name = sc.next();
        System.out.println(name);  
       
       // for multiple line input :->

       String Multiline = sc.nextLine();
       System.out.println(Multiline); 

       // for integer inout:->
       int number = sc.nextInt();
       System.out.println(number); 
       
       // for floting input :->
       float num = sc.nextFloat();
       System.out.println(num);   
    }

}
