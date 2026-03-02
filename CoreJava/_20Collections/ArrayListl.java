package _20Collections;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayListl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities=new ArrayList<>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("chennai");
		cities.add("kolkota");
		System.out.println(cities);
		cities.add(2, "bangalore");
		System.out.println(cities);
		if(cities.contains("mumbai")) {
			System.out.println("mumbai is in cities");
		}else {
			System.out.println("mumbai is not in cities");
		}
		Collections.sort(cities);
		System.out.println(cities);
		cities.clear();
		System.out.println(cities);
	}
}
