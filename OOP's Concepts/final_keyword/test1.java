package final_keyword;
class Bike1{  
	  final void run() {System.out.println("runnning");}
}
class test1 extends Bike1{
	public static void main(String args[]){  
	new test1().run();
	}
 
}