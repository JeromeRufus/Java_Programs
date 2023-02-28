package Selftest;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int a = 0,b = 0,n = 0,q;
		System.out.println("enter the queries");
		q = scan.nextInt();
		for( int i=0;i<q;i++) {
		System.out.println("\n enter the A value");
		a = scan.nextInt();
		System.out.println("enter the B value");
		b = scan.nextInt();
		System.out.println("enter the c value");
		n = scan.nextInt();
		int result=0;
		for(int j=0;j<n;j++) {
			if(j==0) {
				 result = result + (a + (int)Math.pow(2,j) * b);
			}
			else {
		        result = result + ((int)Math.pow(2,j) * b);
		        System.out.print(result+" ,");
			}
			for(int k=0;k<n;k++) {
				if(k==0) {
					result=result+(a+(int)Math.pow(2, k)*b);
					
				}
				else {
					result=result+((int)Math.pow(2, k)*b);
				}
			}
		        
		}
		}
	

	}

}
