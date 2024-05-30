import java.util.*;
public class User_input {
<<<<<<< HEAD
    public static void main(String arg[]){
=======
    public static void main(String[] arg){
>>>>>>> 60503e743be6b01c21fe07bcbadd051562823224
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
