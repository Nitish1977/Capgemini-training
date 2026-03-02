package _21REgex;
public class ZeroOROnePrecedingGorup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("colr").matches("colo?r"));
		System.out.println(("color").matches("colo?r"));
		System.out.println(("coloor").matches("colo?r"));
		System.out.println(("abc").matches("ab(c)?"));
		System.out.println(("ab").matches("ab(c)?"));
		System.out.println(("abcd").matches("ab(c)?"));
	}
}
