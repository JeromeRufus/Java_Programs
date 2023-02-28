package emp_inheritance;

public class Salary_compute extends employee {
	
	 
	 boolean checkSal;
	
	public Salary_compute() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double HRA(double bSal) {
		double tmpHRA=0;
		tmpHRA=(double)(bsal *(30/100.0f));
		return tmpHRA;
	}
	
	public double DA(double bSal) {
		double tmpDA;
		tmpDA=(double)bSal*(70/100.0f);
		return tmpDA;
	}
	public double  TELECOM(double bsal) {
		double tmpTele;
        tmpTele=(double)bsal*(7/100.0f);
        return tmpTele;
	}
	

}
