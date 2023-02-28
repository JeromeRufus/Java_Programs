package Basic_learning;

import java.util.Scanner;

public class Insert_element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0,n1,n2;
		System.out.println("enter the length");
		n=scan.nextInt();
		int arr[] = new int [n+1];
		System.out.println("enter the number");
		for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
		for(int i=0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("insert the element");
		n2 = scan.nextInt();
		arr[n]=n2;
		System.out.println("after inserting");
		for(int i=0;i<=n;i++)
			System.out.println(arr[i]+",");
		System.out.println(arr[n2-1]);
		
	
		
		
		

	}

}
