package _12array;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new  int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("enter value at index "+i+" : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
