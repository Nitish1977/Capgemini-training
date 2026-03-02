package _9loops;
import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>='A' && a<='Z') {
			if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
				System.out.println("upper case vowel");
				int n=10;
				do {
					System.out.print(n+" ");
					n++;
				}while(n<=20);
			}
			else {
				System.out.println("upper case consonant");
				for(int i=25; i>=15; i--) {
					System.out.print(i+" ");
				}
			}
		}
		else if(a>='a' && a<='z'){
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
				System.out.println("Lower case vowel");
				int n=-10;
				while(n>=-20) {
					System.out.print(n+" ");
					n--;
				}
			}
			else {
				System.out.println("lower case consonant");
				for(int i=-25; i<=-15; i++) {
					System.out.print(i+" ");
				}
			}
			sc.close();
		}
	}
}
