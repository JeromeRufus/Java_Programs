package Bank_inheritence;

import java.util.Scanner;

public class View_Student {

	
	public StudentDetails DisplayStudentDetails() {
		Scanner scan = new Scanner(System.in);
		int a, no;
		String name;

		StudentDetails ref = new StudentDetails();
		name = scan.next();
		ref.setStudentName(name);
		a = scan.nextInt();
		ref.setStudentId(a);
		no = scan.nextInt();
		ref.setMoblieNo(no);
		
		System.out.println("Student Name "+ref.getStudentName());
		System.out.println("Student Id "+ref.getStudentId());
		System.out.println("Student Moblie Number "+ref.getMoblieNO());
		return ref;
		
	}		
		
}
