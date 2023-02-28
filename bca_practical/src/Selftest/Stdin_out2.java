package Selftest;

import java.util.Scanner;

public class Stdin_out2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0;double n2=0.0;String str ;
		System.out.println("enter the integer");
		n=scan.nextInt();
		System.out.println("enter the double");
		n2 = scan.nextDouble();
		System.out.println("enter the string");
		str = scan.next();
		System.out.println("===========================");
		System.out.println(str+"");
		System.out.println(n2);
		System.out.println(n);

	}

}
