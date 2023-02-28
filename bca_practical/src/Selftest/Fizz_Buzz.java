package Selftest;

import java.util.Scanner;

public class Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("Fizz Buzz");
		}
		else if(n%3==0) {
			System.out.println("Fizz");
		}
		else if(n%5==0) {
			System.out.println("Buzz");
		}

	}

}
