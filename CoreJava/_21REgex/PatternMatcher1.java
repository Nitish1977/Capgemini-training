package _21REgex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcher1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("Java 123 and 456");

		while (m.find()) {
	 	   System.out.println(m.group());
		}
		Pattern p1 = Pattern.compile("(\\w+)@(\\w+\\.\\w+)");
		Matcher m1 = p1.matcher("mail: test@gmail.com");

		if (m1.find()) {
	  	  System.out.println("User: " + m1.group(1)); // User: test
	  	  System.out.println("Domain: " + m1.group(2)); // Domain: gmail.com
		}
	}
}
