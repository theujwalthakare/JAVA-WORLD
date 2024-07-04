package Polymorphism;

class Animal{
	void MakeSound() {System.out.println("Animal mak Sound");}
}
class birds extends Animal{
	void MakeSound() {
		System.out.println("The birds are chirps");
	}
}
class cat extends Animal{
	void MakeSound() {
		System.out.println("The cat are meeow");
	}
}
public class TestOver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A = new Animal();
		birds B = new birds();
		cat C = new cat();
      A.MakeSound();
      B.MakeSound();
      C.MakeSound();
	}

}
