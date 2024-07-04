package ThisKeyword;

class employee{
	int id;
	String ename;
	static String company="TATA";
	
	employee(int r,String en){
		id = r;
		ename =en;
	}
	void display001() {System.out.println(id+" "+ename+" "+company);}
}
public class static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       employee e1 = new employee(101,"ujwal");
       employee e2 = new employee(201,"yadnyesh");
       e1.display001();
       e2.display001();
	}

}
