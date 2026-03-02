package _22MultiThreading;
public class MEthods1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1 a=new t1();
		a.start();
		t2 b=new t2();
		b.start();
	}
}
class t1 extends Thread{
	public void run() {
		System.out.println("thread1 running");
	}
}
class t2 extends Thread{
	public void run() {
		System.out.println("thread2 running");
	}
}