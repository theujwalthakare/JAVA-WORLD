package ThisKeyword;
class Student{
	int rollno;
	String name;
	float fee;
	
	Student(int rollno, String name, float fee){
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	void sdisplay(){
		System.out.println(rollno+" "+name+" "+fee);
	}
}

public class test {
     public static void main(String args[]) {
    	 Student S1 =new Student(111,"ankit",5000f);
    	 Student S2 =new Student(112,"rahul",6000f);
    	 S1.sdisplay();
    	 S2.sdisplay();
     }
}
