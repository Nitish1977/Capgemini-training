package _12array;
import java.util.Scanner;
public class SmallestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("nter elements: " );
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		System.out.println("Smallest Element: "+small);
		sc.close();
	}
}
