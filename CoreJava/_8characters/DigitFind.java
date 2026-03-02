package _8characters;
import java.util.Scanner;

public class DigitFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='0' && a<='9'){
            System.out.println("given char is digit");
        }
        else{
            System.out.println("given char is not digit");
        }
        sc.close();
	}

}
