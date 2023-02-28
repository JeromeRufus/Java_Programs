package test;


import java.util.Scanner;

public class test_main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		tes obj = new tes();
//		//reverse String
//		String name;
//		System.out.println("enter the name");
//		name=scan.next();
//		System.out.println("reverse String="+obj.reverse(name));
////		//swap number
//		int a,b;
//		System.out.println("enter the first number");
//		a=scan.nextInt();
//		System.out.println("enter the second number");
//		b=scan.nextInt();
//		obj.result(a, b);
//	
////
////		//vowel
//		String str;
//		System.out.println("enter the letter");
//		str=scan.next();
//		System.out.println(obj.vowel(str));
//		
////		//fibonnacci
		int n;
		System.out.println("enter the series");
		n=scan.nextInt();
		System.out.println(obj.result(n));
//		
////		//palindrone
//		String st;
//		System.out.println("Enter the String");
//		st=scan.next();
//		boolean result=obj.result(st);
//		if(result == true) {
//			System.out.println("Is a palindrome");
//		}
//		else {
//			System.out.println("Is not a palindrome");
//		}
//		//sort 
//		int f = 0;
//		System.out.println("enter the array element");
//		f=scan.nextInt();
//		int[] sor = new int[f];
//		System.out.println("enter the array elements");
//		for(int i=0;i<f;i++) {
//			sor[i]=scan.nextInt();
//		}
//		obj.sor(sor);
//		//concat and split
//		obj.concat();
//		obj.star();
//		obj.star2();
//		obj.star3();
//		obj.duplicate();
		//duplicate
		String dup = "hqiouwhjflkasndffherfhbfyy";
		obj.duplicatestring(dup);
	
//		obj.convert();
//		obj.dateandtime();
//	
		
		

	}

}
