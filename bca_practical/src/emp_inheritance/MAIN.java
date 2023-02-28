package emp_inheritance;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		
		Salary_compute sal = new Salary_compute();		
	    Scanner scan = new Scanner(System.in);{
		System.out.println("enter the empolyee ID");
		sal.emp_id =scan.next(); 
		System.out.println("enter the employee name");
		sal.name=scan.next();
		System.out.println("enter the employee age");
		sal.age=scan.nextInt();
		
		boolean AgeCheck = sal.ValidateAge(sal.age);
		if (AgeCheck == true)
		{
			System.out.println("enter the  desingation");
			sal.desingation=scan.next().charAt(0);
			System.out.println("enter the basic salary");
			sal.bsal=scan.nextInt();
			boolean CheckSal = sal.IsValidSalary(sal.bsal);
			if (CheckSal == true)
			{
				boolean CheckSalDesig = sal.check_Sal_Desig_Valid();
				if (CheckSalDesig == true)
				{
					double totalSal = sal.bsal + sal.HRA(sal.bsal) + sal.DA(sal.bsal) +sal.TELECOM(sal.bsal);
					System.out.println("Net Salary: " + totalSal);
				}
				else 
				{
					System.out.println("Salary/Designation not matched.");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Salary should be greater than 0.");
				System.exit(0);
			}
	
		}
		else
		{
			System.out.println("Age should be less than 50 years.");
			System.exit(0);
		}
						
		
		 
		
		}
		

	

}
}
