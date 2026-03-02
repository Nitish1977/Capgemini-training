package _9loops;
public class Sumproduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		int product=1;
		for(int i=1; i<=10; i++) {
			product=product*i;
		}
		System.out.println(product);
	}
}
