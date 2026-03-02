package _13StaticNonstatic;
public class Address {
	String city;
	public Address(String city) {
		this.city=city;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("hyd");
		Employee emp1=new Employee(123, ad);
		System.out.println(emp1.id);
		System.out.println(emp1.address.city);
		Employee emp2=new Employee(emp1);
		System.out.println(emp2.id);
		System.out.println(emp2.address.city);
		emp2.address.city="ban";
		System.out.println(emp1.address.city);
		System.out.println(emp2.address.city);
		
	}

}
class Employee{
	int id;
	Address address;
	public Employee(int id, Address address) {
		this.id=id;
		this.address=address;
	}
	public Employee(Employee obj) {
		this.id=obj.id;
		this.address=obj.address;
	}
	
}
