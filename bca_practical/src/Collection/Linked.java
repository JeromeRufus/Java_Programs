package Collection;

import java.util.LinkedList;
import java.util.List;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>obj = new LinkedList();
		obj.add(123);
		obj.add(123456789);
		System.out.println(obj);
		for(Object ref:obj) {
			System.out.println(ref);
		}

	}

}
