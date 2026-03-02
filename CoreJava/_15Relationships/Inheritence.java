package _15Relationships;
class Father{
	int a=10;
	public void test() {
		System.out.println("Father class non static method");
	}
	{
		System.out.println("IIB father class");
	}
	public Father() {
		System.out.println("father class constructor");
	}
}
class Son extends Father{
	int a=10;
	public void demo() {
		System.out.println("Sonr class non static method");
	}
	{
		System.out.println("IIB son class");
	}
	public Son() {
		System.out.println("Son class constructor");
	}
}
public class Inheritence {
	{
		System.out.println("IIB Driver class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Son ref=new Son();
		So.demo();
		So.test();
		ref.demo();
		ref.test();
		System.out.println("main end");
	}
}
