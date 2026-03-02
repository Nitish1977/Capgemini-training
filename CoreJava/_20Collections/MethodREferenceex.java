package _20Collections;
import java.util.List;
public class MethodREferenceex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empo> a=List.of(new Empo(1, "tom", 34567),
				new Empo(2, "brewer", 45678),
				new Empo(3, "daisy", 56789));
		a.forEach(Empo::disDetails);
	}
}
class Empo{
	int id;
	String name;
	double sal;
	public Empo(int id, String name, double sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void disDetails() {
		System.out.println("-------");
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.sal);
	}
}