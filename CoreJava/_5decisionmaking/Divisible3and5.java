package _5decisionmaking;
import java.util.Scanner;
public class Divisible3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("divisibke by both 3 and 5");
        }
        else{
            System.out.println("doesnt divisible by both 3 and 5");
        }
        sc.close();

	}

}
