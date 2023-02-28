package arithmetic;

import java.util.Scanner;

public class Divison {
	int a,b,divResult;static int  divcount;
	
	public   int   div() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the a value for div");
		a=scan.nextInt();
		System.out.println("enter the b value for div");
		b=scan.nextInt();
		divResult =a/b;
		divcount++;
		 return divResult;
	}
//	public static Divison returnobject() {
//		Divison obj = new Divison();
//		return obj;
//		
//	}
}
	
	


