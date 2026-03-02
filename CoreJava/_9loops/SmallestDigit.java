package _9loops;
import java.util.Scanner;
public class SmallestDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int small=n%10;
		while(n!=0) {
			int digit=n%10;
			if(digit<small) {
				small=digit;
			}
			n=n/10;
		}
		System.out.println("Smallest: "+small);
		sc.close();
	}
}
