package _2basics;
import java.util.Scanner;
public class Input3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n<1 || n>10) {
			System.out.print(n+" is not between 1 and 10. pls try again: ");
			n=sc.nextInt();
		}
		System.out.println("thank you, "+n+" is between 1 and 10");
		sc.close();
	}
}
