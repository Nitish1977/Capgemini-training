package _12array;
import java.util.Scanner;
public class ArrayProducts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter Elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int res[]=new int[n];
		for(int i=0; i<arr.length; i++) {
			int pro=1;
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
					pro=pro*arr[j];
				}
			}
			res[i]=pro;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(res[i]+" ");
		}
		sc.close();
	}
}
