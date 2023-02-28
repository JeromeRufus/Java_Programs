package Selftest;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n,n2;
		System.out.println("enter the line");
		n = scan.nextInt();
		System.out.println("enter the table");
		n2 = scan.nextInt();
		for(int i=1;i<=n;i++)
			System.out.printf("%d * %d = %d \n",n2,i,n2*i);
		
	
	}

}
