package Selftest;

import java.util.Scanner;

public class Future_value {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the persent value");
		double pv = scan.nextInt();
		System.out.println("enter the interest");
		double iv = scan.nextDouble();
		System.out.println("enter the period");
		double n=scan.nextInt();
		int fv=0;
		fv = (int) (pv*Math.pow((1+iv), n));
		System.out.println("future value"+fv);
		
		

	}

}
