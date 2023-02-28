package Basic_learning;

import java.util.Scanner;

public class Fibonacci_series {

	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1;
		System.out.println("enter the number of series :");
		 num1 = scan.nextInt();
		 System.out.println("fibonacci series:");
		 int fibo1 = 0,fibo2 = 1,fibnacci ;
		 for(int i=1;i<=num1;i++){
		 fibnacci = fibo1+fibo2;
		 fibo1 = fibo2;
		 fibo2 = fibnacci;
		 System.out.println(fibnacci);
		 }
	
}
}

