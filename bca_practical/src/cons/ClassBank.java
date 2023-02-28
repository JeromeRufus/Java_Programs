package cons;

public class ClassBank {
	int ministatement;
	String Branchname;
	
	ClassBank(){
	
		ministatement=5000;
		Branchname="teppakulam";
	}
	 ClassBank(String Branch,int mini){
		 this();
		ministatement=mini;
		Branchname=Branch;
	
	}
	  void display() {
		  System.out.println(Branchname+        -        +ministatement);
	  }
	  
	
	

}
