package Selftest;

import java.util.Scanner;

public class Aces_desc {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int j,n,temp;
	System.out.println("enter the series");
	n = scan.nextInt();
	int array[] = new int[n];
	System.out.println("enter the elements");
	 for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	
	for (j=i+1;j<n;j++)
	{
		
			
		if (array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
	
	}
	}
	}
	
	System.out.println("Ascendling order");
	for(int i=0;i<n;i++) {
		System.out.println(array[i]);	
	} 
	System.out.println("descendling order");
	for(int i=n-1;i>=0;i--) {
		System.out.println(array[i]);
	}
	
}
}
