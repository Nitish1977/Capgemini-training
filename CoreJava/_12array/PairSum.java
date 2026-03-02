package _12array;
import java.util.Scanner;
public class PairSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("target: ");
		int  target=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}
		sc.close();
		
	}

}
