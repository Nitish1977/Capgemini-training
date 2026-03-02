package _19ExceptionHandling;

public class BoxinginWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i=a;
		System.out.println(":implicit boxing: "+i);
		Integer j=Integer.valueOf(a);
		System.out.println("Explicit Boxing: "+j);
	}

}
