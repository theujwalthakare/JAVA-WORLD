package Inheritance;
import java.util.*;
class player01{
	int Rollno;
	String Pname;
}
class marks1 extends player{
	float marks;
	void details(int Rollno, String Pname,float marks) {
	   this.Rollno = Rollno;
		this.Pname = Pname;
		this.marks = marks;
	}
	void display() {
		System.out.println("----display Marks information ----\n");
		System.out.println("Rollno "+"\t"+ "Pname "+"\t"+ "Marks");
		System.out.println(Rollno +"\t"+ Pname +"\t"+ marks);
		System.out.println("\n");
	}
		
}
class sport1 extends player01{
	String sport;
	int point;
	void details(int Rollno, String Pname,String sport,int point) {
		this.Rollno = Rollno;
		this.Pname = Pname;
		this.sport = sport;
		this.point = point;
		
	}
	void display() {
		System.out.println("----display Sport information ----\n");
		System.out.println("Rollno "+"\t"+ "Pname "+"\t"+ "sport" +"\t"+"point");
		System.out.println(Rollno +"\t"+ Pname +"\t"+ sport +"\t"+point);
		System.out.println("\n");
	}
}
public class hierachical {
   public static void main(String args[]) {
	   int ch;
	   System.out.println("Player Marks information");
	   System.out.println("player Sport information");
	   System.out.println("Enter Your Choise :");
	   Scanner sc =new Scanner(System.in);
	   ch = sc.nextInt();
	  
	   switch(ch) {
	   case 1:marks1 m1 = new marks1();
	   m1.details(102, "yadnyesh",90);
	   m1.display();
	      break;
	   case 2:sport1 p1 = new sport1();
	   p1.details(101, "ujwal", "football", 9);
	   p1.display();
	      break;
	   default:System.out.println("Invalid input...");
	      break;
	   }
   }
}
