package _20Collections;
import java.util.Set;
import java.util.TreeSet;
public class TreeSete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new TreeSet<String>();
		s.add("hi");
		s.add("mussy");
		s.add("daisy");
		s.add("tom");
		s.add("daisy");
		s.add("sydney");
		s.add("tom");
		s.add("brewer");
		System.out.println("asc: "+s);
		TreeSet<String> ts=(TreeSet)s;
		System.out.println("desc: "+ts.descendingSet());
	}
}
