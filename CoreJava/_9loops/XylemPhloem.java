package _9loops;
import java.util.Scanner;
public class XylemPhloem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int first=0;
		while(n!=0) {
			first=n%10;
			n=n/10;
		}
		n=temp;
		int last=n%10;
		n=n/10;
		int outersum=first+last;
		int innersum=0;
		while(n>=10) {
			int digit=n%10;
			innersum=innersum+digit;
			n=n/10;
		}
		System.out.println("outer sum: "+outersum);
		System.out.println("inner sum: "+innersum);
		if(innersum==outersum) {
			System.out.println("xylem");
		}
		else {
			System.out.println("phloem");
		}
		sc.close();
	}
}
