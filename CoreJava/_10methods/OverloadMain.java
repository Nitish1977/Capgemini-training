package _10methods;
public class OverloadMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main();
		int u=8;
		System.out.println(main(u));
	}
	public static void main() {
		System.out.println("hello you");	
	}
	public static String main(int u) {
		String s="ur num is"+u+" this is great";
		return s;
	}
}
