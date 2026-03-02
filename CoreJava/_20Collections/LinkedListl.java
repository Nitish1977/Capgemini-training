package _20Collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a=new LinkedList<>();
		a.add("hi");
		a.add("Hlo");
		a.add("mussy");
		a.add("muffin");
		a.add("the");
		a.add("tom");
		a.add("brewer");
		ListIterator<String> li=a.listIterator();
		System.out.println("forward pass");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("backward pass");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}
}
