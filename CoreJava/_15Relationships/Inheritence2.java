package _15Relationships;
class Engineer{
	public void work() {
		System.out.println("Iam an engineer");
	}
}
class CSEEngineer extends Engineer{
	public void coding() {
		System.out.println("i do coding");
	}
}
public class Inheritence2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSEEngineer a=new CSEEngineer();
		a.work();
		a.coding();
		
		System.out.println("--upcasting--");
		Engineer b=new CSEEngineer();
		b.work();
		//b.coding();
		
		System.out.println("--downcasting--");
		CSEEngineer c=(CSEEngineer)b;
		c.work();
		c.coding();
	}
}
