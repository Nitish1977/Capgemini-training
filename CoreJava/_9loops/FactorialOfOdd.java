package _9loops;
public class FactorialOfOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10; i>=1; i--) {
			int fact=1;
			if(i%2!=0) {
				for(int j=i; j>=1; j--) {
					fact=fact*j;
				}
				System.out.println("factorial of "+i+" is "+fact);
			}
		}
	}
}
