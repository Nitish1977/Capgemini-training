package _12array;
import java.util.Scanner;
public class LargestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("Nter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int big=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		System.out.println("Largest: "+big);
		sc.close();
	}
}
