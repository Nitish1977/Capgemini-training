package _20Collections;
import java.util.Arrays;
import java.util.List;
public class MethodREfernces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1 obj=(a,b)->a+b;
		System.out.println("Using lambda exp: "+obj.add(20, 30 ));
		F1 ob=Integer::sum;
		System.out.println("Using method rrfernecning: "+ob.add(10,20 ));
		List<String> names=Arrays.asList("a", "b","c","d","e");
		System.out.println("\nNames: "+names);
		names.forEach(name -> System.out.println(name));
		System.out.println("\nusing method refernce: ");
		names.forEach(System.out::println);
	}

}
@FunctionalInterface
interface F1{
	int add(int a, int b);
}