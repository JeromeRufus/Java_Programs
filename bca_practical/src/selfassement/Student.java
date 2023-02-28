package selfassement;

public class Student {
	private int StudentId;
	private String StudentName;
	private String StudentAddress;
	private int StudentMoblieNmber;
	private Profeesor obj ;
	
	public int getStudentId() {
		return StudentId;
		
	}
	public void setStudentId(int Id ) {
		this.StudentId=Id;
	}
	
	public String getStudentName() {
		return StudentName;
		
	}
	
	public void setStudentName(String name) {
		this.StudentName=name;
	}
	
	public String getStudentAddress() {
		return StudentAddress;
		
	}
	public void setStudentAddress(String Address) {
		this.StudentAddress=Address;
	}
	public int getStudentMoblieNumber() {
		return StudentMoblieNmber;
		
	}
	public void setStudentMoblieNumber(int number) {
		this.StudentMoblieNmber=number;
	}
	public Profeesor getProfeesor  () {
		return obj;
	}
	public void setProfessor( Profeesor obj) {
		this.obj=obj;
		
	}

	
	

	

}
