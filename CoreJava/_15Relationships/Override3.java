package _15Relationships;
class Shape{
	double area;
	public double calculateArea(double a, double d) {
		area=0;
		return area;
	}
}
class Circle extends Shape{
	double area;
	@Override
	public double calculateArea(double r, double pi) {
		area=pi*r*r;
		return area;
	}
}
class Rectangle extends Shape{
	double area;
	@Override
	public double calculateArea(double l, double b) {
		area=l*b;
		return area;
	}
}
class Triangle extends Shape{
	double area;
	@Override
	public double calculateArea(double b, double h) {
		area=1/2*b*h;
		return area;
	}
}
public class Override3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a=new Circle();
		System.out.println("Circle: "+a.calculateArea(3, 4));
		Rectangle b=new Rectangle();
		System.out.println("Rectangle: "+b.calculateArea(5, 3.14));
		Triangle c=new Triangle();
		System.out.println("Triangle: "+c.calculateArea(6, 8));
		Shape d=new Shape();
		System.out.println("default: "+d.calculateArea(19, 45));
	}
}
