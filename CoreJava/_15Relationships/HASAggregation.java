package _15Relationships;
class Student{
	int id;
	String name;
	double marks;
	Address address;
	public Student(int id, String name, double marks, Address ad){
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=ad;
	}
	public void dis() {
		System.out.println("id= "+this.id+" name= "+this.name+" marks= "+this.marks+" city= "+this.address.city+" state= "+this.address.state);
	}
}
class Address{
	String city;
	String state;
	public Address(String city, String state){
		this.city=city;
		this.state=state;
	}
	public void dis() {
		System.out.println("from address: city: "+this.city+" state: "+this.state);
	}
} 
public class HASAggregation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad=new Address("dmm", "AP");
		Student st=new Student(123, "mussy", 34.5, ad);
		ad.dis();
		st.dis();
	}
}
