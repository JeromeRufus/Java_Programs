package Basic_learning;

import java.util.Scanner;

public class Swap_twonum {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		float num1,num2;
		System.out.println("enter the first number");
		num1=scan.nextFloat();
		System.out.println("enter the second number");
		num2 = scan.nextFloat();
	System.out.println("before swap");
	System.out.println("firstnumber"+num1);
	System.out.println("secondnumber"+num2);
	float temp = num1;
	num1 = num2;
	System.out.println("after swap");
	System.out.println("first number"+num1);
	System.out.println("second number"+num2);
	

	}

}
