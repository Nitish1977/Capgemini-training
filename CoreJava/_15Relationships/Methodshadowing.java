package _15Relationships;
class a{
	public static void test() {
		System.out.println("father test method");
	}
	public static void demo(int i) {
		System.out.println("father demo method");
	}
}
class b extends a{
	public static void test() {
		System.out.println("son test method");
	}
	public static void demo(int i) {
		System.out.println("son demo method");
	}
}
public class Methodshadowing {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("main start");
		System.out.println("--father object stored in father ref variable");
		a ref1=new a();
		ref1.test();
		ref1.demo(0);
		System.out.println("--son object stored in son ref variable");
		b ref2=new b();
		ref2.test();
		ref2.demo(0);
		System.out.println("--upcasting");
		a ref3=new b();
		ref3.test();
		ref3.demo(0);
		System.out.println("--downcasting");
		b ref4=(b)ref3;
		ref4.test();
		ref4.demo(0);
	}
}
