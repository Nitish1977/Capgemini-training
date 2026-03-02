package _12array;
import java.util.Scanner;
public class MaxOccurence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int maxO=arr[0];
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(count<digit(arr[i])) {
				count=digit(arr[i]);
				maxO=arr[i];
			}
		}
		System.out.println("Max occurence of 2 is in : "+maxO);
		sc.close();
	}
	public static int digit(int a) {
		int count=0;
		while(a!=0) {
			int digit=a%10;
			if(digit==2) count++;
			a=a/10;
		}
		return count;
	}

}
