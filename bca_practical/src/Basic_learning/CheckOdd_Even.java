package Basic_learning;

import java.util.Scanner;

public class CheckOdd_Even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("enter the number:");
		num = scan.nextInt();
		if(num%2==0)
			System.out.println("Is even"+num);
		else 
		System.out.println("Is odd"+num);
			
		

	}

}
