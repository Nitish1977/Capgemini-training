package _21REgex;
import java.util.Scanner;
import java.util.List;
public class zeroOrmoreOccurences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("j".matches("S*j"));
		System.out.println("Sj".matches("S*j"));
		System.out.println("SSj".matches("S*j"));
		System.out.println("SSSj".matches("S*j"));
		System.out.println("Sabcj".matches("S*j"));
		System.out.println("sSj".matches("S*j"));;
		System.out.println("jj".matches("S*j"));
		
		System.out.println();
		//Aditya
		//AAAddiiityaaa
		//Additttyya
		//dityaaa
		//Aditttyya
		
		List<String> l=List.of("Aditya","AAAddiiityaaa","Additttyya","dityaaa","Aditttyya");
		for(String i:l) {
			System.out.println(i.matches("A*d+i+t+y+a+"));
		}
		
		
		System.out.println("");
		String[] s= {"Suraj", "SURAJ", "suraj", "SuRaJ", "Suurajj", "Suraj@123", "S#u@j@123", "123suraj", "12345", "", "bubaalpreet", "Kshitij@731"};
		for(String i: s) {
			System.out.print(i +" -> ");
			System.out.println(i.matches(".*"));
		}
	}
}
