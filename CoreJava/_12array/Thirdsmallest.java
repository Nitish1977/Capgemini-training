package _12array;
import java.util.Scanner;
public class Thirdsmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter elemneys: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		int ssmall=Integer.MAX_VALUE;
		int tsmall=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<small) small=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>small && arr[i]<ssmall) ssmall=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>small && arr[i]>ssmall && arr[i]<tsmall) tsmall=arr[i];
		}
		System.out.println("Smallest: "+small);
		System.out.println("Second smallest: "+ssmall);
		System.out.println("third smallest: "+tsmall);
		sc.close();
	}
}
