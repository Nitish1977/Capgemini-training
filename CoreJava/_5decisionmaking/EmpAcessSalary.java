package _5decisionmaking;
import java.util.Scanner;
public class EmpAcessSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("EMployee Id: ");
		int empid=sc.nextInt();
		System.out.print("Employee Name: ");
		sc.nextLine();
		String empname=sc.nextLine();
		System.out.print("AGe: ");
		int age=sc.nextInt();
		System.out.println("choose department 1->IT, 2->Hr, 3->Finanace");
		System.out.print("department: ");
		int dept=sc.nextInt();
		System.out.print("salary: ");
		double salary=sc.nextDouble();
		System.out.println("choose role: ");
		System.out.println("1->developer, 2->tester, 3->recruiter, 4->payroll, 5->accountant, 6->auditor");
		int role=sc.nextInt();
		String crole=" ";
		if(age<21) {
			System.out.println("you are not eligible to work");
		}
		else {
			switch(dept) {
			case 1:
				switch(role) {
				case 1:
					crole="devloper";
					break;
				case 2:
					crole="tester";
					break;
				default: 
					System.out.println("invalid");
					break;
				}
				break;
			case 2:
				switch(role) {
				case 3:
					crole="recruiter";
					break;
				case 4:
					crole="payroll";
					break;
				default: 
					System.out.println("invalid");
					break;
				}
				break;
			case 3:
				switch(role){
				case 5:
					crole="Accountant";
					break;
				case 6:
					crole="auditor";
					break;
				default: 
					System.out.println("invalid");
					break;
				}
				break;
			default: 
				System.out.println("invalid");
				break;
			}
			int allowance=0;
			switch(crole) {
			case "developer":
				allowance=30;
				break;
			case "tester":
				allowance=25;
				break;
			case "recruiter":
				allowance=20;
				break;
			case "payroll":
				allowance=22;
				break;
			case "Accountant":
				allowance=28;
				break;
			case "auditor":
				allowance=26;
				break;
			}
			double final_salary=salary+(salary*allowance/100);
			String access;
			if(final_salary>=60000 && dept==1) {
				access="Admin access";
			}
			else if(final_salary>=60000 && (dept==2 || dept==3)){
				access="Manager access";
			}
			else {
				access="Employee access";
			}
			
			System.out.println("Name: "+empname);
			System.out.println("id: "+empid);
			if(dept==1) {
				System.out.println("dept: IT");
			}
			else if(dept==2) {
				System.out.println("dept: HR");
			}
			else if(dept==3) {
				System.out.println("dept: Finance");
			}
			System.out.println("Role: "+crole);
			System.out.println("Basicsalary: "+salary);
			System.out.println("Finaly salary: "+final_salary);
			System.out.println("Access Level: "+access);
		}
		
		sc.close();

	}

}
