package ThisKeyword;
class C{
	C(){
		System.out.println("Hello a");
	   }
	C(int x){
		this();
		System.out.println(x);
		}
}
public class test3 {
  public static void main(String args[]) {
	  C b =new C(10);
  }
}