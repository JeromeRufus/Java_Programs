package construtor;

import java.util.Scanner;

public class Calculateamount_constructor {

	public static void main(String[] args) {
		Compute_Electricitybill ceb = new Compute_Electricitybill();
		
		Double u;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit consumed: ");
		u = scan.nextDouble();
		
		ceb.billpay(u);

		
		System.out.println("Total Amount: " + ceb.bill);
	}

}
