package _21REgex;
public class MatchesDigitletterspaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5".matches("\\d"));
		System.out.println("0".matches("\\d"));
		System.out.println("9".matches("\\d"));
		System.out.println("12".matches("\\d"));
		System.out.println("12".matches("\\d+"));
		System.out.println("a".matches("\\d"));
		System.out.println(" ".matches("\\d"));
		System.out.println();
		
		System.out.println("a".matches("\\w"));
		System.out.println("Z".matches("\\w"));
		System.out.println("5".matches("\\w"));
		System.out.println("_".matches("\\w"));
		System.out.println("@".matches("\\w"));
		System.out.println(" ".matches("\\w"));
		System.out.println();
		
		System.out.println(" ".matches("\\s"));
		System.out.println("\t".matches("\\s"));
		System.out.println("\n".matches("\\s"));
		System.out.println("a".matches("\\s"));
		System.out.println("1".matches("\\s"));
	}
}
