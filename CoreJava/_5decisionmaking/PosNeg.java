package _5decisionmaking;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Positive");}
        else if (a < 0) {
            System.out.println("Negative");}
        else {
            System.out.println("Zero");}
        
        sc.close();
	}

}
