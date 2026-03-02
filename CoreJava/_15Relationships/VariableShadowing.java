package _15Relationships;
class Fat{
	int a=10;
	static int b=100;
}
class S extends Fat{
	int a=20;
	static int b=200;
}
public class VariableShadowing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		System.out.println("--father object stored in father ref variable");
		Fat ref1=new Fat();
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		System.out.println("--son object stored in son ref variable");
		S ref2=new S();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("--upcasting");
		Fat ref3=new S();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		System.out.println("--downcasting");
		S ref4=(S)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
	}
}
