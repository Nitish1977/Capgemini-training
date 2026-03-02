package _12array;
import java.util.Scanner;
public class UniqueElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size: ");
		int n=sc.nextInt();
		System.out.print("enter elements: ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int[] uni=new int[n];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			boolean ad=false;
			for(int j=0; j<k; j++) {
				if(uni[j]==arr[i]) {
					ad=true;
					break;
				}
			}
			if(ad==false) {
				uni[k]=arr[i];
				k++;
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(uni[i]+" ");
		}
		sc.close();
	}
}
