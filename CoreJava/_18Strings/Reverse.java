package _18Strings;
public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet me at the apt apt";
		String rev="";
		char[] d=a.toCharArray();
		for(int i=d.length-1; i>=0; i--) {
			rev+=d[i];
		}
		System.out.println(rev);
	}

}
