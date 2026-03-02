package _12array;
import java.util.Scanner;
public class thirdlargestElemnet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.print("Enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int big=arr[0];
		int sbig=Integer.MIN_VALUE;
		int tbig=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>big) big=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<big && arr[i]>sbig) sbig=arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<big && arr[i]<sbig && arr[i]>tbig) tbig=arr[i];
		}
		System.out.println("Largest: "+big);
		System.out.println("Second largest: "+sbig);
		System.out.println("third largest: "+tbig);
		sc.close();
	}
}
