package _22MultiThreading;
public class DaemonThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a=new Thread(()->{
			while(true) {
				System.out.println("Daemonthread running");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println("Daemon thread interrupted");
				}
			}
		});
		a.setDaemon(true);
		a.start();
		for(int i=1; i<=5; i++) {
			System.out.println("Main threading running"+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println("main thread interruptded");
			}
		}
		System.out.println("Main thread finished");
	}
}

