package _5decisionmaking;
import java.util.Scanner;
public class DayType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1 && a<=7){
            if(a==6 || a==7){
                System.out.println("weekend hurray");
            }
            else{
                System.out.println("weekday");
            }

        }
        else{
            System.out.println("invalid input");
        }
        sc.close();

	}

}
