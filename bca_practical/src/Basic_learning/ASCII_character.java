package Basic_learning;

import java.util.Scanner;

public class ASCII_character {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
		char character=scan.next().charAt(0);
        System.out.println("ascii value of "+character+" is "+(int)character);
    
  }

	}


