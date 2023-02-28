package Basic_learning;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name ;
		System.out.println("enter the string");
		name = scan.next();
		char[] ch=name.toCharArray();
		System.out.println("reverse_string");
		int j = ch.length;
		for(int i=j;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		}
		

	}

}
