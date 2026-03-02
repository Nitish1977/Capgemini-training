package _19ExceptionHandling;
public class BoxingUnboxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=2;
		Byte a1=a;
		System.out.println("implicit boxing of byte: "+a1);
		Byte a2=Byte.valueOf(a);
		System.out.println("explicit boxing of byte: "+a2);
		byte a3=a1;
		byte a4=a1.byteValue();
		System.out.println("implicit unboxing of byte: "+a3);
		System.out.println("explicit unboxing of byte: "+a4);
		
		
		short b=1;
		Short b1=b;
		Short b2=Short.valueOf(b);
		short b3=b1;
		short b4=b1.shortValue();
		System.out.println("implicit boxing of short: "+b1);
		System.out.println("explicit boxing of short: "+b2);
		System.out.println("implicit unboxing of short: "+b3);
		System.out.println("explicit unboxing of short: "+b4);
		
		
		long c=3;
		Long c1=c;
		Long c2=Long.valueOf(c);
		long c3=c1;
		long c4=c1.shortValue();
		System.out.println("implicit boxing of long: "+c1);
		System.out.println("explicit boxing of long: "+c2);
		System.out.println("implicit unboxing of long: "+c3);
		System.out.println("explicit unboxing of long: "+c4);
		
		
		float d=4.0f;
		Float d1=d;
		Float d2=Float.valueOf(d1);
		float d3=d1;
		float d4=d1.shortValue();
		System.out.println("implicit boxing of float: "+d1);
		System.out.println("explicit boxing of float: "+d2);
		System.out.println("implicit unboxing of float: "+d3);
		System.out.println("explicit unboxing of float: "+d4);
		
		
		double e=5.0;
		Double e1=e;
		Double e2=Double.valueOf(d);
		double e3=e1;
		double e4=e1.doubleValue();
		System.out.println("implicit boxing of double: "+e1);
		System.out.println("explicit boxing of double: "+e2);
		System.out.println("implicit unboxing of fdouble: "+e3);
		System.out.println("explicit unboxing of double: "+e4);
		
	}
}
