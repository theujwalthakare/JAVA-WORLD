package Runtime_Polymorphism;
class Shape{
	void draw() {System.out.println("Drawing");}
}
class Rectangle extends Shape{
	void draw() {System.out.println("drawing rectangle..");}
}
class circle extends Shape{
	void draw() {System.out.println("drawing Circle..");}
}
public class Test_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape S;
		S = new Rectangle();
		S.draw();
		S= new circle();
		S.draw();
		
		

	}

}
