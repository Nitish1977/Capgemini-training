package _21REgex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java 123 and 456 released on 12-05-2024";

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("-----");
        }
	}
}
