package final_keyword;
public class final_method {
	final int speed_limit = 90; //final variable
	void run() {
		//speed_limit =400; // gives compile error
	    System.out.println("speedlimit is "+speed_limit);
	}
	   public static void main(String args[]) {
       
    	new final_method().run();
    }
}
