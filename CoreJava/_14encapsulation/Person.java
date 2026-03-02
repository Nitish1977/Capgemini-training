package _14encapsulation;
class Hu{
	private int age;
	private String name, country;
	public Hu(int age, String name, String country) {
		this.age=age;
		this.name=name;
		this.country=country;
	}
	public int getA() {
		return this.age;
	}
	public String getN() {
		return this.name;
	}
	public String getC() {
		return this.country;
	}
	public void setA(int age) {
		this.age=age;
	}
	public void setN(String name) {
		this.name=name;
	}
	public void setC(String country) {
		this.country=country;
	}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hu a=new Hu(45, "jayjay", "philipij") ;
		System.out.println(a.getA()+" "+ a.getN()+ " "+ a.getC());
		a.setN("mussy");
		a.setC("hiui");
		a.setA(87);
		System.out.println(a.getA()+" "+ a.getN()+ " "+ a.getC());
	}

}
