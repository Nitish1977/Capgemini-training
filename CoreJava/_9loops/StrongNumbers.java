package _9loops;
public class StrongNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000; i++) {
			int sum=0;
			int n=i;
			int temp=i;
			while(n!=0) {
				int digit=n%10;
				int fact=1;
				for(int j=digit; j>=1; j--) {
					fact=fact*j;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(sum==temp) {
				System.out.print(temp+ " ");
			}

		}
	}
}
