package _12array;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("Enter elemnets: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("primeNumbers: ");
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=1; j<=arr[i]; j++) {
				if(arr[i]%j==0) count++;
			}
			if(count==2) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
