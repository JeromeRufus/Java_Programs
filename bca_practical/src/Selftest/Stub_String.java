package Selftest;

import java.util.Scanner;

public class Stub_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s;
		int start;
		int end;
		System.out.println("enter the String");
		s = scan.next();
	
		
		
		System.out.println("enter the start number");
		start = scan.nextInt();
		System.out.println("enter the end number");
		end=scan.nextInt();
		if(start>1 && start<100) {
			
			
		}
		else if(end>1 && end<100) {
			
		}
		else {
			System.out.println("number must be 1 to 100");
		}
		System.out.println(s.substring(start,end));
		

	}

}
