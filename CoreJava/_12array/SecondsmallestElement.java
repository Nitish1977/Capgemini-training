package _12array;
import java.util.Scanner;
public class SecondsmallestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("enter elenets: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		int secsmall=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<small) {
				secsmall=small;
				small=arr[i];
			}
			else if(arr[i]>small && secsmall>arr[i]) {
				secsmall=arr[i];
			}
		}
		System.out.print("Second smalles: "+secsmall);
		sc.close();
	}
}
