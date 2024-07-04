package Polymorphism;
class playSport{
	String name;
	void play() {
		System.out.println("player are playing...");
		// String name= "player playing";
		//System.out.println(name);
	}
}
class Football extends playSport{
	
	void play() {
		System.out.println("playing Football..");
	}
}
class Basketball extends playSport{
	void play() {
		System.out.println("playing Basketball");
	}
}
class Rugby extends playSport{
	void play() {
		System.out.println("playing Rugby");
	}
}
public class sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       playSport football = new Football();
       
       football.play();
	}

}
