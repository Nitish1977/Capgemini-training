package _12array;
import java.util.Scanner;
public class DuplicateElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter siae: ");
		int n=sc.nextInt();
		System.out.print("Enter elements: ");
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int[] dup=new int[n];
		int k=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				boolean ad=false;
				for(int d=0; d<k; d++) {
					if(dup[d]==arr[i]) {
						ad=true;
						break;
					}
				}
				if(arr[i]==arr[j] && ad==false) {
					dup[k]=arr[i];
					k++;
				}
				
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(dup[i]+" ");
		}
		sc.close();
	}
}
