package Looping;

import java.util.Scanner;

public class Find_second_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n;
		int a = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size");
		n = scan.nextInt();
		int[]arr= new int[n];
		System.out.println("enter the array values");
		for( int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int min ;
		for( int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
				min=arr[i];
				arr[i]=arr[j];
				arr[j]=min;
			}	 
		    }	
	    }
		a=arr[arr.length-(arr.length-1)];
	    System.out.println(a);

}
}
