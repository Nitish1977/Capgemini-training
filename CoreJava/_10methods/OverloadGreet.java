package _10methods;
import java.util.Scanner;
public class OverloadGreet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Whats is your name: ");
		String name=sc.nextLine();
		System.out.print("What's your age: ");
		int age=sc.nextInt();
		System.out.println(greet());
		System.out.println(greet(name));
		System.out.println(greet(name, age));
		sc.close();
	}
	public static String greet() {
		return "Heloo!";
	}
	public static String greet(String name) {
		String sen="Hello, "+name+"! ";
		return sen;
	}
	public static String greet(String name, int age) {
		String sen="Heloo, "+name+"! you are "+age+" years old.";
		return sen;
	}
}
