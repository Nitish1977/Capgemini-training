package _20Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set hs = new HashSet();
		hs.add(10);
		hs.add(12);
		hs.add(null);
		hs.add('a');
		hs.add(true);
		hs.add(10);
		hs.add("LPU");
		hs.add('a');
		hs.add(null);
		System.out.println(hs);
		System.out.println("----");
		for(Object obj : hs) {
			System.out.println(obj);
		}
		System.out.println("----");
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
