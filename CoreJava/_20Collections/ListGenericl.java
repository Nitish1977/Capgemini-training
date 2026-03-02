package _20Collections;
import java.util.List;
import java.util.ArrayList;
public class ListGenericl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> pb = new ArrayList<String>();
		pb.add("Sarso da saag");
		pb.add("Chole bhature");
		pb.add("Butter Chicken");
		pb.add("Lassi");
		System.out.println("PB: "+ pb );
		List<String> up= new ArrayList<String>();
		up.add("Litti chokha");
		up.add("Dal chawal");
		up.add("Sattu");
		System.out.println("UP: "+ up);
		List<String> south = new ArrayList<String>();
		south.add("Dosa");
		south.add("Idli");
		south.add("Sambhar");
		south.add("Chutney chutney");
		south.add("Biryani");
		System.out.println("SOUTH: "+ south);
		
		List<String> lpu = new ArrayList<String>();
		lpu.addAll(south);
		lpu.addAll(pb);
		System.out.println("LPU: "+ lpu);
		lpu.addAll(4, up);
		System.out.println("LPU: "+ lpu);
		
		lpu.remove("Idli");
		System.out.println("LPU: "+ lpu);
		
		System.out.println(south.contains("Idli"));
		System.out.println(lpu.contains("Idli"));
		
		System.out.println(pb.remove(0));
		System.out.println("PB: "+ pb);
		
		System.out.println(lpu.containsAll(pb));
		
		System.out.println(lpu.containsAll(south));
		
		System.out.println(lpu.removeAll(south));
		System.out.println("LPU: "+ lpu);
		lpu.clear();
		System.out.println("LPU: "+ lpu);
		System.out.println(lpu.removeAll(south));
	}

}
