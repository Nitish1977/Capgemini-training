package _20Collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class StreamExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10);
		System.out.println("To print all elements one by one");
		numbers.stream().forEach(System.out::println);
		
		System.out.println("\nto print only even elements:");
		numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		System.out.println("\nto print odd numbers with extra value 3");
		numbers.stream().filter(n->n%2!=0).map(n->n+3).forEach(System.out::println);
		
		System.out.println("\nfind even numbers and store in anotehr list");
		List<Integer> f=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(f);
		
		List<String> names=List.of("Nitish", "Aditya", "Devansh", "Mohit", "Pawan", "firish");
		System.out.println("\nprint objects end with sh using stream");
		names.stream().filter(n->n.endsWith("sh")).forEach(System.out::println);
		
		List<Studentu> s1=List.of(new Studentu(3, "tom", 75.5),
				new Studentu(4, "brewer", 85.5),
				new Studentu(1, "Vishnu", 80.5),
				new Studentu(2, "daisy", 90.5));
		System.out.println("\n print only those who got marks more than 80 using stream");
		s1.stream().filter(n-> n.marks>=80).forEach(System.out::println);
		
		System.out.println("\nsort Students objects by id in ascending order and print them.");
		s1.stream().sorted(Comparator.comparing(n->n.id)).forEach(System.out::println);
		
		System.out.println("\nsort stududents objects by id in descending order and print them");
		s1.stream().sorted(Comparator.comparing(n->n.id)).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
}
