package ThisKeyword;
class STUDENT21{
	int rollno;
	String name, course;
	float fee;
	STUDENT21(int rollno, String name, String course)
	{
		this.rollno =rollno;
		this.name = name;
		this.course =course;
	}
	STUDENT21(int rollno, String name, String course,float fee){
		this(rollno,name,course);
		this.fee =fee;
	}
	void show(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
public class test5{

	public static void main(String[] args) {
		STUDENT21 S01 = new STUDENT21(111,"Yadnyesh","Java",9000f);
		STUDENT21 S02 = new STUDENT21(111,"ujjwal","Java");
		
		S01.show();
		S02.show();

	}

}
