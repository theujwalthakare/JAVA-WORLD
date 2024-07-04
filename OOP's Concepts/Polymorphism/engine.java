/* 11. Write a Java program to create a base class Vehicle with methods 
 * startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. 
 * Override the startEngine() and stopEngine() methods in each subclass 
 * to start and stop the engines differently.
 */
package Polymorphism;
class Vehicle{
   void startEngine() {}
   void stopEngine() {}
}
class car extends Vehicle{
	void startEngine() {
		System.out.println("Car Engine start when key is on ");
	}
	void stopEngine() {
		System.out.println("Car stops at key turn off..");
	}
}
class motorcycle extends Vehicle{
	void startEngine() {
		System.out.println("Motorcycle start when key is on and gear is nutral ");
	}
	void stopEngine() {
		System.out.println("Motorcycle stops at key turn off..or relase on cluch");
	}
}
public class engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle c1 = new car();
      Vehicle m1 = new motorcycle();
      c1.startEngine();
      c1.stopEngine();
      m1.startEngine();
      m1.stopEngine();
	}

}
