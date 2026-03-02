package _20Collections;
import java.util.List;
import java.util.ArrayList;
public class ListGeneric {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<>();
		a.add("mussy");
		a.add("mussin");
		a.add("muffin");
		a.add("kill");
		a.add("crude");
		a.add("poke");
		int n=a.size();
		System.out.println(a);
		for(int i=0; i<n; i++) {
			System.out.println(a.get(i));
		}
	}
}
