package Basic_learning;

import java.util.Scanner;

public class Positive_or_negative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n = scan.nextInt();
		if(n<0)
			System.out.println("Is a negative="+n);
		else if(n>0)
		System.out.println("Is a positive="+n);
		else 
			System.out.println("pos or neg"+n);

	}

}
