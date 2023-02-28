package Collection;

import java.util.List;
import java.util.Vector;

public class vectorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> obj = new Vector();
		obj.add("Jerome");
		obj.add("Rufus");
		obj.add("SJC");
		System.out.println(obj);
		for(Object ref:obj) {
			System.out.println(ref);
		}

	}

}
