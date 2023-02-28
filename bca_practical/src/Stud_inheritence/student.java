package Stud_inheritence;

import java.util.Scanner;

public class student  extends person{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = 0,n = 0;
		int result=0;
		double avg=0;

		student stud = new student();
		System.out.println("enter the first name");
		stud.name=scan.next();
		if(stud.getname(stud.name))
				{
					System.out.println("enter the second name");
					stud.lastname=scan.next();
					System.out.println("enter the student Id");
					stud.id=scan.nextInt();
					 if(stud.getid(stud.id)) {
						 
					 }
					else {
						System.out.println("invalid number");
						System.exit(0);
					}
					System.out.println("enter the number of subjects=");
					n1 = scan.nextInt();
					int array[] = new int[n1];
					
					System.out.println("enter the "+n1+"subjects");
					for(int i=0;i<n1;i++)
					{
						array[i]=scan.nextInt();
						result = result+array[i];
					}	
				}
		else
		{ 
			System.out.println("Invalid first name.");
			System.exit(0);
		}
		avg=result/n1;
        System.out.println("average"+avg);
		
        
        
        
        
        System.out.println("grade ");
         if(avg>=90&&avg<=100)
        	 System.out.println("Is is O grade");
         else if(avg>=80&&avg<=90)
        	 System.out.println("Is is E grade");
         else if(avg>=70&&avg<=80)
        	 System.out.println("Is is A grade");
         else if(avg>=55&&avg<=70)
        	 System.out.println("Is is P grade");
         else if(avg>=40 && avg<=55)
        	 System.out.println("Is is D grade");
         else if(avg>=0&&avg<=40)
        	 System.out.println("Is is T grade");
        	 
		

	}

	

	

}
