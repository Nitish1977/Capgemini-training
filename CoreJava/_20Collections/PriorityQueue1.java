package _20Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Task> task=new PriorityQueue<>();
		task.offer(new Task("Hello", 2));
		task.offer(new Task("hi", 1));
		task.offer(new Task("Sydney", 5));
		task.offer(new Task("Daisy", 3));
		task.offer(new Task("Bonnie", 4));
		while(!task.isEmpty()) {
			System.out.println(task.poll());
		}
	}

}
class Task implements Comparable<Task>{
	String name;
	Integer priority;
	public Task(String name, Integer prio) {
		this.name=name;
		this.priority=prio;
	}
	@Override
	public int compareTo(Task t) {
		return this.priority-t.priority;
	}
	@Override
	public String toString() {
		return "("+name+","+priority+")";
	}
}
