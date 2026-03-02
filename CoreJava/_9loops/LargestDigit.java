package _9loops;
import java.util.Scanner;
public class LargestDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int large=0;
		while(n!=0) {
			int digit=n%10;
			if(digit>large) {
				large=digit;
			}
			n=n/10;
		}
		System.out.println("Largest: "+large);
		sc.close();
	}
}
