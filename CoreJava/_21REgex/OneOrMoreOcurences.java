package _21REgex;
public class OneOrMoreOcurences {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("Sabcj").matches("S+j"));
		System.out.println(("Sxxj").matches("S+j"));
		System.out.println(("Sj").matches("S+j"));
		System.out.println(("SSj").matches("S+j"));
		System.out.println(("sSj").matches("S+j"));
		System.out.println(("SJJ").matches("S+j"));
		System.out.println(("SSSj").matches("S+j"));
	}
}
