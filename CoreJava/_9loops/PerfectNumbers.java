package _9loops;
public class PerfectNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1; i<=100; i++) {
			 int sum=0;
			 for(int j=1; j<i; j++) {
				 if(i%j==0) {
					 sum=sum+j;
				 }
			 }
			 if(sum==i) {
				 System.out.print(i+" ");
			 }
		 }
	}
}
