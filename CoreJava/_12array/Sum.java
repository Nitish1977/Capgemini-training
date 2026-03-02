package _12array;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}
}
