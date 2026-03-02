package _12array;
import java.util.Scanner;
public class SecondLargestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int big=arr[0];
		int sbig=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>big) {
				sbig=big;
				big=arr[i];
			}
			else if(arr[i]<big && sbig<arr[i]) {
				sbig=arr[i];
			}
		}
		System.out.println("Second largest: "+sbig);
		sc.close();
	}
}
