package _5decisionmaking;
import java.util.Scanner;
public class ClockProblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int movement=input1*input2;
		if(movement>12) {
			movement=movement%12;
		}
		if(movement==0) {
			movement=12;
		}
		System.out.println(movement);
		sc.close();
	}
}
