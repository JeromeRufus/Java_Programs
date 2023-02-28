package Selftest;

import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		if(a%2==0) {
			System.out.println("Is a even");
			
		}
		else {
			System.out.println("Is a odd");
		}

	}

}
