package _10methods;
public class OverloadedArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateArea(4));
		System.out.println(calculateArea(3.5));
		System.out.println(calculateArea(7,8));
	}
	public static int calculateArea(int side) {
		int area=side*side;
		return area;
	}
	public static double calculateArea(double radius) {
		double pi=3.14;
		double area=pi*radius*radius;
		return area;
	}
	public static int calculateArea(int length, int breadth) {
		int area=length*breadth;
		return area;
	}
}
