package _17ObjectClass;
public class Objequals {
	int id;
	String name;
	public Objequals(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		Objequals ref=(Objequals)obj;
		return this.id==ref.id && this.name==ref.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objequals ref1=new Objequals(1, "hi");
		Objequals ref2=new Objequals(2, "hi");
		
		System.out.println(ref1==ref2);
		System.out.println(ref2.equals(ref1));
	}

}
