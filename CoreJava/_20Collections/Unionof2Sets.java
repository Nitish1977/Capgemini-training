package _20Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Unionof2Sets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(1);
		s1.add(3);
		s1.add(2);
		s1.add(4);
		Set<Integer> s2=new HashSet<>();
		s2.add(1);
		s2.add(5);
		s2.add(10);
		s2.add(6);
		s2.add(8);
		s2.add(4);
		s2.add(7);
		s1.addAll(s2);
		
		System.out.println("Union of 2 sets: "+s1);
		
	}
}
