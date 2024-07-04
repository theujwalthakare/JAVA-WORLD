package Aggregation;

class book{
	int bookID;
	String BName;
	double price;
	book(int bookID,String BName, double price){
		this.bookID= bookID;
		this.BName =BName;
		this.price = price;
	}
}
class member{
	int mid;
	String  mname;
	book b;
	member(int mid, String mname,book b){
		this.mid=mid;
		this.mname =mname;
		this.b = b;
	}
	void display() {
		//System.out.print(mid+"\t\t"+mname+"\t\t"+b);
		System.out.println(mid+"\t\t"+mname+"  "+b.bookID+"\t\t"+b.BName+"\t\t"+b.price);
	}
}
public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        book al = new book(111,"English",980.0);
        book al2 = new book(122,"Maths",290.34);
        
        member m1 = new member(101,"Rahul",al);
        member m2 = new member(121,"Manish",al2);
         
        m1.display();
        m2.display();
	}

}
