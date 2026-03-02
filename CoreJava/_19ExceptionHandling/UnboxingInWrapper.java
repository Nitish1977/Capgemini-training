package _19ExceptionHandling;
public class UnboxingInWrapper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;
		int i=a;
		System.out.println("implicit unboxing: "+i);
		int j=a.intValue();
		System.out.println("Explicit unboxing: "+j);
	}
}
