package Basic_learning;

import java.util.Scanner;

public class Average_no {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num1;
		System.out.println("enter the numbewr series:");
		num1 = scan.nextInt();
		int a[] = new int[num1];
		System.out.println("enter the"+num1+"numbers");
		
		int result=0;
		for(int i=0;i<=num1;i++) {
			a[i] = scan.nextInt();
			//
			//for(int i1=0;i1<=num1;i1++)
			result = result+a[i];
			
	
			System.out.println("avergae:"+ result/num1);
		

	}
}
}

