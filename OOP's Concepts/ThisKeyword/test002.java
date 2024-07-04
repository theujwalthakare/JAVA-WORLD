package ThisKeyword;
class STUDENT1{
	int rollno;
	String name, course;
	float fee;
	STUDENT1(int rollno, String name, String course)
	{
		this.rollno =rollno;
		this.name = name;
		this.course =course;
	}
	STUDENT1(int rollno, String name, String course,float fee){
		this(rollno,name,course);
		this.fee =fee;
	}
	void show(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
public class test002 {

	public static void main(String[] args) {
		STUDENT1 S01 = new STUDENT1(111,"Yadnyesh","Java",9000f);
		STUDENT1 S02 = new STUDENT1(111,"ujjwal","Java");
		
		S01.show();
		S02.show();

	}

}
