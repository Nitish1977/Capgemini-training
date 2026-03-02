package _13StaticNonstatic;
public class OverLoadingExample {
	public static void display(int a) {
		System.out.println("iam "+a);
	}
	public static void display(String y) {
		System.out.println("iam "+y);
	}
	public void display(int a, double b) {
		System.out.println("we are "+a+" and "+b);
	}
	public void display() {
		System.out.println("iam :(");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(7);
		display("mussy");
		OverLoadingExample a=new OverLoadingExample();
		a.display();
		a.display(5, 5.6);
	}
}
