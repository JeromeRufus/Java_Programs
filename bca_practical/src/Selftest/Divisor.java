package Selftest;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int n=0,sum=0;
		System.out.println("enter the number =");
        n=scan.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j*j<=1;j++) {
        		if(i%j==0)
        			System.exit(0);
        		
				if(i/j==1)
        			sum+=j;
        		else 
        		sum+=j+i/j;
        		
        			
        		
        	}
        }

	}

}
