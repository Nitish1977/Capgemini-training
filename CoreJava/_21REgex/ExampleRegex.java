package _21REgex;
import java.util.Scanner;
public class ExampleRegex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter mobile numver: ");
		String a=sc.nextLine();
		String reg="^[6-9]\\d{9}$";
		System.out.println(a.matches(reg));
		System.out.println();
		
		System.out.print("Enter email: ");
		String b=sc.nextLine();
		String regemail="^[A-Za-z0-9_%+.-]+@[A-Za-z]+.[A-Za-z]{2,}$";
		System.out.println(b.matches(regemail));
		System.out.println();
		
		System.out.println("Enter passowrd: ");
		String c=sc.nextLine();
		String passreg="^(?=.*[A-Z])(?=.\\d).{8,}$";
		System.out.println(c.matches(passreg));
		System.out.println();
		
		System.out.println("Enter usename: ");
		String d=sc.nextLine();
		String usernamereg="^[A-Za-z][a-zA-Z0-9_]{4,14}";
		System.out.println(d.matches(usernamereg));
		System.out.println();
		
		System.out.println("Enter otp: ");
		String e=sc.nextLine();
		String otpReg="\\d{6}";
		System.out.println(e.matches(otpReg));
		System.out.println();
		
		System.out.println("Enter pincode");
		String f=sc.nextLine();
		String pinreg="\\d{4}";
		System.out.println(f.matches(pinreg));
		System.out.println();
		
		System.out.println("Enter indianvehicle numver:");
		String g=sc.nextLine();
		String vehREg="^[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}$";
		System.out.println(g.matches(vehREg));
		System.out.println();
		
		
		System.out.println("Enter date: ");
		String h=sc.nextLine();
		String datREg="\\d{2}-\\d{2}-\\d{4}";
		System.out.println(h.matches(datREg));
		
	}
}
