package _12array;
import java.util.Scanner;
public class IntersectionOfArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("size of first array: ");
		int n=sc.nextInt();
		System.out.print("size if second array: ");
		int m=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter first array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[m];
		System.out.print("enter second array elements: ");
		for(int i=0; i<b.length; i++) {
			b[i]=sc.nextInt();
		}
		int s=n+m;
		int[] intersection=new int[s];
		int k=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					boolean ad=false;
					for(int d=0; d<k; d++) {
						if(intersection[d]==a[i]) {
							ad=true;
							break;
						}
					}
					if(ad==false) {
						intersection[k]=a[i];
						k++;
					}
					break;
				}
			}
		}
		
		
		for(int i=0; i<k; i++) {
			System.out.print(intersection[i]+" ");
		}
		sc.close();
	}
}
