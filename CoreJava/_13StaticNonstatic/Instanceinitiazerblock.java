package _13StaticNonstatic;
public class Instanceinitiazerblock {
	static {
		System.out.println("this is static block. main is not yet started");
		Instanceinitiazerblock obj=new Instanceinitiazerblock();
		obj.te();
		System.out.println("static block ended");
	}
	public void te() {
		System.out.println("test method executed");
	}
	{
		System.out.println("this is non-static block ,new object created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		System.out.println("main end");
	}

}
