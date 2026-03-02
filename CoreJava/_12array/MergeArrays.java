package _12array;
import java.util.Scanner;
public class MergeArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size1: ");
		int n1=sc.nextInt();
		System.out.print("enter size2: ");
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		System.out.print("Enter elements of first array: ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[n2];
		System.out.print("Enter elements of second array: ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int n=n1+n2;
		int[] arr=new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr[i]=arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			arr[i+n1]=arr2[i];
		}
		System.out.print("merged array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
