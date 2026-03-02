package _5decisionmaking;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner sc= new Scanner(System.in);
	        int a=sc.nextInt();
	        if(a>=90 && a<=100){
	            System.err.println("grade A");
	        }
	        else if(a>=75 && a<90){
	            System.out.println("grade B");
	        }
	        else if(a>=60 && a<75){
	            System.out.println("grade C");
	        }
	        else if(a>=40 && a<60){
	            System.out.println("grade D");
	        }
	        else if(a<40 && a>=0){
	            System.out.println("Fail!");
	        }
	        else if(a<0 || a>100){
	            System.out.println("invalid marks");
	        }
	        else{
	            System.out.println("invalid marks");
	        }
	        sc.close();
	}

}
