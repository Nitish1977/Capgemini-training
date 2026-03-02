package _13StaticNonstatic;
public class DemoClass {
	static {
		System.out.println("iam alwyas first excuted");
	}
	static {
		System.out.println("iam always second executed");
	}
	{
		System.out.println("i execute when object is created");
	}
	public DemoClass() {
		System.out.println("iam a constructor");
	}
	public void displayMessage() {
		System.out.println("iam a non static method");
	}
	public static void staticMethodOne() {
		System.out.println("iam static method one1");
	}
	public static void staticMethodTwo() {
		System.out.println("iam static method Two2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass.staticMethodOne();
		DemoClass.staticMethodTwo();
		DemoClass a=new DemoClass();
		a.displayMessage();
	}
}
