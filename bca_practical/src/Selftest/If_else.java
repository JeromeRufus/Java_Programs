package Selftest;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n = scan.nextInt();
		if(n>=2&&n<=5)
			if(n%2==0)
				System.out.println("Is a even so not wired="+n);
			else 
				System.out.println("Is  a odd so wired"+n);
		else if(n>=6&&n<=20)
			if(n%2==0)
				System.out.println("Is a even so not wired="+n);
			else 
				System.out.println("Is  a odd so wired"+n);
		else if(n>=20)
			if(n%2==0)
				System.out.println("Is a even so not wired="+n);
			else 
				System.out.println("Is  a odd so wired"+n);
			
	}

}
