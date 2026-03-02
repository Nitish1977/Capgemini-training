package _15Relationships;
class Fther{
	int a=10;
}
class Sn extends Fther{
	int b=20;
}
public class UpcastingDowncasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		System.out.println("---object of father store inside father class ref variable---");
		Fther ref1=new Fther();	//can onky access father class
		System.out.println(ref1.a);
		//System.out.println(ref1.b); CTE cannot find symbol
		System.out.println("---object of son store inside son class ref variable---");
		Sn ref2=new Sn();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println("--upasting--");
		Fther ref3=new Sn();
		System.out.println(ref3.a);
		//System.out.println(ref3.b);
		System.out.println("---downcating---");
		Sn ref4=(Sn)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
	}
}
