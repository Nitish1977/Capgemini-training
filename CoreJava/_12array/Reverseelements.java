package _12array;
import java.util.Scanner;
public class Reverseelements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		System.out.print("Enter elements: ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			arr[i]=rev(arr[i]);
		}
		System.out.print("reverse: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	public static int rev(int a) {
		int rev=0;
		while(a!=0) {
			int digit=a%10;
			rev=rev*10+digit;
			a=a/10;
		}
		return rev;
	}

}
