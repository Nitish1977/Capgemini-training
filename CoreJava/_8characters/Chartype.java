package _8characters;
import java.util.Scanner;
public class Chartype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='A' && a<='Z'){
            System.out.println("upper Case");
        }
        else if(a>='a' && a<='z'){
            System.out.println("lower case");
        }
        else if(a>='0' && a<='9'){
            System.out.println("digits");
        }
        else{
            System.out.println("special characters");
        }
        sc.close();
	}

}
