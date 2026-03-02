package _15Relationships;
class aa{
	public void test() {
		System.out.println("father test method");
	}
	public void demo(int i) {
		System.out.println("father demo method");
	}
}
class bb extends aa{
	@Override
	public void test() {
		System.out.println("son test method");
	}
	@Override
	public void demo(int i) {
		System.out.println("son demo method");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("main start");
		System.out.println("--father object stored in father ref variable");
		aa ref1=new aa();
		ref1.test();
		ref1.demo(0);
		System.out.println("--son object stored in son ref variable");
		bb ref2=new bb();
		ref2.test();
		ref2.demo(0);
		System.out.println("--upcasting");
		aa ref3=new bb();
		ref3.test();
		ref3.demo(0);
		System.out.println("--downcasting");
		bb ref4=(bb)ref3;
		ref4.test();
		ref4.demo(0);
	}

}
