package Collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Character>  obj =  new ArrayList();
		obj.add('j');
		obj.add('A');
		obj.add('V');
		obj.add('A');
		System.out.println(obj);
		System.out.println(obj.contains('V'));
		for(Object ref:obj) {
			System.out.println(ref);
		}
		

	}

}
