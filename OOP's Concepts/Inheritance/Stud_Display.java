package Inheritance;
class Student{
	int rollno;
	String name;
   // void Student(int rollno, String name){
	///	this.rollno = rollno;
		//this.name = name;
	}

class Mark extends Student{
   String subject;
   int marks;
  void add(int rollno,String name, String subject,int marks){
	   this.rollno=rollno;
	   this.name=name;
	   this.marks =marks;
	   this.subject =subject;
   }
   void  displayMarks() {
	   
	   System.out.println(rollno+"\t"+name+"\t"+subject +"\t"+marks+"\t");
   }
}
public class Stud_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rollno "+ "  Name "+" Subject \t"+"Marks");
		Mark s1 = new Mark();
		s1.add(101, "ujwal", "java", 80);
		s1.displayMarks();
	}

}
