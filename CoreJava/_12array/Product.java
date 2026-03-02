package _12array;
import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int product=1;
		System.out.print("product: ");
		for(int i=0; i<arr.length; i++) {
			product=product*arr[i];
		}
		System.out.print(product);
		sc.close();
	}
}
