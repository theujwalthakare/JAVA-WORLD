package Polymorphism;
class vehicals{
	void speedup() {
		System.out.println("Measures of speed up");
	}
}
class Cars extends vehicals{
	void speedup() {System.out.println("Car speed is 150 km/hr");}
}
class Bicycle extends vehicals{
	void speedup() {System.out.println("Bycicle speed is 80 km/hr");}
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     vehicals v1 = new vehicals();
     Cars c1 =new Cars();
     Bicycle b1 = new Bicycle();
       v1.speedup();
       c1.speedup();
       b1.speedup();
	}
}
