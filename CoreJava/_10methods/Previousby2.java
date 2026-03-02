package _10methods;
import java.util.Scanner;
public class Previousby2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("nter first: ");
		int first=sc.nextInt();
		System.out.print("nter second: ");
		int second=sc.nextInt();
		System.out.print("k: ");
		int k=sc.nextInt();
		System.out.print("n: ");
		int n=sc.nextInt();
		System.out.print(first+" ");
		System.out.print(second+" ");
		int hu;
		int m=1;
		while(m<=n-2) {
			hu=(first+second)*k;
			System.out.print(hu+" ");
			first=second;
			second=hu;
			m++;
		}
		sc.close();
	}
}
