package _5decisionmaking;
import java.util.Scanner;
public class DepartmentSelc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String dept=sc.next();
		String role=sc.next();
		switch(dept) {
		case "it":
			switch(role) {
			case "developer":
				System.out.println("you are developer in It");
				break;
			case "tester":
				System.out.println("you tester in it");
				break;
			case "devops":
				System.out.println("you are in devops in it");
				break;
			default:
				System.out.println("you selected nothing role in it");
				break;
			}
			break;
		case "hr":
			switch(role) {
			case "recruiter":
				System.out.println("you are recruiter in hr");
				break;
			case "executive":
				System.out.println("you are executive in hr");
				break;
			case "payrollofficier":
				System.out.println("you are payrollofficier in hr");
				break;
			default:
				System.out.println("you selected nothing role in hr");
				break;
			}
			break;
		case "finance":
			switch(role) {
			case "accountant":
				System.out.println("you are accountant in financet");
				break;
			case "analyst":
				System.out.println("you are analyst in finance");
				break;
			case "auditor":
				System.out.println("you are auditor in finance");
				break;
			default:
				System.out.println("you selected nothing role in finance");
				break;
			}
			break;
		case "operations":
			switch(role) {
			case "opexecutive":
				System.out.println("you are opexecutive in operation");
				break;
			case "teamlead":
				System.out.println("you are teamlead in operation");
				break;
			case "manager":
				System.out.println("you are manager in operation");
				break;
			default:
				System.out.println("you selected nothing role in operations");
				break;
			}
			break;
		default:
			System.out.println("you choose wrong department");
		}
		sc.close();

	}

}
