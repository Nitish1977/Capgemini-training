package _13StaticNonstatic;
public class Employeee {
	int id;
	String name;
	double sal;
	public Employeee(int id, String name, double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void printDetails() {
		System.out.println("id= "+this.id+", "+"name= "+this.name+", salary= "+this.sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee a=new Employeee(45, "mussy", 56000.0);
		a.printDetails();
		Employeee b=new Employeee(46, "mussi", 57000.0);
		b.printDetails();
		Employeee c=new Employeee(47, "musse", 58000.0);
		c.printDetails();
		Employeee d=new Employeee(48, "mussu", 59000.0);
		d.printDetails();
	}
}
