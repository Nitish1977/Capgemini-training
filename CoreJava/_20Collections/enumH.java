package _20Collections;

public class enumH {
		public static void main(String[] args) {
			Orderz o1 = new Orderz(101, OrderStatus.CANCELLED);
			Orderz o2 = new Orderz(102, OrderStatus.OUT_FOR_DELIVERY);
			Orderz o3 = new Orderz(103, OrderStatus.PLACED);
			printOrder(o1);
			printOrder(o2);
			printOrder(o3);
		}
		public static void printOrder(Orderz order) {
	        System.out.println("OrderId : " + order.orderId + " | Status : " + order.status.name() + " | Code : " + order.status.getCode() + " | Message : " + order.status.getMessage() );
	    }
}
enum OrderStatus{
	PLACED(1,"xyz"),PREPARING(2,"ABC"),OUT_FOR_DELIVERY(3,"efh"),DELIVERED(4,"lmn"),CANCELLED(5,"lpu");
	private int code;
	private String message;
	private OrderStatus(int code,String message) {
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}	
}
class Orderz {
	int orderId;
	OrderStatus status;
	public Orderz(int orderId, OrderStatus status) {
		this.orderId = orderId;
		this.status = status;
	}
}