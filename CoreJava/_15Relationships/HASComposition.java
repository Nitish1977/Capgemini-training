package _15Relationships;
class Engine{
	public void start() {
		System.out.println("engine started");
	}
	public void stop() {
		System.out.println("engine stoped");
	}
}
class Car{
	private Engine eng;
	public Car() {
		eng=new Engine();
	}
	public void drive() {
		eng.start();
		System.out.println("car driving");
	}
	public void park() {
		eng.stop();
		System.out.println("car parked");
	}
}
public class HASComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.drive();
		c.park();
	}

}
