package _5decisionmaking;
import java.util.Scanner;
public class _7or9divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 7 == 0) {
            System.out.println("given number is divisible by 7");
        }
	else{
	    System.out.println("given number is not divisible by 7");
	}
        if (a % 9 == 0) {
            System.out.println("given number is divisible by 9");
        }
	else{
	    System.out.println("given number is not divisible by 9");
	}
        sc.close();
	}

}
