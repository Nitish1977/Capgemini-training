package _9loops;
import java.util.Scanner;
public class DisariumNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		
		while(n!=0) {
			int digit=n%10;
			int a=pow(digit, count);
			sum=sum+a;
			n=n/10;
			count--;
		}
		if(sum==temp) {
			System.out.println("disarium number");
		}
		else {
			System.out.println("not disarium number");
		}
		sc.close();
	} 
	public static int pow(int a,int b) {
		int du=1;
		while(b!=0) {
			du=du*a;
			b--;
		}
		return du;
	}
}
