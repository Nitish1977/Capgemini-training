package _20Collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class TrainCompartmentManag {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<>();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		a.add(106);
		a.add(2,999);
		ListIterator<Integer> li=a.listIterator();
		while(li.hasNext()) {
			if(li.next()%2==0) {
				li.remove();
			}
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		int index=0;
		boolean hu=false;
		while(li.hasNext()) {
			if(li.next()==105) {
				hu=true;
				break;
			}
			index++;
		}
		if(hu) {
			System.out.println(index);
		}else {
			System.out.println("compartment not found");
		}
	}
}
