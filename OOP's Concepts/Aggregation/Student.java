package Aggregation;
class college{
	String name;
	String contact;
	String city,state,country;
	college(String name,String contact,String city,String state, String country ){
	 this.name = name;
	 this.contact=contact;
	 this.city=city;
	 this.state=state;
	 this.country=country;
	}
}
class details{
	int id;
	String sname;
	college call;
	details(int id,String sname,college call){
		this.id=id;
		this.sname=sname;
		this.call = call;
	}
	void display1() {
		System.out.print(id +"  "+sname+" ");
		System.out.println(call.name+"  "+call.contact+"  "+call.city+"  " +call.state+"  "+call.country);
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          college ad1 = new college(" KVN","8543543515","nashik","maharashtra","India");
          
         details std1 = new details(112,"ujwal",ad1);
         details std2 = new details(122,"yadnyesh",ad1);
         System.out.println("---------Student details-------");
         
         std1.display1();
         std2.display1();
	}

}
