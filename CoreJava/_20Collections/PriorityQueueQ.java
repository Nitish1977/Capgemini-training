package _20Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueQ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> a=new PriorityQueue<>();
		a.offer(17);
		a.offer(10);
		a.offer(15);
		a.offer(26);
		a.offer(7);
		a.offer(13);
		a.offer(10);
		a.offer(14);
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a);
	}
}
