package Basic_learning;

import java.util.Scanner;

public class Calculate_dis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mrp,dis;
		System.out.println("enter the price:");
		mrp =scan.nextInt();
		System.out.println("enter the discount:");
		dis = scan.nextInt();
		int discount=0;
		discount = ((mrp*dis)/100);
		System.out.println("discount is"+discount);
	
	}

}
