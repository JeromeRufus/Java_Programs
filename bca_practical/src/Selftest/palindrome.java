package Selftest;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name ;
		System.out.println("enter the string");
		name = scan.next();
		int  j = name.length();
	
		
		for(int i=j-1;i>0;i--) {
		
		
			j = j + name.charAt(i);  
		}
		      if (name.equals(j)) { 
		         System.out.println("Entered string/number is a palindrome.");  
		      }
		      else  {
		         System.out.println("Entered string/number isn't a palindrome.");
		      }
		

	}

}
