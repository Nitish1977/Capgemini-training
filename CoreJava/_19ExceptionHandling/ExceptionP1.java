package _19ExceptionHandling;
import java.util.Scanner;
public class ExceptionP1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enater a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			int ans=a/b;
			System.out.println("ans: "+ans);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("hadles");
		}
//		catch(InputMismatchException e) {
//			e.printStackTrace();
//			System.out.println("inputmismatch handled");
//		}
		catch(Exception ie) {
			ie.printStackTrace();
			System.out.println("handled");
		}
		finally {
			System.out.println("finally block executed");
			sc.close();
		}
	}
}
