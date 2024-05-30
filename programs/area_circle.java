import java.util.*;
public class area_circle {
 public static void main(String[] args) {
    System.out.print("enter radius of a circle :");
     Scanner sc = new Scanner (System.in);
     int Radius = sc.nextInt();
     float area = 3.14f * Radius * Radius;
     System.out.println(area);
 }
    
}