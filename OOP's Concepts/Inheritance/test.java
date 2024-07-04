package Inheritance;
class Animal{
	void eat() {System.out.println("eating...");	}
}
class dog extends Animal{void bark(){System.out.println("Barking..");}}
public class test {
	public static void main(String args[]) {
		dog d =new dog();
		d.bark();
		d.eat();
	}

}
