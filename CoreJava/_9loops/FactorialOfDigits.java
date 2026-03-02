package _9loops;
import java.util.Scanner;
public class FactorialOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0) {
			int digit=n%10;
			int fact=1;
			for(int i=digit; i>=1; i--) {
				fact=fact*i;
			}
			System.out.println(digit+"!: "+fact);
			n=n/10;
		}
		sc.close();
	}
}
