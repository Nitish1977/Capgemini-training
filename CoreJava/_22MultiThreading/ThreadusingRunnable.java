package _22MultiThreading;
public class ThreadusingRunnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadUsingInterface a=new ThreadUsingInterface();
		Thread t=new Thread(a);
		t.start();
	}
}
class ThreadUsingInterface implements Runnable{
	public void run() {
		System.out.println("sunnable thread running");
	}
}