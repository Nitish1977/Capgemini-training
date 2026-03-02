package _15Relationships;
class Vehicl{
	public void speedup() {
		System.out.println("ulululu");
	}
	public void thu(int a) {
		System.out.println(a+"v");
	}
}
class Ca extends Vehicl{
	@Override
	public void speedup() {
		System.out.println("car cara car");
	}
	@Override
	public void thu(int r) {
		System.out.println(r+"c");
	}
}
class Bicycl extends Vehicl{
	@Override
	public void speedup() {
		System.out.println("bibibbi");
	}
	public void thu(int z) {
		System.out.println(z+"p");
	}
}
public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicl a=new Vehicl();
		a.speedup();
		a.thu(1);
		System.out.println("");
		Ca b=new Ca();
		b.speedup();
		b.thu(2);
		Bicycl c=new Bicycl();
		c.speedup();
		c.thu(3);
		
		Vehicl d=new Ca();
		d.speedup();
		d.thu(4);
		
		Vehicl e=new Bicycl();
		e.speedup();
		e.thu(5);
		
		Ca f=(Ca)d;
		f.speedup();
		f.thu(6);
		
		Bicycl g=(Bicycl)e;
		g.speedup();
		g.thu(7);
		}
}
