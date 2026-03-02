package _9loops;
public class Palindromes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100; i<=200; i++) {
			int n=i;
			int temp=i;
			int rev=0;
			while(n!=0) {
				int digit=n%10;
				rev=rev*10+digit;
				n=n/10;
			}
			if(temp==rev) {
				System.out.print(temp+" ");
			}
		}
	}
}
