package _5decisionmaking;
import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String a=sc.next();
        switch(a){
            case "apple":
                System.out.println("Apples are rich in fiber");
                break;
            case "banana":
                System.out.println("bananas are great in source of potassium");
                break;
            case "mango":
                System.out.println("mangoes are king of fruits");
                break;
            case "orange":
                System.out.println("ornages have vitamin c");
                break;
            default:
                System.out.println("Sorry, i dont have information about the fruit");
        }
        sc.close();

	}

}
