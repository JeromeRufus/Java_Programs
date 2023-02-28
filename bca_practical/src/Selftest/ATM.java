package Selftest;

import java.util.Scanner;

public class ATM {
	//static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n,TwoCount = 0,FiveCount = 0,TwoHundred = 0,OneHundred = 0,Fifity=0,Lessthan,TotalCount;
		
		
		System.out.println("Enter the Amount");
		n = scan.nextInt();
		if(n<=50) {
			System.out.println("Invalid Amount");
		}
		while(n>=2000) {
			TwoCount = n/2000;
			n = n%2000;
			//System.out.println("Two Thousands Count "+TwoCount);
			System.out.println(TwoCount +" * "+" 2000 "+" = "+TwoCount*2000);
			break;
		}
		while(n>=500) {
			FiveCount = n/500;
			n = n%500;
			//System.out.println("Five Hundred Count "+FiveCount);
			System.out.println(FiveCount +" * "+" 500 "+" = "+FiveCount*500);
			break;
		}
		while(n>=200) {
			TwoHundred = n/200;
			n = n%200;
			//System.out.println("Two Hundred Count "+TwoHundred);
			System.out.println(TwoHundred +" * "+" 200 "+" = "+TwoHundred*200);
			break;
		}
		while(n>=100) {
			OneHundred = n/100;
			n = n%100;
			//System.out.println("one Hundred Count "+OneHundred);
			System.out.println(OneHundred +" * "+" 100 "+" = "+OneHundred*100);
			break;
		}
		while(n>=50) {
			Fifity = n/50;
			n = n%50;
			//System.out.println("Fifties Count "+Fifity);
			System.out.println(Fifity +" * "+" 50 "+" = "+Fifity*50);
			break;
		}
		while(n<50) {
			Lessthan = n;
			
			System.out.println("Remaining Amount = "+Lessthan);
			break;
			
		}
		
		TotalCount = TwoCount+FiveCount+TwoHundred+OneHundred+Fifity;
		System.out.println("TotalCount "+TotalCount);

		
		
		
	}

}
