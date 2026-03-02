package _10methods;
public class Recursivefunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}
	public static void print(int n) {
		System.out.println(n);
		if(n==1000) {
			System.out.println( 1000);
		}
		else {
			print(n+1);
		}
		
	}
}
