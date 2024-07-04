package Aggregation;
class  Address{
	String city, state, country;
	Address(String city, String state, String country){
		this.city =city;
		this.state =state;
		this.country =country;
	}
}
class employee{
	  int id;
	  String name;
	  Address adress;
	  employee(int id, String name, Address adress){
		  this.id =id;
		  this.name =name;
		  this.adress=adress;
	  }
	  void display() {
		  System.out.println(id+" "+name);
		  System.out.println(adress.city +" "+adress.state+" "+adress.country);
	  }
}
public class emp {
  public static void main(String args[]) {
	  Address add1 =new Address("gzb","UP","Inida");
	  Address add2 =new Address("mha","NT","Inida");
	  employee e =new employee(111,"varun",add1);
	  employee e2 = new employee(112, "rahul",add2);
	  e.display();
	  e2.display();  
  }
}
