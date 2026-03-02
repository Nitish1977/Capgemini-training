package _9loops;
import java.util.Scanner;
public class SecondLargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int large=0;
		int secLarge=0;
		while(n!=0) {
			int digit=n%10;
			if(digit>large) {
				secLarge=large;
				large=digit;
			}
			else if(digit<large && secLarge<digit) {
				secLarge=digit;
			}
			n=n/10;
		}
		System.out.println(secLarge);
		sc.close();
	}
}
