package _10methods;
public class RecurisveSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reult=pri(1);
		System.out.println(reult);
	}
	public static int pri(int a) {
		if(a>5) {
			return 0;
		}
		return a+pri(a+1);
	}
}
