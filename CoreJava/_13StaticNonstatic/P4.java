package _13StaticNonstatic;

public class P4 {
	static int x = 5;
	static int y;

	static {
		System.out.println("SB-1 Start");
		y = x++ + ++x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-1 End");
	}

	static {
		System.out.println("SB-2 Start");
		x = y-- - --x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SB-2 End");
	}
	public static void calculate(int x) {
		System.out.println("SM-1 Start");
		int y = x++ + ++P4.x;
		System.out.println("local x = " + x);
		System.out.println("local y = " + y);
		P4.y = y + x;
		System.out.println("static y = " + P4.y);
		System.out.println("SM-1 End");
	}
	public static int process() {
		System.out.println("SM-2 Start");
		int x = P4.x + y++;
		P4.x = x - --y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("SM-2 End");
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		calculate(x++);
		int result = process();
		System.out.println("result = " + result);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Main End");

	}

}
