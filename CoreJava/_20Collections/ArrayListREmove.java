package _20Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayListREmove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] a= {"mussy", "muffin", "kill", "die", "jump", "empty", "well"};
		List<String> l=new ArrayList<>();
		for(String i: a) {
			l.add(i);
		}
		String j=sc.nextLine();
		int i=l.indexOf(j);
		System.out.println(i);
		if(i==-1) {
			System.out.println(j+"is not in list");
		}
		else {
			System.out.println(j+" is at index "+i);
			l.remove(j);
		}
		System.out.println(l);
		
	}

}
