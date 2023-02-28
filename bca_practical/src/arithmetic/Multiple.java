package arithmetic;

import java.util.Scanner;

public class Multiple extends Divison {
	int d,mulResult;static int mulcount;
	
	
	public  int  mul() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the d value for mul");
		d=scan.nextInt();
		int divResult = super.divResult;
		mulResult= divResult * d;
		mulcount++;
	return mulResult;
	}




}
