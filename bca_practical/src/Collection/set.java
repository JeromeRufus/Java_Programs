package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set ref = new HashSet();
		ref.add("Hello World");
		ref.add(44);
		System.out.println(ref.contains(44));
		//ref.remove("Hello World");
		
		for(Object obj:ref) {
			System.out.println(obj);
		}
		
		Map map = new HashMap();
		map.put(1, 20);
		map.get(1);
		
		
		

	}

}
