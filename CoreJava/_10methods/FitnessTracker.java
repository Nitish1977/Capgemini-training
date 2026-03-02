package _10methods;
import java.util.Scanner;
public class FitnessTracker {
	public static void main(String[] args) {
		showSummary();
	}
	public static int inputSteps() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter steps: ");
		int steps=sc.nextInt();
		return steps;
	}
	public static int calculateCalories(int steps) {
		int calories=(int)(steps*0.04);
		return calories;
	}
	public static int calculateCalories(int steps, double weight ) {
		int calories=(int)(steps*weight*0.0005);
		return calories;
	}
	public static void showSummary() {
		Scanner sc=new Scanner(System.in);
		int steps=inputSteps();
		System.out.print("Ente wieght: ");
		double weight=sc.nextDouble();
		System.out.println("Steps: "+steps);
		System.out.println("Calories Burned: "+calculateCalories(steps, weight));
		System.out.println("calories burned without weight: "+calculateCalories(steps));
		sc.close();
	}
}
