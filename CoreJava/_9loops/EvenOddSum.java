package _9loops;
import java.util.Scanner;
public class EvenOddSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		while(n!=0) {
			int digit=n%10;
			if(digit%2==0) {
				even_sum=even_sum+digit;
			}
			else {
				odd_sum=odd_sum+digit;
			}
			n=n/10;
		}
		System.out.println("even sum: "+even_sum);
		System.out.println("odd sum: "+odd_sum);
		int output=even_sum*odd_sum;
		System.out.println(output);
		sc.close();
	}
}
