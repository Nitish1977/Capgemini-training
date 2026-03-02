package _16Abstraction;
interface Resizable{
	abstract public void resizeWidth(int width);
	abstract public void resizeHeight(int height);
}
class Rectangle implements Resizable{
	private int width;
	private int height;
	public Rectangle(int w, int h) {
		this.width=w;
		this.height=h;
	}
	public void getHeight() {
		System.out.println("Height: "+this.height);
	}
	public void getWidth() {
		System.out.println("Width: "+this.width);
	}
	@Override
	public void resizeWidth(int width) {
		this.width=width;
	}
	@Override
	public void resizeHeight(int height) {
		this.height=height;
	}	
}
public class Interface1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resizable a=new Rectangle(45, 56);
		Rectangle b=(Rectangle)a;
		System.out.println("Before resizing: ");
		b.getHeight();
		b.getWidth();
		a.resizeHeight(12);
		a.resizeWidth(12);
		System.out.println("After resizing: ");
		b.getWidth();
		b.getHeight();
		
	}
}
