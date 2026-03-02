package _19ExceptionHandling;
import java.util.Scanner;
public class NullPointerexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=null;
		try {
			System.out.println(a.length());
		}
		catch(NullPointerException e) {

			System.out.println("handled");
		}
	}

}
