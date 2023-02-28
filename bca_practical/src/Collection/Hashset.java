package Collection;

import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set ref1 = new TreeSet();
		ref1.add(555);
		ref1.add(-9);
		ref1.add(12);
		for(Object obj1:ref1) {
			System.out.println(obj1);
		}

	}

}
