package _16Abstraction;
interface Pop{
	int a=10;
	static int b=20;
	public static void test(){
		System.out.println("Pop static method");
	}
	abstract public void Pabs();
}
interface Mother{
	int a=30;
	static int b=40;
	public static void test(){
		System.out.println("Pop static method");
	}
	abstract public void Mabs();
}
class Child implements Pop, Mother{
	@Override
	public void Pabs(){
		System.out.println("Pop abstract method");
	}
	@Override
	public void Mabs() {
		System.out.println("Mother abstract method");
	}
}
public class Multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pop a=new Child();
		Mother b=new Child();
		System.out.println(Pop.a);
		System.out.println(Pop.b);
		System.out.println(Mother.a);
		System.out.println(Mother.b);
		a.Pabs();
		b.Mabs();
	}

}
