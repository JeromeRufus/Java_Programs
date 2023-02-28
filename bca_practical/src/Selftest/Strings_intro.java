package Selftest;

import java.util.Scanner;

public class Strings_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A;
		String B;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first word");
		A = scan.next();
		System.out.println("enter the second word");
		B = scan.next();
		 
	int len = A.length();
	int len2= B.length();
	int sum = len+len2;
	System.out.println("The length of the String "+sum);
	 
	
	if(len<len2) {
		System.out.println("yes");
		System.exit(0);
		
	}
	else if(len2<len){
		System.out.println("no");
	}
	  
	
	String firstname = A.substring(0,A.length());
	   String secondname = B.substring(0,B.length());
	   firstname = firstname.toUpperCase();
	   secondname = secondname.toUpperCase();
	   String name=firstname+secondname;
	   
	   System.out.println("captilize="+name);
		
		


	

	}

}
