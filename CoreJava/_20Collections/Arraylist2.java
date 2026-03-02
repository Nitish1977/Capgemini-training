package _20Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(5);
		a.add(20);
		a.add(15);
		a.add(25);
		System.out.println(a);
		a.add(2, 12);
		System.out.println(a);
		if(a.contains(15)) {
			System.out.println(15+" is in list");
		}else {
			System.out.println(15+" is not in list");
		}
		Collections.sort(a);
		System.out.println(a);
		a.remove(Integer.valueOf(5));
		System.out.println(a);
		System.out.println(a.size());
	}
}
