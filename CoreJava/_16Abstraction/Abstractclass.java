package _16Abstraction;
abstract class hu{
	abstract public void test();
	abstract public int add(int a,int b);
}
class g extends hu{
	@Override
	public void test() {
		System.out.println("ululu");
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}
public class Abstractclass {
	public static void main(String[] args) {
			hu a=new g();
			a.test();
			System.out.println(a.add(4, 5));
			//downcasting
			g b=(g)a;
			b.test();
			System.out.println(b.add(5, 6));
	}
}
