package _13StaticNonstatic;
public class Copyconstructor {
	int id;
	String name;
	int[] marks=new int[3];
	public Copyconstructor(int id, String name, int[] marks) {
		this.id=id;
		this.name=name;
		for(int i=0; i<3; i++) {
			this.marks[i]=marks[i];
		}
	}
	public Copyconstructor(Copyconstructor obj) {
		this.id=obj.id;
		this.name=obj.name;
		for(int i=0; i<3; i++) {
			this.marks[i]=obj.marks[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		int[] marks= {45,48,43};
		Copyconstructor ref1=new Copyconstructor(123, "mussy", marks);
		System.out.println("these are form original constructor before changing");
		System.out.println(ref1.id);
		System.out.println(ref1.name);
		for(int i=0; i<3; i++) {
			System.out.print(ref1.marks[i]+" ");
		}
		System.out.println(" ");
		Copyconstructor ref2=new Copyconstructor(ref1);
		System.out.println("these are form copy constructor before changing");
		System.out.println(ref2.id);
		System.out.println(ref2.name);
		for(int i=0; i<3; i++) {
			System.out.print(ref2.marks[i]+" ");
		}
		System.out.println(" ");
		ref2.id=345;
		ref2.name="muffin";
		for(int i=0; i<3; i++) {
			ref2.marks[i]=50;
		}
		System.out.println(" ");
		System.out.println("these are form copy constructor after changing");
		System.out.println(ref2.id);
		System.out.println(ref2.name);
		for(int i=0; i<3; i++) {
			System.out.print(ref2.marks[i]+" ");
		}
		System.out.println(" ");
		System.out.println("these are form original constructor after changing");
		System.out.println(ref1.id);
		System.out.println(ref1.name);
		for(int i=0; i<3; i++) {
			System.out.print(ref1.marks[i]+ " ");
		}
		
	}

}
