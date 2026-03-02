package _16Abstraction;
@FunctionalInterface
interface Factorial{
	public int findFactorial(int n) ;
}
class AbsBody implements Factorial{
	@Override 
	public int findFactorial(int n) {
		int fact=1;
		for(int i=n; i>=1; i--) {
			fact=fact*i;
		}
		return fact;
	}
}
public class AnonymousClass {
	public static void main(String[] args) {
		Factorial a=new AbsBody() {
			@Override
			public int findFactorial(int n) {
				int fact=1;
				while(n>=1) {
					fact=fact*n;
					n--;
				}
				return fact+1;
			}
		};
		System.out.println(a.findFactorial(5));
		Factorial b=new AbsBody();
		System.out.println(b.findFactorial(5));
		Factorial c=(int n) -> {
			int fact=1;
			while(n>=1) {
				fact*=n;
				n--;
			}
			return fact+2;
		};
		System.out.println(c.findFactorial(5));
		Factorial d=(Factorial) c;
		System.out.println(d.findFactorial(5));
	}
}
