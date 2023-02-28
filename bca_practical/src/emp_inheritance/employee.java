package emp_inheritance;

public class employee extends Person{
	
	char desingation,ch;
	int bsal;
	
	
	
	//int empAge = age;	 
	public boolean ValidateAge(int empAge)
	{
		if (empAge<=50) {
			return true;
			}
		else {
			return false;
			}
	}
	
	 public boolean IsValidSalary( int empBasSal) {
		 if(empBasSal>=0) {
			 return true;
		 }
		 else {
			 return false;
			 
		 }
			 
		 }
	
	 
          
	 
	 public boolean check_Sal_Desig_Valid() {
		 
		 if(ch=='M'||ch=='E'||ch=='A')
		 {
				if(desingation == 'M')
				{
					if(bsal>60000) {return true;}
					else {return false;}
				}
				else if(desingation=='E')
				{	 
					if(bsal>50000 && bsal<60000) { return true;}
					else { return false;}
				}
				else if(desingation=='A')
				{	 
					if(bsal>40000 && bsal<50000) {return true;}
					else { return false;}
				}
			 
			 return true;
		 }
			else 
		 {
//				System.out.println("Invalid designation code.");
				return false;
		 } 
	
		}

	
		
	

	
	 }
	 
	 



