package _12array;
import java.util.Scanner;
public class CountOfDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%k==0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
