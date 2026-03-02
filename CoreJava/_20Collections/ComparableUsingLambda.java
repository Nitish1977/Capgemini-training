package _20Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studentu> st = new ArrayList<Studentu>();
		st.add(new Studentu(3, "Murali", 75.5));
		st.add(new Studentu(4, "Aditya", 85.5));
		st.add(new Studentu(1, "Vishnu", 80.5));
		st.add(new Studentu(2, "Pramod", 90.5));
		st.add(new Studentu(2, "Suraj", 55.5));
		System.out.println(st);
		Collections.sort(st);
		System.out.println("\n--Sorted by id--");
		for (Studentu s : st) {
			System.out.println(s);
		}
		System.out.println("\n--Sorted by name--");
		Collections.sort(st,new SortByNames());
		for (Studentu s : st) {
			System.out.println(s);
		}
		
		System.out.println("\n--Sorted by marks--");
		Collections.sort(st, new SortByMarks());
		for (Studentu s : st) {
			System.out.println(s);
		}
		Comparator<Studentu> a=new SortByNames() {
			@Override
			public int compare(Studentu s1, Studentu s2) {
				return s1.name.compareTo(s2.name);
			}
		};
		Comparator<Studentu> b=( s1,  s2) ->  s1.name.compareTo(s2.name);
		Comparator<Studentu> c=(s1,s2) -> Double.compare(s1.marks, s2.marks);
		System.out.println("\n using lambda");
		Collections.sort(st, c);
		for (Studentu s : st) {
			System.out.println(s);
		}
	}

}
//class Studentu implements Comparable<Studentu>{
//	int id;
//	String name;
//	double marks;
//	public Studentu(int id, String name, double marks) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.marks = marks;
//	}
//	@Override
//	public String toString() {
//		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
//	}
//	@Override
//	public int compareTo(Studentu s) {
//		return this.id - s.id;
//	}
//}
//we are useing already existing studentu class




