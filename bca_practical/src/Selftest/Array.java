package Selftest;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 0;
	    Scanner scan = new Scanner(System.in);
	    /*System.out.println("array elements");
	    n=scan.nextInt();*/
	    
	    int arr[]=new int[scan.nextInt()];
	    arr[0]=scan.nextInt();
	    System.out.println(Arrays.toString(arr));

	    

	}

}
