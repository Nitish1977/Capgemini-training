package _21REgex;
public class UpperCaseLowerCaseMatches {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A".matches("[A-Z]"));
		System.out.println("Z".matches("[A-Z]"));
		System.out.println("M".matches("[A-Z]"));
		System.out.println("a".matches("[A-Z]"));
		System.out.println("AA".matches("[A-Z]"));
		System.out.println("AA".matches("[A-Z]+"));
		System.out.println("1".matches("[A-Z]"));
		System.out.println("@".matches("[A-Z]"));
		System.out.println();
		
		System.out.println("a".matches("[a-z]"));
		System.out.println("z".matches("[a-z]"));
		System.out.println("m".matches("[a-z]"));
		System.out.println("A".matches("[a-z]"));
		System.out.println("aa".matches("[a-z]"));
		System.out.println("1".matches("[a-z]"));
		System.out.println("#".matches("[a-z]"));
		System.out.println();
		
		System.out.println("abc".matches("abc"));
		System.out.println("ab".matches("abc"));
		System.out.println("abcd".matches("abc"));
		System.out.println("aBc".matches("abc"));
		System.out.println("ABC".matches("abc"));
		System.out.println(" abc ".matches("abc"));
		System.out.println(" abc ".matches("\\sabc\\s"));
	}
}
