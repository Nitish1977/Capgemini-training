package _12array;
import java.util.Scanner;
public class Leaders {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int[] lead=new int[n];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			boolean g=false;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					g=true;
					break;
				}
			}
			if(g==false) {
				lead[k]=arr[i];
				k++;
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(lead[i]+" ");
		}
		sc.close();
	}
}
