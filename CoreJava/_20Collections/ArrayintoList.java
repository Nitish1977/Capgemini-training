package _20Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayintoList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,6,7};
		List<Integer> a=new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			a.add(arr[i]);
		}
		Integer[] arr1= {2,3,4,5,6,7};
		System.out.println(a);
		a.add(2);
		System.out.println(a);
		a.remove(Integer.valueOf(4));
		System.out.println(a);
		List<Integer> l=Arrays.asList(arr1);
		System.out.println(l);
//		l.add(3);	//UnsupportedOperationException
//		l.remove(Integer.valueOf(5));	//UnsupportedOperationException
		System.out.println(l);
		
	}
}
