package _20Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class OnlineOrderProcessingSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> l=new ArrayList<>();
		l.add(new Order(105, "Zara",   10000, 5, 1700000005L));
		l.add(new Order(101, "Alice",  10000, 5, 1700000005L));
		l.add(new Order(102, "Alice",  10000, 5, 1700000005L));
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
		Collections.sort(l, new sortOrder());
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
		l.add(new Order(103, "Bob",    10000, 3, 1700000004L));
		l.add(new Order(104, "Bob",    10000, 3, 1700000006L));
		Collections.sort(l, new sortOrder());
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
		l.add(new Order(106, "Charlie",8000,  2, 1700000001L));
		l.add(new Order(107, "Charlie",8000,  2, 1700000000L));
		Collections.sort(l, new sortOrder());
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
		l.add(new Order(108, "David",  8000,  5, 1700000003L));
		Collections.sort(l, new sortOrder());
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
		l.add(new Order(109, "Eve",    5000,  1, 1700000002L));
		l.add(new Order(110, "Eve",    5000,  1, 1700000002L));
		Collections.sort(l, new sortOrder());
		for(Order i: l) {
			System.out.println(i);
		}
		System.out.println();
	}
}
class Order{
	int orderid;
	String custName;
	double orderAmount;
	int itemCount;
	long overTime;
	public Order(int oid, String cn, double oa, int ic, long ot) {
		this.orderid=oid;
		this.custName=cn;
		this.orderAmount=oa;
		this.itemCount=ic;
		this.overTime=ot;
	}
	@Override
	public String toString() {
		return "Order id: "+orderid+", custName: "+custName+", orderAmount: "+orderAmount+", ItemCount: "+itemCount+", overTime: "+overTime;
	}
}
class sortOrder implements Comparator<Order>{
	@Override
	public int compare(Order o1, Order o2) {
		int cmp=Double.compare(o1.orderAmount, o2.orderAmount);
		if(cmp!=0) {
			return cmp;
		}
		cmp=Integer.compare(o1.itemCount, o2.itemCount);
		if(cmp!=0) {
			return cmp;
		}
		cmp=Long.compare(o1.overTime, o2.overTime);
		if(cmp!=0) {
			return cmp;
		}
		cmp=o1.custName.compareTo(o2.custName);
		if(cmp!=0) {
			return cmp;
		}
		cmp=Integer.compare(o1.orderid, o2.orderid);
		return cmp;
	}
}