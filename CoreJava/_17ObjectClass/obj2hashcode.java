package _17ObjectClass;
public class obj2hashcode {
	int id;
	String name;
	public obj2hashcode(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj2hashcode ref=new obj2hashcode(1, "hi");
		System.out.println(ref);
		System.out.println(ref.hashCode());//1554547125
		System.out.println(Integer.toHexString(ref.hashCode()));//5ca881b5
		System.out.println(ref);//_17ObjectClass.obj2hashcode@5ca881b5
		System.out.println(ref.getClass());//class _17ObjectClass.obj2hashcode
		System.out.println(ref.getClass().getName());//_17ObjectClass.obj2hashcode
		System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));//_17ObjectClass.obj2hashcode@5ca881b5
	}
}
