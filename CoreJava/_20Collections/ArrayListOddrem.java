package _20Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListOddrem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,21,23,25,26,28,22,23,21,24,25,26};
		List<Integer> b=new ArrayList<>();
		for(int i: a) {
			b.add(i);
		}
		System.out.println(b);
		for(int i=b.size()-1; i>=0; i--) {
			if(b.get(i)%2!=0) {
				b.remove(i);
			}
		}
		System.out.println(b);
	}
}
