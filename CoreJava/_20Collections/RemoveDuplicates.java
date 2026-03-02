package _20Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<>();
		s.add(4);
		s.add(5);
		s.add(2);
		s.add(1);
		s.add(1);
		s.add(4);
		s.add(7);
		s.add(6);
		s.add(1);
		s.add(5);
		System.out.println(s);
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
