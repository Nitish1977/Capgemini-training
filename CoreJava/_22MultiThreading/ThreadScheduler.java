package _22MultiThreading;
public class ThreadScheduler {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d t1=new d();
		d t2=new d();
		d t3=new d();
		d t4=new d();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class d extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}