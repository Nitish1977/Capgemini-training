package _16Abstraction;
class Person{
	public void showrole() {
		System.out.println("iam a person");
	}
}
class Student extends Person{
	public void showroleS() {
		System.out.println("iam a student");
	}
}
class Teacher extends Person{
	public void showroleT() {
		System.out.println("iam a Teacher");
	}
}
class cllgStudent extends Student implements Sports, Cultural{
	public void showroleCS() {
		System.out.println("iam a cllg student");
	}
	public void play() {
		System.out.println("i play sports");
	}
	public void perform() {
		System.out.println("i dance");
	}
}
interface Sports{
	abstract public void play();
}
interface Cultural{
	abstract public void perform();
}

public class Hybridinheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Student();
		a.showrole();
		System.out.println("");
		Student b=(Student)a;
		a.showrole();
		b.showroleS();
		System.out.println("\n");
		Person c=new Teacher();
		c.showrole();
		System.out.println("");
		Teacher d=(Teacher)c;
		d.showrole();
		d.showroleT();
		System.out.println("\n");
		Sports x=new cllgStudent();
		x.play();
		System.out.println("");
		Cultural y=new cllgStudent();
		y.perform();
		System.out.println("\n");
		Student f=new cllgStudent();
		f.showrole();
		f.showroleS();
		System.out.println("");
		cllgStudent g=(cllgStudent )f;
		g.showrole();
		g.showroleS();
		g.showroleCS();
	}
	
}
