package Inheritance;
import java.util.*;
class player{
	int Rollno;
	String Pname;
}
class marks extends player{
	float marks;
}
class sport extends marks{
	String sport;
	int point;
	void details() {
		//this.Rollno =Rollno;
		//this.Pname=Pname;
		//this.marks=marks;
		//this.sport =sport;
		//this.point =point;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rollno : ");
		Rollno =  scan.nextInt();
		System.out.println("Enter player name : ");
		Pname = scan.next();
		System.out.println("Enter marks : ");
		marks = scan.nextFloat();
		System.out.println("Enter sport name : ");
		sport = scan.next();
		System.out.println("Enter score points : ");
		point = scan.nextInt();
	}
	void display01() {
		System.out.println(Rollno +"\t"+Pname +" \t\t"+marks +"  \t"+ sport +"\t"+point );
	}
}
public class test2 {
   public static void main(String args[]){
	   sport s1 = new sport();
	   s1.details();
	   System.out.println("Rollno \t"+"Player_Name "+"\tMarks "+" \tSport"+"\t\tScore_Point");
	   s1.display01();
   }
}
