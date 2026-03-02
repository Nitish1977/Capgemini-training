package _10methods;

public class Mathematicaloperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Max(45,67,54));
		System.out.println(Prime(45));
		System.out.println(Prime(23));
		System.out.println(min(54,65,21));
		fibonacci(10);
	}
	public static int Max(int a, int b, int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	public static String Prime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return "true";
		}
		else {
			return "false";
		}
	}
	public static int min(int a, int b, int c) {
		if(a<b && a<c) {
			return a;
		}
		else if(b<c && b<a) {
			return b;
		}
		else {
			return c;
		}
	}
	public static void fibonacci(int n) {
		int a=0;
		int b=1;
		for(int i=0; i<n; i++) {
			int sum=a+b;
			System.out.println(sum+" ");
			a=b;
			b=sum;
		}
	}

}
