package Looping;

import java.util.Scanner;

public class ma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//classA cl = new classA();
		int n;
		int max;
		
		System.out.println("enter the array elements");
		n=scan.nextInt();
		int[] a = new int[n];
		System.out.println("enter the values");
		for( int i=0;i<n;i++) {
			a[i]=scan.nextInt(); 
			
		}
//		System.out.println("largrest number");
//		for( i=0;i<n;i++) {
//		System.out.println(a[i]+",");
//		System.out.println("largrest number"+cl.great(a, i));
//		}
		 max=a[0];
		for( int i=0;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
	}


