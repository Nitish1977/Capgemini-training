package _16Abstraction;
abstract class Fu{
	static int a=10;
	int b=20;
	public static void test() {
		System.out.println("static method");
	}
	public void demo() {
		System.out.println("non static method");
	}
	abstract public void abs();
	static {
		System.out.println("static initializer block");
	}
	{
		System.out.println("instance initializer block");
	}
	public Fu() {
		System.out.println("constructor");
	}
}
class Gu extends Fu{
	@Override
	public void abs() {
		System.out.println("abstract class overriden");
	}
}

public class Abstractclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fu a=new Gu();
		System.out.println(a.a);
		System.out.println(a.b);
		a.test();
		a.demo();
		a.abs();
		
		
	}
}
