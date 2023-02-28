package Looping;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		int i;
		int total = 0;
		double avg;
		
		System.out.println("enter the elements");
		a=scan.nextInt();
		System.out.println("enter the values");
		int[] arr= new int[a];
		for(i=0;i<a;i++) {
			arr[i]=scan.nextInt();	
			total+=arr[i];
		}
		System.out.println(total);
		avg=total/a;
		System.out.println(avg);
		
		
		
		
	
		
		
		
		
	
		
		
		
		
		
		

	}

}
