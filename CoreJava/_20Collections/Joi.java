package _20Collections;
import java.util.List;
import java.util.ArrayList;
public class Joi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1, "hi", 340.0);
		e.createobj(e);
		Company c=new Company();
		c.addEmp(e);
		c.displ();
	}
}
class Employee{
	int empid;
	String name;
	double sal;
	public Employee(int id, String n, double sal) {
		this.empid=id;
		this.name=n;
		this.sal=sal;
	}
	public static Employee createobj(Employee e) {
		return new Employee(e.empid, e.name, e.sal);
	}
	public void dis() {
		System.out.println("empid: "+empid);
		System.out.println("name: "+name);
		System.out.println("salary: "+sal);
	}
}
class Company{
	List<Employee> l=new ArrayList<>();
	public void addEmp(Employee e) {
		l.add(e);
	}
	public void displ() {
		for(Employee i: l) {
			i.dis();
		}
	}
}
