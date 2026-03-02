package _22MultiThreading;
public class ThreadusingClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creating_TreadusingClass a=new Creating_TreadusingClass();
		a.start();
	}
}
class Creating_TreadusingClass extends Thread{
	public void run() {
		System.out.println("thread running");
	}
}