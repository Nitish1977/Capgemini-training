package _12array;
import java.util.Scanner;
public class EvenNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("enter elemnts: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
}
