package _19ExceptionHandling;
import java.util.Scanner;
class NotEligibleException extends Exception{
	public NotEligibleException(String msg) {
		System.out.println(msg);
	}
}
public class EligibleExecption {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		try {
			eligibleVoting(age);
		}
		catch(NotEligibleException e) {
			e.printStackTrace();
			System.out.println("handled");
		}
		finally {
			sc.close();
		}
	}
	public static void eligibleVoting(int age) throws NotEligibleException {
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			throw new NotEligibleException("you are below 18");
		}
	}

}
