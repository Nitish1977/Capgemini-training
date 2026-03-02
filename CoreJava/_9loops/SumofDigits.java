package _9loops;
import java.util.Scanner;
public class SumofDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num: ");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum of digits: "+sum);
		sc.close();
	}
}
