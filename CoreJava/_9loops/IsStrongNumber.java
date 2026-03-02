package _9loops;
import java.util.Scanner;
public class IsStrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			int fact=1;			
			for(int i=digit; i>=1; i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number");
		}
		else {
			System.out.println(temp+"  is not a strong number");
		}
		sc.close();
	}
}
