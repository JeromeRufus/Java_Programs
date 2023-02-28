package Selftest;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n,i,j=0;
	System.out.println("enter the array series");
	n = scan.nextInt();
	int array[] = new int[n];
	//int rev[] = new int[n];
	System.out.println("enter the number="+n);
	for( i=0;i<n;i++) {
	array[i] = scan.nextInt();
	}
	
		System.out.println("reverse the array");
		
	for( i=n-1;i>=0;i--) {
		//rev[j]=array[i];
		//j=j+1;
		System.out.println(array[i]);
	}
		

	}

}
