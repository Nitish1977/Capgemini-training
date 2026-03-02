package _5decisionmaking;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        switch(a){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("invalid input");
        }
        sc.close();

	}

}
