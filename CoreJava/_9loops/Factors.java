package _9loops;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Factors of "+n+" are ");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
