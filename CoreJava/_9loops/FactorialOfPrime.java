package _9loops;
public class FactorialOfPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=14; i>=5; i--) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) count++;
			}
			if(count==2) {
				int fact=1;
				for(int j=i; j>=1; j--) {
					fact=fact*j;
				}
				System.out.println("factorial of "+i+" is "+fact);
			}
		}
	}
}
