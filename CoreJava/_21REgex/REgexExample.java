package _21REgex;
import java.util.List;
public class REgexExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Hello World -> true
Java 8 -> true
User1 Name -> true
Suraj Kumar -> true
A B -> true
Test Case -> true
Hello -> false
Java8 -> false
123 -> false
HelloWorld -> false
 Hello World -> false
Hello  World -> false
		 */
		List<String> l=List.of("Java 8", "User1 Name", "Suraj Kumar","A B", "Test Case","Hello", "Java8", "123","HelloWorld"," Hello World","Hello  World");
		for(String i: l) {
			System.out.print(i+" -> ");
			System.out.println(i.matches("(\\w+) (\\w+)"));
		}
	}
}
