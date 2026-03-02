package _9loops;
public class PrimesAddition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=32; i<=50; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of primes: "+sum);
	}
}
