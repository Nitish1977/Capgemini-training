package _9loops;
import java.util.Scanner;
public class Primenumberinn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0;
		for(int i=1; i<n; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				total++;
			}
		}
		System.out.println("no.of primes less than n are "+total );
		sc.close();
	}
}
