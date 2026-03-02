package _9loops;
import java.util.Scanner;
public class IsSpecialNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int product=1;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		int total=sum+product;
		if(total==temp) {
			System.out.println(temp+" is a special number");
		}
		else {
			System.out.println(temp+" is not a special number");
		}
		sc.close();
	}
}
