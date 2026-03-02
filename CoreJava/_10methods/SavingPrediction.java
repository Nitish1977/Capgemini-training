package _10methods;
import java.util.Scanner;
public class SavingPrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter income: ");
		int income=sc.nextInt();
		System.out.print("enter expenses: ");
		int expenses=sc.nextInt();
		System.out.print("is this a festive month: yes->true, no->false");
		boolean isfestive=sc.nextBoolean();
		if(isfestive==true) {
			System.out.println("Saving in festive month: "+predict(income, expenses, isfestive));
		}
		else {
			System.out.println("saving: "+predict(income, expenses));
		}
		
		sc.close();
	}
	public static int predict(int income, int expenses) {
		int savings=income-expenses;
		return savings;
	}
	public static int predict(int income, int expenses, boolean month) {
		if(month==true) {
			expenses=expenses+(expenses*20/100);
		}
		int saving=income-expenses;
		System.out.println("festive expenses: "+expenses);
		return saving;
	}
}
