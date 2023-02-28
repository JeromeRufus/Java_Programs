package selfassement;

public class Display_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectReturn obj = new ObjectReturn();
		Profeesor r =obj.objectreturn();
		System.out.println(r.getName());
		System.out.println(r.getSubject());
		
		Student ref = new Student();
		ref.setStudentName("jerome");
		ref.setStudentId(44);
		ref.setStudentAddress("TRZ");
		ref.setStudentMoblieNumber(1234567);
		System.out.println(ref.getStudentName());
		System.out.println(ref.getStudentId());
		System.out.println(ref.getStudentAddress());
		System.out.println(ref.getStudentMoblieNumber());
		
		

	}

}
