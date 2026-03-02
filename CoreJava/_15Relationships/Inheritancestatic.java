package _15Relationships;

class Fathe{
	static int a=10;
	public static void test() {
		System.out.println("Father class static method");
	}
	static{
		System.out.println("SIB father class");
	}
}
class So extends Fathe{
	static int b=10;
	public static void demo() {
		System.out.println("Sonr class  static method");
	}
	static{
		System.out.println("SIB son class");
	}
}
public class Inheritancestatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Fathe.a);
		Fathe.test();
		System.out.println(So.a);
		System.out.println(So.b);
		So.demo();
		
		System.out.println(So.a);
		System.out.println(So.b);
		So.demo();
		System.out.println(Fathe.a);
		Fathe.test();

	}

}
