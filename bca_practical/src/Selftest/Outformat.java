package Selftest;

import java.util.Scanner;

public class Outformat {

	public static void main(String[] args) {
		
		    Scanner scanner =  new Scanner(System.in);

		    for (int i=0;i<3;i++){
		       String string = scanner.next();
		       int num = scanner.nextInt();


		       System.out.printf("%-14s %03d %n", string, num);

	}

}
}
