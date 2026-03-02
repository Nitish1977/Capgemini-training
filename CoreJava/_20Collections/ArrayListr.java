package _20Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Collections;
public class ArrayListr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(12);
		l.add(13);
		l.add(12);
		l.add(14);
		l.add(14);
		l.add(null);
		l.add(15);
		l.add(11);
		l.add(10);
		l.add(16);
		l.add(null);
		l.add(10);
		System.out.println(l);
		Iterator<Integer> i=l.iterator();
		Set<Integer> hs=new HashSet<>();
		while(i.hasNext()) {
			hs.add(i.next());
		}
		System.out.println(hs);
		Iterator<Integer> j=l.iterator();
		Set<Integer> lhs=new LinkedHashSet<>();
		while(j.hasNext()) {
			lhs.add(j.next());
		}
		System.out.println(lhs);

		
	}
}
