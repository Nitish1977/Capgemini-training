package _8characters;
import java.util.Scanner;
public class TypeChar {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='A' && a<='Z'){
            if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
                System.out.println("uupercase vowel");
            }
            else{
                System.out.println("uppercase consonant");
            }
        }
        else if(a>='a' && a<='z'){
            if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                System.out.println("lowercase vowel");
            }
            else{
                System.out.println("lowercase Consonant");
            }
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }


}
