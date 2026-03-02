package _17ObjectClass;
public class Objclass1 {
	int id;
	String name;
	public Objclass1(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Objclass1 [id=" +id+"] [name="+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objclass1 ref=new Objclass1(1, "hi");
		System.out.println(ref);
		System.out.println(ref.toString());
	}

}
