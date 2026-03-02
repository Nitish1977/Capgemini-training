package _12array;
import java.util.Scanner;
public class SmartTracker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] sales=new int[7];
		int[] temp=new int[7];
		System.out.print("Enter sales: ");
		for(int i=0; i<sales.length; i++) {
			sales[i]=sc.nextInt();
		}
		for(int i=0; i<temp.length; i++) {
			temp[i]=sc.nextInt();
		}
		//activity 1- average temperature
		double avgtemp=AvgTemp(temp);
		System.out.println("Average Temperature: "+avgtemp);
		//activity 2- Hottest and Coldest Day
		HotCold(temp);
		//Activity 3 – Count Hot Days
		System.out.println("Number of hot days: "+CountHot(temp));
		//Activity 4 – Total and Average Sales
		AvgSales(sales);
		//Activity 5 – Record-Breaking Sales
		RBsales(sales);
		//Activity 6 – Count High-Sales Days
		System.out.println("Number of high sales days (>100):"+CHSdays(sales));
		//Activity 7 – Search for a Specific Sale
		System.out.print("give search element: ");
		int sea=sc.nextInt();
		int k=SpecificSales(sales, sea);
		System.out.println("sales "+sea+" found on day "+k);
		//Activity 8 – Update Sales Record
		System.out.print("Enter which day to update: ");
		int day=sc.nextInt();
		System.out.print("Enter sale to uodate: ");
		int r=sc.nextInt();
		for(int i=0; i<sales.length; i++) {
			if(i==day-1) sales[i]=r;
		}
		for(int i=0; i<sales.length; i++) {
			System.out.print(sales[i]+" ");
		}
		sc.close();
	}
	public static double AvgTemp(int[] temp){
		double sum=0;
		for(int i=0; i<temp.length; i++) {
			sum=sum+temp[i];
		}
		double avg=sum/temp.length;
		return avg;
	}
	public static void HotCold(int[] temp) {
		int hot=temp[0];
		int cold=temp[0];
		for(int i=0; i<temp.length; i++) {
			if(hot<temp[i]) hot=temp[i];
			if(cold>temp[i]) cold=temp[i];
		}
		System.out.println("HIghes temperature: "+hot);
		System.out.println("Lowest temperature: "+cold);
	}
	public static int CountHot(int[] temp) {
		int count=0;
		for(int i=0; i<temp.length; i++) {
			if(temp[i]>30) count++;
		}
		return count;
	}
	public static void AvgSales(int[] sales) {
		int sum=0;
		for(int i=0; i<sales.length; i++) {
			sum=sum+sales[i];
		}
		double avg=sum/sales.length;
		System.out.println("Total sales: "+sum);
		System.out.println("Average sales: "+avg);
	}
	public static void RBsales(int[] sales) {
		int high=sales[0];
		int h=0;
		int low=sales[0];
		int l=0;
		for(int i=0; i<sales.length; i++) {
			if(sales[i]>high) {
				high=sales[i];
				h=i;
			}
			if(sales[i]<low) {
				low=sales[i];
				l=0;
			}
		}
		System.out.println("Highest Sale: "+high+" on day "+(h+1));
		System.out.println("Lowest Sale: "+low+" on day "+(l+1));
	}
	public static int CHSdays(int[] sales) {
		int count=0;
		for(int i=0; i<sales.length; i++) {
			if(sales[i]>100){
				count++;
			}
		}
		return count;
	}
	public static int SpecificSales(int[] sales, int sea) {
		int k=0;
		for(int i=0; i<sales.length; i++) {
			if(sales[i]==sea) {
				k=i+1;
			}
		}
		return k;
	}
	

}
