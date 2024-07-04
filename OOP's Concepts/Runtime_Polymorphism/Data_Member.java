package Runtime_Polymorphism;
class Bike{
	int speedlimit = 90;
}
class Honda extends Bike{
	int speedlimmit=150;
}
public class Data_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike obj ;
     obj = new Honda();
     System.out.println(obj.speedlimit);
	}
// it means runtime Polymorphism is only workable on class methods and not apply on class instances
}
