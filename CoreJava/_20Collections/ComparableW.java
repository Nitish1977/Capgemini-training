package _20Collections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;
public class ComparableW {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studentz> l=new ArrayList<>();
		l.add(new Studentz(3, "brewer", 34.5));
		l.add(new Studentz(5, "tom", 45.5));
		l.add(new Studentz(1, "daisy", 56.3));
		l.add(new Studentz(2, "gui", 34.6));
		l.add(new Studentz(4, "tim", 56.7));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
}
}
class Studentz implements Comparable<Studentz>{
	int id;
	String name;
	double marks;
	public Studentz(int id, String name, double marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "[id: "+id+", name: "+name+", marks: "+marks+"]";
	}
	@Override
	public int compareTo(Studentz s) {
		return this.id-s.id;
	}
}

