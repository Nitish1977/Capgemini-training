package _21REgex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PtternMatcher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("(\\d{2})-(\\d{2})-(\\d{4})");
		Matcher m = p.matcher("DOB: 12-05-2024");

		if (m.find()) {
	  	  System.out.println(m.group());    // full match 	12-05-2024
	  	  System.out.println(m.group(1));   // first group	12
	  	  System.out.println(m.group(2));   // second group	05
	  	  System.out.println(m.group(3));   // third group	2024
		}
	}
}
