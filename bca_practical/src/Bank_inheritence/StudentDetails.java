package Bank_inheritence;

public class StudentDetails {
	private String StudentName; 
	private int StudentId;
	private int MoblieNo;
	private View_Student obj;
	
	
	public String getStudentName(){  
	return StudentName;  
	}  
 
	public void setStudentName(String name){  
	 this.StudentName=name;  
	}  

	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int id) {
		this.StudentId=id;
	}
	
	public int getMoblieNO() {
		return MoblieNo;
	}
	public void setMoblieNo(int number) {
		this.MoblieNo=number;
	}
	
	
//	public static  View_Student returnobjects() {
//		View_Student obj = new View_Student();
//		return obj;
//		
//	}
}
