package _20Collections;
import java.util.List;
import java.util.ArrayList;
public class ListNonGeneric {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add(10);
		al.add(3.5);
		al.add('a');
		al.add("LPU");
		al.add(true);
		System.out.println(al);
		System.out.println(al.size());
		al.add(15);
		System.out.println(al);
		System.out.println(al.size());
		al.add("LPU");
		al.add('a');
		System.out.println(al);
		System.out.println(al.get(1));
		al.add(null);
		System.out.println(al);
		al.remove("LPU");
		System.out.println(al);
	}
}
