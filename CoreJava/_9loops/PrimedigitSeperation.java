package _9loops;
import java.util.Scanner;
public class PrimedigitSeperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num: ");
		int n=sc.nextInt();
		while(n!=0) {
			int digit=n%10;
			int count=0;
			for(int i=1; i<=digit; i++) {
				if(digit%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(digit);
			}
			n=n/10;
		}
		sc.close();
	}
}
