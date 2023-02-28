package Selftest;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,res=0,a;
		System.out.println("enter the number");
		n =scan.nextInt();
		while (n!=0)
		{
			a=n%10;
			res = (res*10)+a;
			n=n/10;
			System.out.println("reverse number"+res);
			
		}

	}

}
