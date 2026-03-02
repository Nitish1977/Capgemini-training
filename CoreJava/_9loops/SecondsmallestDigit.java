package _9loops;
import java.util.Scanner;
public class SecondsmallestDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int small=n%10;
		int secSmall=n%10;
		while(n!=0) {
			int digit=n%10;
			if(digit<small) {
				secSmall=small;
				small=digit;
			}
			else if(digit>small && digit<secSmall) {
				secSmall=digit;
			}
			n=n/10;
		}
		System.out.println(secSmall);
		sc.close();
	}
}
