package _5decisionmaking;
import java.util.Scanner;
public class TicketBookingFareProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter pasennger id: ");
		int id=sc.nextInt();
		System.out.print("Enter passenger name: ");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		System.out.println("1->Bus 2->Train 3->Flight");
		System.out.print("choose travel type: ");
		int traveltype=sc.nextInt();
		System.out.print("Base fare: ");
		double basefare=sc.nextDouble();
		System.out.println("government employee: yes->true, no->false");
		System.out.print("are you government employee: ");
		boolean govtemp=sc.nextBoolean();
		String travel=" ";
		int clss=0;
		String travelclass=" ";
		if(age<5) {
			System.out.println("free ticket-no booking required");
		}
		else if(age>80) {
			System.out.println("medical clearance required");
		}
		else {
			switch(traveltype) {
			case 1:
				travel="Bus";
				System.out.println("choose class in Bus 1->sleeper 2->seater");
				clss=sc.nextInt();
				switch(clss) {
				case 1:
					travelclass="Sleeper";
					break;
				case 2:
					travelclass="seater";
					break;
				default:
					System.out.println("invalid");
				}
				break;
			case 2:
				travel="Train";
				System.out.println("choose class in Train 1->General 2->sleeper 3->ac ");
				clss=sc.nextInt();
				switch(clss) {
				case 1:
					travelclass="general";
					break;
				case 2:
					travelclass="sleeper";
				case 3:
					travelclass="ac";
				default:
					System.out.println("invalid");
				}
				break;
			case 3:
				travel="flight";
				System.out.println("choose class in flight 1->economy 2->business");
				clss=sc.nextInt();
				switch(clss) {
				case 1:
					travelclass="economy";
					break;
				case 2:
					travelclass="business";
				default:
					System.out.println("invalid");
				}
				break;
			default:
				System.out.println("Invalid");
				break;
			}
			
			double mul=0.0;
			switch(traveltype) {
			case 1:
				if(clss==1) mul=1.2;
				else if(clss==2) mul=1.0;
				break;
			case 2:
				if(clss==1) mul=1.0;
				else if(clss==2) mul=1.3;
				else if(clss==3) mul=1.6;
				break;
			case 3:
				if(clss==1) mul=2.5;
				else if(clss==2) mul=3.5;
				break;
			default:
				System.out.println("Invalid");
				break;
			}
			double fareaftercls=basefare*mul;
			int discount;
			if(age>=60) {
				discount=30;
			}
			else if(govtemp) {
				discount=15;
			}
			else if(age>=5 && age<=12) {
				discount=50;
			}
			else {
				discount=0;
			}
			double discountamt=fareaftercls*discount/100;
			double finalfare=fareaftercls-discountamt;
			String bookingsts="";
			if(finalfare>=10000) {
				if(travel=="flight") {
					bookingsts="confirmed";
				}
				else {
					bookingsts="Waiting list";
				}
			}
			else {
				bookingsts="confirmed";
			}
			
			System.out.println("Name: "+name);
			System.out.println("Passenger Id: "+id);
			System.out.println("Trvale Type: "+travel);
			System.out.println("class: "+travelclass);
			System.out.println("Base fare: "+basefare);
			System.out.println("Final fare: "+finalfare);
			System.out.println("Discount Applied: "+discountamt);
			System.out.println("Booking status: "+bookingsts);
		}
		sc.close();
	}

}
