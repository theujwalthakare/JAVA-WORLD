package ThisKeyword;

class Z{
	Z(){
		this(5);
		System.out.println("hello a");
	}
	Z(int x){
		System.out.println(x);
	}
}
public class test4 {
    public static void main(String args[]) {
    	Z  x= new Z();
    }
}
