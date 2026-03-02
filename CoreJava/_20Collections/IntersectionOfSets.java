package _20Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class IntersectionOfSets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(1);
		s1.add(3);
		s1.add(2);
		s1.add(4);
		s1.add(5);
		Set<Integer> s2=new HashSet<>();
		s2.add(1);
		s2.add(5);
		s2.add(10);
		s2.add(6);
		s2.add(8);
		s2.add(4);
		s2.add(7);
		Set<Integer> s=new HashSet();
		Iterator<Integer> i=s1.iterator();
		Iterator<Integer> j=s2.iterator();
		while(i.hasNext()) {
			int a=i.next();
			if(s2.contains(a)) {
				s.add(a);
			}
		}
		while(j.hasNext()) {
			int b=j.next();
			if(s1.contains(b)) {
				s.add(b);
			}
		}
		System.out.println("Intersection of 2 sets: "+s);
	}
}
