package Stud_inheritence;

public class person {
	 String name;
	 String lastname;
	 int id;
	
	
	public person(){
		
	}
	public person(String stdnam,String lastnam,int studid) {
		this.setName(stdnam);
		this.setLastname(lastnam);
		this.getid(studid);
		
		
	}
	
	public  boolean getname(String stdnam) {
		if(stdnam.length()>=1&&stdnam.length()<=10)
			{return true;}
		else
			return false;
		
		
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public boolean getlastname(String lastnam) {
		if(lastnam.length()>=1&&lastnam.length()<=10)
		{ 
			return true;}
		else
		   return false;
			
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public boolean  getid(int studid) {
		if(studid<=7) {
			return true;
		}
		else {
			return false;
		}
	
		
	}
	

}
