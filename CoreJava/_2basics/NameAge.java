package _2basics;
import java.util.Scanner;
public class NameAge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: " );
		String name=sc.nextLine();
		System.out.print("Enter age: ");
		double age=sc.nextDouble();
		System.out.println(name+"! you are "+age+" years old");
		sc.close();
	}
}
