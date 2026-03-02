package _9loops;
import java.util.Scanner;
public class DigitsSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nnum: ");
		int n=sc.nextInt();
		while(n!=0) {
			int digit=n%10;
			System.out.println(digit);
			n=n/10;
		}
		sc.close();
	}

}
