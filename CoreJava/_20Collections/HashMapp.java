package _20Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
public class HashMapp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map hm=new HashMap();
		System.out.println(hm.put(1,  "mussy"));	//null
		System.out.println(hm.put(12.2,  12.5));	//null
		System.out.println(hm.put(1,  "muffin"));	//muffin
		hm.put(10,  "Xyz");
		hm.put(12.5,  false);
		hm.put(null,  null);
		hm.put(true,  10);
		hm.put('a', 'a');
		hm.put("LPU", 100);
		System.out.println(hm);
		
		System.out.println(hm.remove(true));
		System.out.println(hm.remove("jalandhar"));
		
		System.out.println(hm.containsKey(true));
		System.out.println(hm.containsKey("LPU"));
		
		System.out.println(hm.containsValue("Xyz"));
		System.out.println(hm.containsValue(10));
		
		System.out.println(hm.get(10));
		
		Set entries=hm.entrySet();
		System.out.println("Set: "+entries);
		
		for(Object obj:entries) {
			System.out.println(obj);
		}
		
		Set keys=hm.keySet();
		System.out.println("Keys: "+keys);
		
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collection values=hm.values();
		System.out.println("VALUES: "+values);
		
		Iterator it1=values.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
