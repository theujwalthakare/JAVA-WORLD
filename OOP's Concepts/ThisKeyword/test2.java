package ThisKeyword;
class A{
	void m() {System.out.print("Hello m");}
    void n() {
    	System.out.println("hello n");
    	this.m();
    }
}
public class test2 {
   public static void main(String args[]) {
	   A v = new A();
	   v.n();
	 }
}
