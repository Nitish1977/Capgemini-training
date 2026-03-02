package _20Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListItrBackrem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"mussy", "muffin", "kill", "knife"};
		List<String> l=new ArrayList<>();
		for(String i : s) {
			l.add(i);
		}
		ListIterator<String> ltr=l.listIterator();
		while(ltr.hasNext()) {
			ltr.next();
		}
		while(ltr.hasPrevious()) {
			ltr.previous();
			System.out.println(l);
			ltr.remove();
		}
		
	}
}
