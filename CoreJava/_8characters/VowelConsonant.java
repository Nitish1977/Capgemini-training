package _8characters;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o'|| a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println("given char is vowel");
        }
        else{
            System.out.println("given char is consonant");
        }
        sc.close();
	}

}
