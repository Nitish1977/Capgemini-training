package _16Abstraction;
interface kill{
	abstract public void test();
	abstract public int add(int a, int b);
}
class killer implements kill{
	@Override
	public void test() {
		System.out.println("i will kill");	
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		kill a=new kill(); CTE cannot instantiate the type kill as it is interface not a class
		kill a=new killer();
		a.test();
		System.out.println(a.add(4, 4));
	}
}
