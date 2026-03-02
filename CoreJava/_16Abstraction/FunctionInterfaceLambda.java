package _16Abstraction;
@FunctionalInterface
interface F1{
	public void greet();
}
@FunctionalInterface
interface F2{
	public int add(int a, int b);
}
public class FunctionInterfaceLambda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1 a=new F1() {
			@Override
			public void greet() {
				System.out.println("Hello Ardieana using anonymous class");			
			}
		};
		a.greet();
		
		F1 b= () -> System.out.println("hello using lambda");
		b.greet();
		
		F2 c=new F2() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println("add using anonymous class: "+c.add(10, 224));
		
		F2 d= ( g,h) -> g,h;
		System.out.println("using lambda add: "+d.add(65, 35));
	}
}
