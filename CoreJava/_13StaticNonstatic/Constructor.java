package _13StaticNonstatic;
public class Constructor {
	int id;
	double percentage;
	String name;
	static String cllg;
	public Constructor(int id) {
		this.id=id;
	}
	public Constructor(String name) {
		this.name=name;
	}
	public Constructor(double percentage) {
		this.percentage=percentage;
	}
	public Constructor(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Constructor(int id, double percentage) {
		this.id=id;
		this.percentage=percentage;
	}
	public Constructor(String name, double percentage) {
		this.name=name;
		this.percentage=percentage;
	}
	public Constructor( int id,String name, double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	public Constructor() {
		this.id=123;
		this.name="mussy";
		this.percentage=78.6;
	}
	public static void printDetail() {
		Constructor ref=new Constructor();
		System.out.println("default id: "+ref.id);
		System.out.println("default name: "+ref.name);
		System.out.println("default percenatge: "+ref.percentage);
		Constructor obj1=new Constructor(23);
		System.out.println("only id: "+obj1.id);
		Constructor obj2=new Constructor("muffin");
		System.out.println("only name: "+obj2.name);
		Constructor obj3=new Constructor(45.6);
		System.out.println("only percenatge: "+obj3.percentage);
		Constructor obj4=new Constructor(24, "lolli");
		System.out.println("id and name( id: "+obj4.id);
		System.out.println("id and name( name: "+obj4.name);
		Constructor obj5=new Constructor("kui", 67.8);
		System.out.println("name and percenatge( name: "+obj5.id);
		System.out.println("name and percantge( npercetage: "+obj5.name);
		Constructor obj6=new Constructor(89, "uhi", 90.8);
		System.out.println("all( id: "+obj6.id);
		System.out.println("all( name: "+obj6.name);
		System.out.println("all( percenatge: "+obj6.percentage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		printDetail();
		System.out.println("main end");
	}

}
