package selfassement;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet obj = new HashSet();
		obj.add("test");
		obj.add(1);
		System.out.println(obj);
//		obj.remove(1);
		System.out.println(obj.contains(1));
		for(Object ref:obj) {
			System.out.println(ref);
		
		}
		
		TreeSet ref = new TreeSet();
		ref.add(1234567);
		ref.add(1234);
		System.out.println(ref.contains(1234));
		for(Object obj1:ref) {
			System.out.println(obj1);
		}
		
		
		
		
	}

}
