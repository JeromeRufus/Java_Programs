package Exception_handling;
import java.util.Scanner;


public class Valid_rollno {
	
	public static void main(String[] args) 
			throws Invalid_rollNo 
			
	{
		int[] rollNo = {1010,1011,1012,1013};

		Scanner scan = new Scanner(System.in);
		int i,stroll_no;
		
		System.out.println("Enter your roll number: ");
		stroll_no = scan.nextInt();
		try
		{
			
			for (i=0; i < rollNo.length; i++) {
				if(stroll_no==rollNo[i]) {
					System.out.println(rollNo[i] + " is valid.");
					System.exit(0);
					}
				}
			throw new Invalid_rollNo(stroll_no + " is invalid.");
		}
		catch(Invalid_rollNo ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
