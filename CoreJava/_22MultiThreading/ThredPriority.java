package _22MultiThreading;

public class ThredPriority {
	public static void main(String[] args) {
		Hui t1=new Hui();
		Hui t2=new Hui();
		Hui t3=new Hui();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.start();
		t3.start();
	}
}
class Hui extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
