package _9loops;
public class Primenumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=20; i>=1; i--) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}

}
