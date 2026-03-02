package _13StaticNonstatic;
public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(3, 4, 5));
		System.out.println(mul(3, 4));
		System.out.println(add(8,9));
		System.out.println(add(90, 80, 70));
	}
	public static double mul(int a, int b) {
		return a*b;
	}
	public static double mul(int a, int b, int c) {
		return a*b*c;
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
}
