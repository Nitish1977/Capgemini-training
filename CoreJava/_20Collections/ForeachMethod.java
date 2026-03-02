package _20Collections;
import java.util.Arrays;
import java.util.List;
public class ForeachMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("tom", "mussy", "tim", "gui", "moon","daisy", "gretchen");
		System.out.println("NAmes: "+names);
		names.forEach(i -> System.out.println(i));
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		System.out.println("\nNumbers: "+numbers);
		numbers.forEach(i -> System.out.println(i));
		
		List<Studentu> st=List.of(new Studentu (3, "tam", 75.7), 
				new Studentu(4, "summer", 67.7),
				new Studentu(5, "bonnie", 56.6),
				new Studentu(6, "malam", 56.6),
				new Studentu(7, "mariam", 45.0),
				new Studentu(9, "sylvia", 34.0));
		System.out.println("\nStudetns: "+st);
		st.forEach(i -> System.out.println(i));
		
		System.out.println("\nstudents whose name ends with am: ");
		st.forEach(i-> {
			if(i.name.endsWith("am")){
			System.out.println(i);
			System.out.println(i.name);
		}
		});
		
		System.out.println("\neven students from the list: ");
		st.forEach(i -> {
			if(i.id%2==0) {
				System.out.println(i);
				System.out.println(i.id);
			}
		});
		
		System.out.println(" \nstudents who scored more than 50");
		st.forEach(i->{
			if(i.marks>=50.0) {
				System.out.println(i);
				System.out.println(i.marks);
			}
		});
		
	}
}
