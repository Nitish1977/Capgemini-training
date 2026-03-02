package _9loops;
import java.util.Scanner;
public class AbundantNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n) {
			System.out.println(n+" is an abundant number");
		}
		else {
			System.out.println(n+" is not abundant number");
		}
		sc.close();
	}
}
