package _5decisionmaking;
import java.util.Scanner;
public class LeapyearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a%4==0 && a%100!=0) || a%400==0){
            System.out.println("yes it is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        sc.close();

	}

}
