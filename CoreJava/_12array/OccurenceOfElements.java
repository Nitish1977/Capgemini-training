package _12array;
import java.util.Scanner;
public class OccurenceOfElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int n=sc.nextInt();
		System.out.print("enter elements: ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int[] occ=new int[n];
		int[] num=new int[n];
		int k=0;
		for(int i=0; i<n; i++) {
			int count=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]==arr[i]) count++;
			}
			boolean ad=false;
			for(int d=0; d<k; d++) {
				if(num[d]==arr[i]) {
					ad=true;
					break;
				}
			}
			if(ad==false) {
				num[k]=arr[i];
				occ[k]=count;
				k++;
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("" );
		for(int i=0; i<k; i++) {
			System.out.print(occ[i]+" ");
		}
		sc.close();
	}
}
