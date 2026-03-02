package _12array;
import java.util.Scanner;
public class ZerostoRight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter elements of array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int pos=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
				pos++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
