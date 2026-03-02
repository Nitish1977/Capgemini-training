package _18Strings;
public class NoofWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet me at the apt apt apt";
		String[] b=a.split(" ");
		int c=0;
		for(String f:b) {
			c++;
		}
		System.out.println("no of words: "+c);
	}
}
