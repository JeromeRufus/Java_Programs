package Basic_learning;

import java.util.Scanner;

public class vowvels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		 char ch;
		String str = null ;
		
		System.out.println("enter the letter");
		ch = scan.next().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'&& str=="A"||str =="E"||str =="I"||str=="O"||str=="U")
			System.out.println("Is a vowels");
		else
			System.out.println("Is a constant");
			

	}

	

	


}
