package _19ExceptionHandling;
import java.util.Scanner;
class Animal{
	int a=10;
}
class Dog extends Animal{
	int b=20;
}
public class ClasscastException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d=new Animal();
		System.out.println(d.a);
		
		try {
			Dog e=(Dog)d;
			System.out.println(e.b);
		}
		catch(ClassCastException e) {
			e.printStackTrace();
			System.out.println("handled");
		}
	}
	
}
