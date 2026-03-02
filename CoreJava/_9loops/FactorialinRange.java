package _9loops;
public class FactorialinRange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1; i<=10; i++) {
			 int fact=1;
			 for(int j=i; j>=1; j--) {
				 fact=fact*j;
			 }
			 System.out.println("factorial of "+i+" is "+fact);
		 }
	}
}
