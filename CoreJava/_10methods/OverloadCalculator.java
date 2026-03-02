package _10methods;
public class OverloadCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sub(1,2));
		System.out.println(sub(1,2,3));
		System.out.println(sub(1,2,3,4));
		System.out.println(sub(1,2,3,4,5));
		System.out.println(mul(1,2));
		System.out.println(mul(1,2,3));
		System.out.println(mul(1,2,3,4));
		System.out.println(mul(1,2,3,4,5));
		System.out.println(div(80,5));
	}
	public static int sub(int a, int b, int c) {
		int x=a-b-c;
		return x;
	}
	public static int sub(int a, int b, int c, int d) {
		int x=a-b-c-d;
		return x;
	}
	public static int sub(int a, int b, int c, int d, int e) {
		int x=a-b-c-d-e;
		return x;
	}
	public static int sub(int a, int b) {
		int x=a-b;
		return x;
	}
	public static int mul(int a, int b, int c) {
		int x=a*b*c;
		return x;
	}
	public static int mul(int a, int b, int c, int d) {
		int x=a*b*c*d;
		return x;
	}
	public static int mul(int a, int b, int c, int d, int e) {
		int x=a*b*c*d*e;
		return x;
	}
	public static int mul(int a, int b) {
		int x=a*b;
		return x;
	}
	public static int div(int a, int b) {
		int x=a/b;
		return x;
	}
}

