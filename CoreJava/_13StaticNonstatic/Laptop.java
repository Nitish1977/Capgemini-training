package _13StaticNonstatic;
public class Laptop {
	String brand;
	int ramsize;
	double price;
	public Laptop() {
		this.brand="unknown";
		this.ramsize=8;
		this.price=50000.0;
	}
	public Laptop(String brand) {
		this();
		this.brand=brand;
	}
	public Laptop(int ramsize, String brand) {
		this();
		this.brand=brand;
		this.ramsize=ramsize;
	}
	public Laptop(int ramsize, String brand, double price) {
		this.price=price;
		this.brand=brand;
		this.ramsize=ramsize;
	}
	public static void printDetails(Laptop obj) {
		System.out.println("ramsize= "+obj.ramsize+", brand= "+obj.brand+", price= "+obj.price);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop a=new Laptop();
		printDetails(a);
		Laptop b=new Laptop("heloo");
		printDetails(b);
		Laptop c=new Laptop(56, "jui");
		printDetails(c);
		Laptop d=new Laptop(45, "ku", 56700.0);
		printDetails(d);
		
	}

}
