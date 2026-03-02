package _13StaticNonstatic;
public class Mobile {
	String brand;
	int storage;
	boolean is5g;
	public Mobile() {
		this.brand="unknown";
		this.storage=64;
		this.is5g=false;
	}
	public Mobile(String brand) {
		this();
		this.brand=brand;
	}
	public Mobile(int storage) {
		this();
		this.storage=storage;
	}
	public Mobile(boolean is5g) {
		this();
		this.is5g=is5g;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj=new Mobile();
		System.out.println(obj.brand);
		System.out.println(obj.storage);
		System.out.println(obj.is5g);
		System.out.println("");
		
		Mobile obj1=new Mobile("hui");
		System.out.println(obj1.brand);
		System.out.println(obj1.storage);
		System.out.println(obj1.is5g);
		System.out.println("");
		
		Mobile obj2=new Mobile(56);
		System.out.println(obj2.brand);
		System.out.println(obj2.storage);
		System.out.println(obj2.is5g);
		System.out.println("");
		
		Mobile obj3=new Mobile(true);
		System.out.println(obj3.brand);
		System.out.println(obj3.storage);
		System.out.println(obj3.is5g);
		System.out.println("");
	}

}
