package _10methods;
import java.util.Scanner;
public class MEthod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		numberReport(n);
		sc.close();
	}
	public static int rev(int n) {
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
	public static boolean Ispalindrome(int n) {
		int rev=0;
		int temp=n;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(rev==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isStrong(int n) {
		int temp=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			int fact=1;
			for(int i=digit; i>=1; i--) {
				fact=fact*digit;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int countPrimeDigits(int n) {
		int total=0;
		while(n!=0){
			int digit=n%10;
			int count=0;
			for(int i=1; i<=digit; i++) {
				if(digit%i==0) count++;
			}
			if(count==2) {
				total++;
			}
			n=n/10;
		}
		return total;
	}
	public static void numberReport(int n) {
		System.out.println(rev(n));
		System.out.println(Ispalindrome(n));
		System.out.println(isStrong(n));
		System.out.println(countPrimeDigits(n));
	}
}
