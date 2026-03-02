package _13StaticNonstatic;
class Employ{
	private int emp_id;
	private String emp_name;
	private double emp_sal;
	public Employ(int id, String name, double sal) {
		this.emp_id=id;
		this.emp_name=name;
		this.emp_sal=sal;
	}
	public int getid() {
		return emp_id;
	}
	public String getname() {
		return emp_name;
	}
	public void setid(int emp_id, String emp_name) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
	}
	public  String getsal() {
		return "my salaray is "+emp_sal;
	}
}
public class Employes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employ a=new Employ(34, "musst", 56000.0);
		System.out.println(a.getid()+" "+a.getname()+" "+a.getsal());
		a.setid(0, null);
		System.out.println(a.getid()+" "+a.getname()+" "+a.getsal());
	}

}
