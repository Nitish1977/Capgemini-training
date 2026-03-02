package _5decisionmaking;
import java.util.Scanner;
public class switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the operation: ");
		String OpeChoice=sc.next();
		System.out.print("enter no of numbers you want to perform on: ");
		int novar=sc.nextInt();
		System.out.println("Enter numbers: ");
		int a=0, b=0, c=0, d=0;
		switch(novar) {
		case 2: 
			a=sc.nextInt();
			b=sc.nextInt();
			break;
		case 3:
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			break;
		case 4:
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			break;
		}
		int ans=0;
		switch(OpeChoice) {
		case "add":
			if(novar==2) {
				ans=a+b;
			}
			else if(novar==3) {
				ans=a+b+c;
			}
			else if(novar==4) {
				ans=a+b+c+d;
			}
			else {
				System.out.println("invalid");
			}
			break;
		case "sub":
			if(novar==2) {
				ans=a+b;
			}
			else if(novar==3) {
				ans=a-b-c;
			}
			else if(novar==4) {
				ans=a-b-c-d;
			}
			else {
				System.out.println("invalid");
			}
			break;
		case "mul":
			if(novar==2) {
				ans=a*b;
			}
			else if(novar==3) {
				ans=a*b*c;
			}
			else if(novar==4) {
				ans=a*b*c*d;
			}
			else {
				System.out.println("invalid");
			}
			break;
		case "div":
			if(novar==2) {
				ans=a/b;
			}
			else if(novar==3) {
				ans=a/b/c;
			}
			else if(novar==4) {
				ans=a/b/c/d;
			}
			else {
				System.out.println("invalid");
			}
			break;
		default:
			System.out.println("wrong operation");
			break;
		}
		System.out.println(ans);
		sc.close();

	}

}
