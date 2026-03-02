package _20Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class RemoveEleWithIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(1);
		s1.add(3);
		s1.add(2);
		s1.add(4);
		s1.add(1);
		s1.add(5);
		s1.add(10);
		s1.add(6);
		s1.add(8);
		s1.add(4);
		s1.add(7);
		Iterator<Integer> i=s1.iterator();
		while(i.hasNext()) {
			if(i.next()%2==0)
				i.remove();
		}
		System.out.println(s1);
	}
}
