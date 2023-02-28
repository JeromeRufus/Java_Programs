package Student;

import java.util.HashMap;
import java.util.Map;

public class Student_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = null;
		int Dno = 0,Number = 0;
		Student obj = new Student("Jerome",644,012345) ; 
		Student obj1 = new Student("Sibi", 623,123456);
		
		
		Map ref = new HashMap();
		ref.put(1, obj.StudentDno);
		System.out.println(ref.get(1));
		
		
		
		
		
	
		
		
		
		
		

	}

}
