package _10methods;
import java.util.Scanner;
public class Isfibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibonacci(n));
		sc.close();
	}
	public static String fibonacci(int n) {
		int a=0, b=1;
		int g=9;
		int sum=a+b;
		while(sum<=n) {
			sum=a+b;
			if(sum==n) {
				return "yes";
			}else {
				g=0;
			}
			a=b;
			b=sum;
			
		}
		if(g==1) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}
