package Runtime_Polymorphism;
class Animal{
	void eat() {System.out.println("Eating");}
}
class Dog extends Animal{
	void eat() {System.out.println("Eating bread....");}
}
class Cat extends Animal{
	void eat() {System.out.println("Eating mouse...");}
}
class Lion extends Animal{
	void eat() {System.out.println("Eating Meat...");}
}
public class Test_Animal {
   public static void main(String args[]) {
	   Animal a;
	   a = new Dog();
	   a.eat();
	   a = new Cat();
	   a.eat();
	   a = new Lion();
	   a.eat();
   }
}
