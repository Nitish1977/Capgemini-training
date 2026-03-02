package _10methods;
public class Recursive2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prin(500);
	}
	public static void prin(int n) {
		if (n >= 50) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
			prin(n - 1);
		}
	}
}
