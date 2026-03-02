package _18Strings;
public class Equals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="meet";
		String b="meeti";
		String c="MeeT";
		String d="meet";
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(a==b);
		System.out.println(a==d);
		
		String v="meet   me at the apt apt apy";
		System.out.println(v.replaceAll("\\s+", " "));
		System.out.println(v.replace(" " ,""));
		System.out.println(v.replaceAll("\\s+", ""));
	}
}
