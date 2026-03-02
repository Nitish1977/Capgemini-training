package _9loops;
import java.util.Scanner;
public class EvenDigitSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0) {
			int digit;
			digit=n%10;
			if(digit%2==0) {
				System.out.println(digit);
			}
			n=n/10;
		}
		sc.close();
	}

}
