package _20Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iteratorl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,21,23,25,26,28,22,23,21,24,25,26};
		List<Integer> b=new ArrayList<>();
		for(int i: a) {
			b.add(i);
		}
		System.out.println(b);
		Iterator<Integer> itr=b.iterator();
		while(itr.hasNext()) {
			
			System.out.println(b);
			itr.next();
			itr.remove();
		}
	}

}
