package _9loops;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
		sc.close();
	}
}
