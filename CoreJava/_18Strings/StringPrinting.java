package _18Strings;
import java.util.Scanner;
public class StringPrinting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("mussy");
		String b="muffin";
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		StringBuilder d=new StringBuilder("kui");
		System.out.println(d);
		d=new StringBuilder("hui");
		System.out.println(d);
		String g=sc.nextLine();
		StringBuilder f=new StringBuilder(g);
		String v="meet me at the apt apt apt";
		StringBuilder h=new StringBuilder(v);
		String[] r=v.split(" ");
		String[] y=h.toString().split(" ");
		System.out.println(f);
		System.out.println(g);
		System.out.println(v);
		System.out.println(r);
		System.out.println(h);
		System.out.println(y);
		sc.close();
	}
}
