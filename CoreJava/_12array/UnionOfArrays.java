package _12array;
import java.util.Scanner;
public class UnionOfArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size1: ");
		int n=sc.nextInt();
		System.out.print("Enter size2: ");
		int m=sc.nextInt();
		int s=n+m;
		int[] a=new int[n];
		System.out.print("enter elements of arr1: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[m];
		System.out.print("enter elemnets of arr2: ");
		for(int i=0; i<b.length; i++) {
			b[i]=sc.nextInt();
		}
		int[] union=new int[s];
		int k=0;
		for(int i=0; i<a.length; i++) {
			boolean f=false;
			for(int j=0; j<k; j++) {
				if(union[j]==a[i]) {
					f=true;
					break;
				}
			}
			if(f==false) {
				union[k]=a[i];
				k++;
			}
		}
		for(int i=0; i<b.length; i++) {
			boolean f=false;
			for(int j=0; j<k; j++) {
				if(union[j]==b[i]) {
					f=true;
					break;
				}
			}
			if(f==false) {
				union[k]=b[i];
				k++;
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(union[i]+" ");
		}
		sc.close();
	}
}
