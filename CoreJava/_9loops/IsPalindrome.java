package _9loops;
import java.util.Scanner;
public class IsPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
		sc.close();
	}
}
