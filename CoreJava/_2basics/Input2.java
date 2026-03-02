package _2basics;
import java.util.Scanner;
public class Input2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("Enter a number between 1 and 10: ");
		do {
			n=sc.nextInt();
			if(n<1 || n>10) {
				System.out.print("you number is not between 1 and 10");
			}
		}while(n<=1 || n>10);
		System.out.println("thanks");
		sc.close();
	}
}
