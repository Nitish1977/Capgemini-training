package _10methods;
public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add3(1,2,3);
		mul3(3,4,5);
		sub4(9,2,1,3);
		System.out.println(add2(56,76));
	}
	public static void Add3(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void mul3(int a, int b, int c) {
		int pro=a*b*c;
		System.out.println(pro);
	}
	public static void sub4(int a, int b, int c, int d) {
		int sub=a-b-c-d;
		System.out.println(sub);
	}
	public static int add2(int a, int b) {
		int add=a+b;
		return add;
	}
}
