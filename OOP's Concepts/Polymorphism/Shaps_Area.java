package Polymorphism;
class Shape{
	double calculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	private double radius;
	Circle(double radius){
		this.radius =radius;
	}
	double calculateArea() { 
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape{
	private double height, width;
	Rectangle(double height,double width){
		this.height =height;
		this.width =width;
	}
	double calculateArea() {
		return height*width;
	}
}
class Triangle extends Shape{
	private double bredth;
	private double height;
	Triangle(double bredth,double height){
		this.bredth =bredth;
		this.height = height;
	}
	double calculateArea() {
		return  0.5* bredth*height; 
		
	}
}

public class Shaps_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Circle c1 = new Circle(4);
       Rectangle r1 = new Rectangle(123,23);
       Triangle t1 = new Triangle(15, 12.5);
      System.out.println("Area of Circle is : "+c1.calculateArea());
      System.out.println("Area of Rectangle is : "+r1.calculateArea());
      System.out.println("Area of Rectangle is : "+t1.calculateArea());
	}

}
