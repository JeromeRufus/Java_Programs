package Selftest;

import java.util.Scanner;

public class perfect_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0,n,i=1;
		System.out.println("enter the number");
		n = scan.nextInt();
		if(i<=n/2) 
		 if(n%i==0)
		 {
				 sum += i;{
			       }
			      i++;
			    }
			if(sum==n) {
				System.out.println("perfect");
			}
				else
					System.out.println("not perfect");
				
	}
	
	
			
		
	


}

