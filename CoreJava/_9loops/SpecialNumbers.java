package _9loops;
public class SpecialNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			int sum=0;
			int product=1;
			int temp=i;
			int gu=i;
			while(gu!=0) {
				int digit=gu%10;
				sum=sum+digit;
				product=product*digit;
				gu=gu/10;
			}
			int total=sum+product;
			if(total==temp) {
				System.out.print(temp+" ");
			}
			
		}
	}
}
