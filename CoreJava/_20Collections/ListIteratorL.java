package _20Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"mussy", "muffin", "kill", "knife"};
		List<String> l=new ArrayList<>();
		for(String i:s) {
			l.add(i);
		}
		ListIterator<String> ltr=l.listIterator();
		System.out.println("==forward==");
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("==backward==");
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
	}
}
