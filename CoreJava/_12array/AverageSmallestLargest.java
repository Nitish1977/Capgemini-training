package _12array;
import java.util.Scanner;
public class AverageSmallestLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		double[] arr=new double[n];
		System.out.print("Enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextDouble();
		}
		double large=Double.MIN_VALUE;
		double small=Double.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>large) large=arr[i];
			if(arr[i]<small) small=arr[i];
		}
		System.out.println(small);
		System.out.println(large);
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==small || arr[i]==large) {
				sum=sum+arr[i];
			}
		}
		double avg=sum/arr.length;
		System.out.println("average: "+avg);
		sc.close();
	}

}
