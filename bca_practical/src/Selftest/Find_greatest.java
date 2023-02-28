package Selftest;

import java.util.Scanner;


public class Find_greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greatest");
			if(b>a && a<c) {
				System.out.println("a second greatest");
			}
		}
		else if(b>a && b>c) {
				System.out.println("b is greatest");
				if(b<a && b<c) {
					System.out.println("b is second greatest");
				}
		}
		else {
			System.out.println("c is greatest");
		}
		System.out.println("second");
		if(b>a && a<c) {
			System.out.println("a second greatest");
		}
		else if(b<a && b<c) {
			System.out.println("b is second greatest");
		}
		else {
			System.out.println("c is second greatest");
		}
				
			
		
	}
}



	

