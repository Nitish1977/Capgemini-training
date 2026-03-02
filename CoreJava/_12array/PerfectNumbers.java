package _12array;
import java.util.Scanner;
public class PerfectNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("perfectnumbers: ");
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(int j=1; j<arr[i]; j++) {
				if(arr[i]%j==0) {
					sum=sum+j;
				}
			}
			if(sum==arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
