package test;

import java.util.Scanner;

public class Negative {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i,j = 0,n;
		int temp;
		
		int rev = 0;
		n = scan.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter the First Array");
	
		for( i=0;i<n;i++) {
			arr[i] = scan.nextInt();
			
		}
		System.out.println("Enter the Second Array");
		for( i=0;i<n;i++) {
			arr2[i] = scan.nextInt();
			
		}
		
		for(i=0;i<n;i++) {
			arr[i] = arr[i] - arr2[i];
			if(arr[i]<0) {
				System.out.println("The Result  "+arr[i]);
			}
			else if(arr[i]>0) {
				rev = arr[i];
				int Result = rev - arr2[i];
				System.out.println(Result);
				
				if(Result>0) {
				 temp =Result - arr2[i];
				 if(temp<0) {
				 System.out.println(temp);
				 }
				 else if(temp>0) {
					 arr2[i] = temp;
					 int result = arr2[i] - arr2[i];
					 System.out.println(result);
				 }
				 
				}
			}
			
			}
				
			
		}
		

	}



