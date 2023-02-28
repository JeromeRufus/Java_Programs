package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkledset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set obj = new LinkedHashSet(); 
		obj.add("Hello Come To Java World");
		obj.add("123");
		obj.add("-1234");
		System.out.println(obj.contains(123));
		for(Object ref:obj) {
			System.out.println(ref);
		}

		

	}

}
