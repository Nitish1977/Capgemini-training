package _15Relationships;
class Level1{
	int a=10;
}
class Level2 extends Level1{
	int b=20;
}
class Level3 extends Level2{
	int c=30;
}
class Level4 extends Level3{
	int d=40;
}
public class CandyCrush {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Level1 object in level1 ref var");
		Level1 ref1=new Level1();
		System.out.println(ref1.a);
//		System.out.println(ref1.b);
//		System.out.println(ref1.c);
//		System.out.println(ref1.d);
		System.out.println("--Level2 object in level2 ref var");
		Level2 ref2=new Level2();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
//		System.out.println(ref2.c);
//		System.out.println(ref2.d);
		System.out.println("--Level3 object in level3 ref var");
		Level3 ref3=new Level3();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		System.out.println(ref3.c);
//		System.out.println(ref3.d);
		System.out.println("--Level4 object in level4 ref var");
		Level4 ref4=new Level4();
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println(ref4.c);
		System.out.println(ref4.d);
		
		System.out.println("--upcasting /level4 to level1");
		Level1 ref5=new Level4();
		System.out.println(ref5.a);
//		System.out.println(ref5.b);
//		System.out.println(ref5.c);
//		System.out.println(ref5.d);
		
		System.out.println("--downcasting ref5 to level2");
		Level2 ref6=(Level2)ref5;
		System.out.println(ref6.a);
		System.out.println(ref6.b);
//		System.out.println(ref6.c);
//		System.out.println(ref6.d);
		
		System.out.println("--downcasting ref5 to level3");
		Level3 ref7=(Level3)ref5;
		System.out.println(ref7.a);
		System.out.println(ref7.b);
		System.out.println(ref7.c);
//		System.out.println(ref7.d);
		
		System.out.println("--downcasting ref5 to level4");
		Level4 ref8=(Level4)ref5;
		System.out.println(ref8.a);
		System.out.println(ref8.b);
		System.out.println(ref8.c);
		System.out.println(ref8.d);
	}
}
